/*
 * Project: 
 * Completion time: ? hours
 * 
 * Honor code: “I pledge that I have neither given nor received help from anyone
 * other than the instructor or the TAs for all program components included here.”
 */
package package4;

import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
        // Declaration of Program Objects
        ListIterator<String> listIterator;
        MyVector vector;
        File file = new File("palindrome.txt");
        Scanner textInput = new Scanner(new File("palindrome.txt"));

        // Declaraion of program calls
        MyVector myVectorArray = (MyVector) getFileContents(textInput, file);
        iteratorTime(myVectorArray);
    }

    /**
     * @param textInput is what reads from the file
     * @param file      refers to the actual file in the program folder
     * @return a MyVector object containing the data from the given file
     */
    public static Object getFileContents(Scanner textInput, File file) {
        double takenFromFile = textInput.nextDouble();

        // Declaration of Method Objects
        double[] fileContents = new double[7];
        ArrayList<Double> arrayListVector = new ArrayList<>();
        MyVector vector;

        takenFromFile = textInput.nextDouble();
        arrayListVector.add(takenFromFile);

        // Declaration of arrayList Population Logic
        while (textInput.hasNextDouble()) {
            takenFromFile = textInput.nextDouble();
            arrayListVector.add(takenFromFile);
        }
        // Transfers elements from arrayList to an array of doubles
        for (int i = 0; i < arrayListVector.size(); i++) {
            fileContents[i] = arrayListVector.get(i);
        }
        return vector = new MyVector(fileContents);
    } // closes whileLoop

    /**
     * Creates two iterators, one that goes forward and another that
     * traverse backwards and then compares
     *
     * @param linkedList a null link list
     * @param myVectorArrayList populated myVector object
     */
    public static void iteratorTime(MyVector myVectorArrayList) {
        List<Double> linkedList = new LinkedList<>();        
        
        // Declaration of LinkedlIst copy
        LinkedList linkedListCopy = (LinkedList) linkedList;

        // Declaration of Program Output
        final String IS_PALINDROME = "Palindrome";
        final String NOT_PALINDROME = "Not Palindrome";

        // Declaration of arraylist to Linked list transfer
        for (int i = 0; i < myVectorArrayList.size(); i++) {
            double transfer = myVectorArrayList.get(i);
            linkedList.add(transfer);
        }

        // Declaration of Iterators
        ListIterator<Double> listIterator = linkedList.listIterator();
        ListIterator<Double> listIteratorCopy = linkedListCopy.listIterator(7);

        while (listIterator.hasNext() & listIteratorCopy.hasPrevious()) {
            double digit = listIterator.next();
            double digit2 = listIteratorCopy.previous();

            if (digit == digit2) {
                System.out.println(IS_PALINDROME);
                break;
            } else {
                System.out.println(NOT_PALINDROME);
                break;
            }
        }
    }
}