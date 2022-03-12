package package3;

import java.util.ArrayList;

public class Help{
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        ArrayList<Integer> myArrayList = new ArrayList<>();

        for(int i = myArray.length-1; i >= 0; i--)
            myArrayList.add(myArray[i]);

        System.out.println(myArrayList);



    }
}