/*
 * Project: Stack - Reverse Polish
 * Completion time: 6.5 hours
 * 
 * Honor code: “I pledge that I have neither given nor received help from anyone
 * other than the instructor or the TAs for all program components included here.”
 */
package package5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Program reads from a file and takes the contents of the file and places them
 * in a string. Then the string is converted to a String Array then evaluated in
 * reverse polish and added to a stack.
 */
public class Driver {

    public static void main(String[] args) throws FileNotFoundException {
        // Declaration of Program Objects
        File file = new File("sampleOutput.txt");
        Scanner textInput = new Scanner(new File("sampleOutput.txt"));

        // Declaration of Data Structure
        Stack<Double> stack = new Stack<Double>();
        ArrayList<String> arrayOfStrings = new ArrayList<>();

        // Declaration of Program Variable
        String fileContents = textInput.nextLine();

        // Declaration of Program Method Call
        Stack finishedStack = calculations(stack, arrayOfStrings, fileContents);

        // Declaration of Program Output
        System.out.println("\nThe Reverse Polish Evaluation = " + finishedStack);
    }

    /**
     * @param stack empty stack that will contain the result of an operation
     * @param arrayOfStrings contains the double elements in a file
     */
    public static Stack calculations(Stack<Double> stack, ArrayList arrayOfStrings, String fileAsAString) {
        // Declaration of Variables
        boolean isBroken = false;

        // Declaration of Data Structure
        String[] array = fileAsAString.split(" ");

        // Declaration of Stack Calculation Logic
        for (String str : array) {
            if (str.equals("+") && !isBroken) {
                if (stack.size() >= 2) {
                    double d = stack.pop();
                    double n = stack.pop();
                    double result = d + n;
                    stack.push(result);
                } else {
                    isBroken = true;
                }
            } else if (str.equals("-") && !isBroken) {
                if (stack.size() >= 2) {
                    double d = stack.pop();
                    double n = stack.pop();
                    double result = d - n;
                    stack.push(result);
                } else {
                    isBroken = true;
                }
            } else if (str.equals("*") && !isBroken) {
                if (stack.size() >= 2) {
                    double d = stack.pop();
                    double n = stack.pop();
                    double result = d * n;
                    stack.push(result);
                } else {
                    isBroken = true;
                }
            } else if (str.equals("/") && !isBroken) {
                double d = stack.pop();
                double n = stack.pop();
                if (n != 0) {
                    double result = d / n;
                    stack.push(result);
                } else {
                    System.err.println("Cannot divide by zero");
                }
            } else {
                if (!isBroken) {
                    stack.push(Double.parseDouble(str));
                }
            }
        }

        // Declaration of Logic of to many operators
        if (stack.size() == 1) {
            System.err.println("Contents of the stack is successfully pushed");
        } else {
            System.err.println("Stack has to have at least one element");
        }
        return stack;
    }

}
