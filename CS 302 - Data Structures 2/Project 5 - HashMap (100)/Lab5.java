package Lab5;

import java.io.*;
import java.util.*;

public class Lab5 {

    /**
     * Problem 1: Look through the array and determine what the smallest number is & that it appears at least k times
     * Declare a structure with K,V trait : hashMap | K = arr , V = occurrence
     * if we've already seen this value, +1, else, keep the occurrence at one
     */
    private static int problem1(int[] arr, int k) {
        // Declaration of Data Structures
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Set<Integer> keyStorage = hashMap.keySet();

        // Declaration of Variables
        int answerToReturn = Integer.MAX_VALUE; // stores the maximum number

        //     -- Declaration of Algorithm --
        Arrays.sort(arr);
        // checks to see if the element is already in the list, if not assigns 1. If so +1
        for (int digit : arr) {
            if (hashMap.containsKey(digit))
                hashMap.put(digit, hashMap.get(digit) + 1);
            else
                hashMap.put(digit, 1);
        }

        // Declaration of logic for correct answer return by problem constraints
        for (int key : keyStorage){
            if (hashMap.get(key) >= k)
                answerToReturn = Math.min(answerToReturn,key); // sets the desired answer
        }
            return answerToReturn;
    }

    /**
     * Problem 2: Find two distinct indices i and j such that A[i] = A[j] and |i - j| <= k.
     */
    private static int[] problem2(int[] arr, int k) {
        // Declaration of Data Structures
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        // Declaration of Variables
        int number1 = -1, number2 = -1;

        //     -- Declaration of Algorithm --
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) { // Check if element has already been seen
                if (i - hashMap.get(arr[i]) <= k) { // Checks the difference between the elements
                    number1 = hashMap.get(arr[i]);
                    number2 = i;
                }
            }
            hashMap.put(arr[i], i); // Store the element with its current index in the hash table
        }
        return new int[]{number1, number2};
    }

    // ---------------------------------------------------------------------
    // Do not change any of the code below!

    private static final int LabNo = 5;
    private static final Random rng = new Random(123456);

    private static boolean testProblem1(int[][] testCase) {
        int[] arr = testCase[0];
        int k = testCase[1][0];

        int answer = problem1(arr.clone(), k);

        Arrays.sort(arr);
        for (int i = 0, j = 0; i < arr.length; i = j) {
            for (; j < arr.length && arr[i] == arr[j]; j++) {
            }

            if (j - i >= k) {
                return answer == arr[i];
            }
        }

        return false; // Will never happen.
    }

    private static boolean testProblem2(int[][] testCase) {
        int[] arr = testCase[0];
        int k = testCase[1][0];

        int[] answer = problem2(arr.clone(), k);

        if (answer == null || answer.length != 2) {
            return false;
        }

        Arrays.sort(answer);

        // Check answer
        int i = answer[0];
        int j = answer[1];
        return i != j
                && j - i <= k
                && i >= 0
                && j < arr.length
                && arr[i] == arr[j];
    }

    public static void main(String args[]) {
        System.out.println("CS 302 -- Lab " + LabNo);
        testProblems(1);
        testProblems(2);
    }

    private static void testProblems(int prob) {
        int noOfLines = prob == 1 ? 100000 : 500000;

        System.out.println("-- -- -- -- --");
        System.out.println(noOfLines + " test cases for problem " + prob + ".");

        boolean passedAll = true;

        for (int i = 1; i <= noOfLines; i++) {

            int[][] testCase = null;

            boolean passed = false;
            boolean exce = false;

            try {
                switch (prob) {
                    case 1:
                        testCase = createProblem1(i);
                        passed = testProblem1(testCase);
                        break;

                    case 2:
                        testCase = createProblem2(i);
                        passed = testProblem2(testCase);
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

    private static int[][] createProblem1(int testNo) {
        int size = rng.nextInt(Math.min(1000, testNo)) + 5;

        int[] numbers = getRandomNumbers(size, size);
        Arrays.sort(numbers);

        int maxK = 0;

        for (int i = 0, j = 0; i < size; i = j) {
            for (; j < size && numbers[i] == numbers[j]; j++) {
            }
            maxK = Math.max(maxK, j - i);
        }

        int k = rng.nextInt(maxK) + 1;

        shuffle(numbers);

        return new int[][]{numbers, new int[]{k}};
    }

    private static int[][] createProblem2(int testNo) {
        int size = rng.nextInt(Math.min(1000, testNo)) + 5;

        int[] numbers = getRandomNumbers(size, size);

        int i = rng.nextInt(size);
        int j = rng.nextInt(size - 1);
        if (i <= j) j++;

        numbers[i] = numbers[j];

        return new int[][]{numbers, new int[]{Math.abs(i - j)}};
    }

    private static void shuffle(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int rndInd = rng.nextInt(arr.length - i) + i;
            int tmp = arr[i];
            arr[i] = arr[rndInd];
            arr[rndInd] = tmp;
        }
    }

    private static int[] getRandomNumbers(int range, int size) {
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = rng.nextInt(2 * range) - range;
        }

        return numbers;
    }
}
