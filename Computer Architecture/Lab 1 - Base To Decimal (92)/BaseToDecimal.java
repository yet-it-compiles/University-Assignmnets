package Lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Tyler S. Unsworth
 * @SID 42221732
 * @honorCode "I pledge that this submission is solely my work, and that I have neither given, nor received help from
 * anyone."
 *
 * Program asks the user to input a base from 2-9 and will convert it into its equivalent base 10 format.
 */
public class BaseToDecimal {
    public static void main(String[] args) {
        // Declaration of Program Objects
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> arrayOfDigits = new ArrayList<>();

        // Declaration of Program Variables
        final String ERROR_MESSAGE = "Incorrect base system. Please enter a base from 2-9 ";
        int chosenBaseUnit = 0;

        // Declaration of Program Into
        System.out.print("Please enter a base from 2 - 9: ");
        chosenBaseUnit = userInput.nextInt();

        // Declaration of Logic
        while (true) {
            if (chosenBaseUnit >= 2 && chosenBaseUnit <= 9) {
                // Declaration of Program Variables
                String baseNumber = "";
                int convertToNumber, result = 0;

                arrayOfDigits.clear(); // ensures the arrayList is clear through each iteration

                System.out.print("Enter a base " + chosenBaseUnit + " number: ");
                baseNumber = userInput.next();

                // Declaration of String to Integer logic and input into an Array storage container
                for (int i = 0; i < baseNumber.length(); i++) {
                    convertToNumber = Integer.parseInt(String.valueOf(baseNumber.charAt(i)));
                    arrayOfDigits.add(convertToNumber);
                }
                // Declaration of Method Call for Executions Result
                result = baseNumberConversion(chosenBaseUnit, arrayOfDigits);

                // Declaration of Program Outputs
                System.out.println("The equivalent number in base 10 format is " + result);
                System.out.print("\nPlease enter a base from 2 - 9: ");
                chosenBaseUnit = userInput.nextInt();
            } else {
                System.err.print(ERROR_MESSAGE); // prints error message
                chosenBaseUnit = userInput.nextInt();
            }
        }
    }

    /**
     * Defines a general algorithm to convert any numeric base system number to decimal
     *
     * @param choseBaseUnit the users defined choice for a base unit
     * @param arrayOfDigits a storage container for the users base number
     */
    public static int baseNumberConversion(int choseBaseUnit, ArrayList<Integer> arrayOfDigits) {
        // Declaration of method variable
        int result = 0;
        Collections.reverse(arrayOfDigits);
        // Declaration of Algorithm #1
        for (int i = arrayOfDigits.size() - 1; i >= 0; i--) {
            result = (int) Math.pow(choseBaseUnit, i) * (Integer) arrayOfDigits.get(i) + result;
        }
        return result;
    }
}