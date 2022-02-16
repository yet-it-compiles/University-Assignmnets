package Project2;

import java.io.*;
import java.util.*;

/**
 * @author Tyler S. Unsworth
 */

public class Lab2 {
    /**
     * An algorithm which places all even numbers in increasing order and at even indices and all odd numbers are in
     * decreasing order at odd indices.
     */
    private static void problem1(int[] arr) {
        // Declaration of Data Structure
        int[] arrayOfDigits = new int[arr.length];

        // Declaration of Method Variables to keep track of index positions
        int evenIndexes = 0, oddIndexes = (arr.length - 1);

        // Declaration of algorithm logic
        Arrays.sort(arr);
        for (int digit : arr) {
            if ((digit % 2) == 0) {
                arrayOfDigits[evenIndexes] = digit;
                evenIndexes += 2; // increment by two to keep even indexes
            } else {
                arrayOfDigits[oddIndexes] = digit;
                oddIndexes -= 2; // decrement by two to keep odd indexes
            }
        }
        System.arraycopy(arrayOfDigits, 0, arr, 0, arr.length);
    }

    /**
     * An algorithm that moves around the elements of an array B that matches the elements of array A
     */
    private static int[] problem2(int[] arr) {
        // Declaration of Objects
        IntKVPair[] kvPair = new IntKVPair[arr.length];

        // Declaration of Variables
        int currentPointer;

        // ==== Declaration of Algorithm Logic ====

        // populates the arr,kv arrays
        for (int i = 0; i < arr.length; i++) {
            currentPointer = arr[i];
            kvPair[i] = new IntKVPair(currentPointer, i);
        }

        Arrays.sort(kvPair); // sorts the current array

        for (int i = 0; i < arr.length; i++) {
            currentPointer = kvPair[i].value;
            arr[currentPointer] = i;
        }
        return arr;
    }

    // ---------------------------------------------------------------------
    // Do not change any of the code below!

    static class IntKVPair implements Comparable<IntKVPair> {
        public int key;
        public int value;

        public IntKVPair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int compareTo(IntKVPair other) {
            return this.key - other.key;
        }

    }


    private static final int LabNo = 2;
    private static final Random rng = new Random(654321);

    private static boolean testProblem1(int[][] testCase) {
        int[] arr = testCase[0];

        int[] answer = arr.clone();
        problem1(answer);

        if (answer == null) return false;
        if (answer.length != arr.length) return false;

        for (int i = 2; i < answer.length; i += 2) {
            if (answer[i] < answer[i - 2]) return false;
        }

        for (int i = 3; i < answer.length; i += 2) {
            if (answer[i] > answer[i - 2]) return false;
        }

        Arrays.sort(arr);
        Arrays.sort(answer);

        for (int i = 0; i < answer.length; i++) {
            if (arr[i] != answer[i]) return false;
        }

        return true;
    }

    private static boolean testProblem2(int[][] testCase) {
        int[] arr = testCase[0];
        int[] solution = testCase[1];

        int[] result = problem2(arr);

        if (result == null || result.length != solution.length) {
            return false;
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] != solution[i]) return false;
        }

        return true;
    }

    public static void main(String args[]) {
        System.out.println("CS 302-- Lab " + LabNo);

        testProblems(1);
        testProblems(2);
    }

    private static void testProblems(int prob) {
        int noOfLines = 10000;

        System.out.println("-- -- -- -- --");
        System.out.println(noOfLines + " test cases for problem " + prob + ".");

        boolean passedAll = true;

        for (int i = 1; i <= noOfLines; i++) {
            boolean passed = false;
            boolean exce = false;

            int[][] line = null;

            try {
                switch (prob) {
                    case 1:
                        line = createProblem1(i);
                        passed = testProblem1(line);
                        break;

                    case 2:
                        line = createProblem2(i);
                        passed = testProblem2(line);
                        break;
                }
            } catch (Exception ex) {
                passed = false;
                exce = true;
            }

            if (!passed) {
                System.out.println("Test " + i + " failed!" + (exce ? " (Exception)" : ""));
                passedAll = false;
                break;
            }
        }

        if (passedAll) {
            System.out.println("All test passed.");
        }

    }

    private static int[][] createProblem1(int lineNo) {
        int maxSize = Math.min(lineNo, 500);
        int size = rng.nextInt(maxSize) + 2;
        size += size % 2;

        int[] numbers = getRandomNumbers(size);

        for (int i = 0; i < size; i++) {
            numbers[i] = 2 * numbers[i] + (i % 2);
        }

        // Shuffle
        for (int i = 0; i < size; i++) {
            int rndInd = rng.nextInt(size - i) + i;

            int tmp = numbers[i];
            numbers[i] = numbers[rndInd];
            numbers[rndInd] = tmp;
        }

        return new int[][]{numbers};
    }

    private static int[][] createProblem2(int lineNo) {
        int maxSize = Math.min(lineNo, 500);
        int size = rng.nextInt(maxSize) + 2;

        int[] numbers = getUniqueRandomNumbers(size);
        Arrays.sort(numbers);

        int[] solution = new int[size];

        for (int i = 0; i < size; i++) {
            solution[i] = i;
        }

        // Shuffle
        for (int i = 0; i < size; i++) {
            int rndInd = rng.nextInt(size - i) + i;

            int tmp = numbers[i];
            numbers[i] = numbers[rndInd];
            numbers[rndInd] = tmp;

            tmp = solution[i];
            solution[i] = solution[rndInd];
            solution[rndInd] = tmp;
        }

        return new int[][]{numbers, solution};
    }

    private static int[] getRandomNumbers(int size) {
        int[] numbers = new int[size];

        int maxVal = size * 10;
        for (int i = 0; i < size; i++) {
            numbers[i] = rng.nextInt(maxVal);
        }

        return numbers;
    }

    private static int[] getUniqueRandomNumbers(int size) {
        int maxSize = size * 10;

        int[] integers = new int[maxSize];
        for (int i = 0; i < maxSize; i++) {
            integers[i] = i;
        }

        // Shuffle
        for (int i = 0; i < maxSize; i++) {
            int rndInd = rng.nextInt(maxSize - i) + i;

            int tmp = integers[i];
            integers[i] = integers[rndInd];
            integers[rndInd] = tmp;
        }

        return Arrays.copyOf(integers, size);
    }
}