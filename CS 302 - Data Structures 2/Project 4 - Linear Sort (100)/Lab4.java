package Project4;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Lab4 {
    /**
     * Problem: Sort multi-digit integers (with n total digits) in O(n) time.
     * (Technically, it is O(n * b) time. However, since our base b = 128 is constant, it is O(n).)
     */
    private static void problem(byte[][] arr) {
        // Declaration of Method Data Structures
        int[] storage = new int[arr.length + 1]; // contains the lengths of each dimension in arr[]
        int[] count = new int[128]; // maxInteger
        byte[][] doubleStorageArray = new byte[arr.length][];

        // Declaration of Method Variables
        int i = 0, topOfArray = 0;

        //              --- Declaration of Algorithm Logic ---
        while (topOfArray < arr.length) {
            for (int j = topOfArray; j < arr.length; j++) {

                // Checks the existence, and moves the top
                if (arr[j].length > i)
                    count[arr[j][i]]++;
                else {
                    doubleStorageArray[topOfArray] = arr[j];
                    topOfArray++;
                }
            }

            count[0] += -1; // takes care of 0 indexing
            for (int j = 1; j < count.length; ++j)
                count[j] += count[j - 1];

            for (int k = arr.length - 1; k > -1; k--) {
                if (arr[k].length > i) {
                    doubleStorageArray[count[arr[k][i]] + topOfArray] = arr[k];
                    count[arr[k][i]]--;
                }
            }

            System.arraycopy(doubleStorageArray, 0, arr, 0, arr.length);
            Arrays.fill(count, 0);
            i++;
        }
    }

    // ---------------------------------------------------------------------
    // Do not change any of the code below!

    private static final int LabNo = 4;
    private static final Random rng = new Random(654321);

    private static boolean testProblem(byte[][] testCase) {
        byte[][] numbersCopy = new byte[testCase.length][];

        // Create copy.
        for (int i = 0; i < testCase.length; i++) {
            numbersCopy[i] = testCase[i].clone();
        }

        // Sort
        problem(testCase);
        Arrays.sort(numbersCopy, new numberComparator());

        // Compare if both equal
        if (testCase.length != numbersCopy.length) {
            return false;
        }

        for (int i = 0; i < testCase.length; i++) {
            if (testCase[i].length != numbersCopy[i].length) {
                return false;
            }

            for (int j = 0; j < testCase[i].length; j++) {
                if (testCase[i][j] != numbersCopy[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    // Very bad way of sorting.
    private static class numberComparator implements Comparator<byte[]> {
        @Override
        public int compare(byte[] n1, byte[] n2) {
            // Ensure equal length
            if (n1.length < n2.length) {
                byte[] tmp = new byte[n2.length];
                for (int i = 0; i < n1.length; i++) {
                    tmp[i] = n1[i];
                }
                n1 = tmp;
            }

            if (n1.length > n2.length) {
                byte[] tmp = new byte[n1.length];
                for (int i = 0; i < n2.length; i++) {
                    tmp[i] = n2[i];
                }
                n2 = tmp;
            }

            // Compare digit by digit.
            for (int i = n1.length - 1; i >= 0; i--) {
                if (n1[i] < n2[i]) return -1;
                if (n1[i] > n2[i]) return 1;
            }

            return 0;
        }
    }

    public static void main(String args[]) {
        System.out.println("CS 302 -- Lab " + LabNo);
        testProblems();
    }

    private static void testProblems() {
        int noOfLines = 10000;

        System.out.println("-- -- -- -- --");
        System.out.println(noOfLines + " test cases.");

        boolean passedAll = true;

        for (int i = 1; i <= noOfLines; i++) {
            byte[][] testCase = createTestCase(i);

            boolean passed = false;
            boolean exce = false;

            // try {
            passed = testProblem(testCase);
            // } catch (Exception ex) {
            // passed = false;
            // exce = true;
            //  }

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

    private static byte[][] createTestCase(int testNo) {
        int maxSize = Math.min(100, testNo) + 5;
        int size = rng.nextInt(maxSize) + 5;

        byte[][] numbers = new byte[size][];

        for (int i = 0; i < size; i++) {
            int digits = rng.nextInt(maxSize) + 1;
            numbers[i] = new byte[digits];

            for (int j = 0; j < digits - 1; j++) {
                numbers[i][j] = (byte) rng.nextInt(128);
            }

            // Ensures that the most significant digit is not 0.
            numbers[i][digits - 1] = (byte) (rng.nextInt(127) + 1);
        }

        return numbers;
    }

}
