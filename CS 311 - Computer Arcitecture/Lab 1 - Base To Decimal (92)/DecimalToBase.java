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
 * Program asks the user to input a number in base 10, and the program will then convert that number into its
 * binary and octal translations.
 */
public class DecimalToBase {
    public static void main(String[] args) {
        // Declaration of Program Objects
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> resultArray = new ArrayList<>();

        // Declaration of Program Into
        System.out.print("Please enter a base 10 number: ");
        int baseTenNumber = userInput.nextInt();

        // Declaration of Method Calls Which Returns The Results For Each Base
        ArrayList<String> binaryResult = baseNumberConversion(baseTenNumber, 2);
        Collections.reverse(binaryResult);

        ArrayList<String> octalResult = baseNumberConversion(baseTenNumber, 8);
        Collections.reverse(octalResult);

        ArrayList<String> hexadecimalResult = baseNumberConversion(baseTenNumber, 16);
        Collections.reverse(hexadecimalResult);

        // Declaration of Programs Formatted Result Output
        System.out.println("Base 2: " + binaryResult.toString().replaceAll(",", "")
                .replace("[", " ").replaceAll("]", " "));
        System.out.println("Base 8: " + octalResult.toString().replaceAll(",", "")
                .replace("[", " ").replaceAll("]", " "));
        System.out.println("Base 16: " + hexadecimalResult.toString().replaceAll(",", "")
                .replace("[", " ").replaceAll("]", " "));
    }

    /**
     * Defines a general algorithm to convert a base 10 (decimal number) to binary, octal and hexadecimal
     *
     * @param baseTenNumber     the users base 10 input to convert
     * @param baseToConvertInto is the base to be converted from base 10 decimal
     * @return Array list filled with the converted base 10 number into the desired base
     */
    public static ArrayList<String> baseNumberConversion(int baseTenNumber, int baseToConvertInto) {
        // Declaration of method Object
        ArrayList<String> arrayOfDigits = new ArrayList<>();

        // Declaration of method variables
        int quotient = baseTenNumber;
        int remainder = 0;

        // Declaration of Algorithm #2 logic
        while (quotient != 0) {
            remainder = (quotient % baseToConvertInto);
            quotient = (quotient / baseToConvertInto);

            // Declaration of Binary Calculation Logic
            if (baseToConvertInto == 2 && remainder != 0)
                arrayOfDigits.add(String.valueOf(1));
             else if (baseToConvertInto == 2)
                arrayOfDigits.add(String.valueOf(0));

            // Declaration of Octal Calculation Logic
            if (baseToConvertInto == 8 && remainder != 0)
                arrayOfDigits.add(String.valueOf(remainder));

            // Declaration of Hexadecimal Calculation Logic
            if (baseToConvertInto == 16 && remainder != 0) {
                if (remainder == 10)
                    arrayOfDigits.add("A");
                if (remainder == 11)
                    arrayOfDigits.add("B");
                if (remainder == 12)
                    arrayOfDigits.add("C");
                if (remainder == 13)
                    arrayOfDigits.add("D");
                if (remainder == 14)
                    arrayOfDigits.add("E");
                if (remainder == 15)
                    arrayOfDigits.add("F");
                if (remainder >= 1 && remainder <= 9)
                    arrayOfDigits.add(String.valueOf(remainder));
            }
        }
        return arrayOfDigits;
    }
}