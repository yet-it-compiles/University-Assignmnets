package package3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumProblem {

    public static void main(String[] args) {
        ArrayList<Integer> givenArray = new ArrayList<Integer>();
        givenArray.add(1);
        givenArray.add(2);
        givenArray.add(3);
        givenArray.add(4);
        givenArray.add(5);

        Solution(givenArray);
    }

    public static void Solution(ArrayList<Integer> givenArray){
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        System.out.println(givenArray.size());

        for(int i = 4; i >= 0; i--) {
            myArray.add(givenArray.get(i));
        }

        System.out.println(myArray);
    }
}
