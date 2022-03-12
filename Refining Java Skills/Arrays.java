package package3;

public class Arrays {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        int[] myArrayTwo = {4, 5, 6, 7, 8, 9, 10};

        iterate(myArray, myArrayTwo);
        find_occurrence(myArray);
    }

    public static void iterate(int[] myarray, int[] myArrayTwo) {
        for (int i = 0; i <= myarray.length - 1; i++)
            System.out.print(myarray[i] + " ");
        System.out.println();

        System.out.println("Backwards: ");
        for(int i = myArrayTwo.length - 1; i >= 1; i--)
            System.out.print(myArrayTwo[i] + " ");

        for (int each_element : myArrayTwo)
            System.out.print(each_element + " ");
        System.out.println();
    }

    public static void find_occurrence(int[] myarray){


    }

}
