/*
 * Project: 
 * Completion time: ? hours
 * 
 * Honor code: “I pledge that I have neither given nor received help from anyone
 * other than the instructor or the TAs for all program components included here.”
 */

import java.util.Random; // imports from class

public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(NewClass.name);
        
        Random rand = new Random(); // creates random numbers 
        double number = 10 + rand.nextInt(10); // says "I want random ints then assignes number from 0-9

        System.out.println("Number is - " + number); // prints out the random number

    }

    public static void method() {

    }
}
