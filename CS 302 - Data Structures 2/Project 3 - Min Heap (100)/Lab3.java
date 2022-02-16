package Project3;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Lab3 {

    private static final int LabNo = 3;
    private static final Random rng = new Random(123456);

    // ---------------------------------------------------------------------
    // Do not change any of the code below!

    /**
     * Problem 1: Use heaps to sort a given array in O(n log k) time.
     */
    private static void problem1(int[] arr, int k) {
        // Declaration of Data Structure
        int[] storage = new int[k + 1];
        MinHeap heap = new MinHeap(k + 1);

        // Declaration of Method Variables
        int indexTracker = 0;

        //   --- Declaration of Algorithm Logic ---

        // Populates heap from array contents
        for (int i = 0; i < k + 1; i++) {
            heap.add(arr[i]);
        }

        for (int i = k + 1; i < arr.length; i++) {
            arr[indexTracker++] = heap.removeMin();
            heap.add(arr[i]);
        }

        while (indexTracker < arr.length) {
            arr[indexTracker++] = heap.removeMin();
        }

    }

    /*
     * An algorithm which determines the maximum amount of memory that can be used, given some amount of hard drives, k.
     */
    private static int problem2(int[] capacities, int k) {
        // Changes each element into a negative
        for (int i = 0; i < capacities.length; i++)
            capacities[i] *= -1;

        // Declaration of Data Structure
        MinHeap maxHeap = new MinHeap(capacities);
        int[] storage = new int[capacities.length];

        // Declaration of Method Variables
        int resultant = 0, currentMax = 0;

        //   --- Declaration of Algorithm Logic ---
        for (int i = 0; i < k; i++) {
            currentMax = maxHeap.removeMin();
            currentMax = (-1 * currentMax);
            resultant += currentMax;
            currentMax = currentMax / 2;
            currentMax = (-1 * currentMax);
            maxHeap.add(currentMax);
        }
        return resultant;
    }

    private static boolean testProblem1(int[][] testCase) {
        int[] arr = testCase[0];
        int k = testCase[1][0];

        int[] testArr = arr.clone();
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);

        problem1(testArr, k);

        // Check if arr is sorted
        for (int i = 0; i < testArr.length; i++) {
            if (arr2[i] != testArr[i]) {
                return false;
            }
        }

        return true;
    }

    private static boolean testProblem2(int[][] testCase) {
        int[] arr = testCase[0];
        int k = testCase[1][0];
        int solution = testCase[1][1];

        int answer = problem2(arr.clone(), k);

        if (solution != answer) {
            System.out.println();
            System.out.println("a: " + answer);
            System.out.println("s: " + solution);
        }

        return solution == answer;
    }

    public static void main(String args[]) {
        System.out.println("CS 302 -- Lab " + LabNo);

        testProblems(1);
        testProblems(2);
    }

    private static void testProblems(int prob) {
        int noOfLines = 100000;

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
                System.out.println("  arr: " + Arrays.toString(testCase[0]));
                System.out.println("    k: " + testCase[1][0]);

                passedAll = false;
                break;
            }
        }

        if (passedAll) {
            System.out.println("All test passed.");
        }
    }

    private static int[][] createProblem1(int testNo) {
        int size = rng.nextInt(Math.min(50, testNo)) + 5;
        int[] k = new int[]{rng.nextInt(size - 3) + 3};

        int[] numbers = getRandomNumbers(size);

        Arrays.sort(numbers);
        Hashtable<Integer, Integer> dic = GetShuffle(size, k);

        int[] buffer = new int[size];

        for (int i = 0; i < size; i++) {
            int shufInd = dic.get(i);
            buffer[shufInd] = numbers[i];
        }

        for (int i = 0; i < size; i++) {
            numbers[i] = buffer[i];
        }

        return new int[][]{numbers, k};
    }

    private static int[][] createProblem2(int testNo) {
        int size = rng.nextInt(Math.min(1024, testNo)) + 5;
        int[] numbers = getRandomNumbers(size);

        int log = 0;
        for (int t = testNo; t > 0; t /= 2, log++) {
        }
        int maxK = rng.nextInt(log * log) + 5;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == 0) numbers[i]++;
            max = Math.max(max, numbers[i]);
        }

        for (int i = 0; i < size; i++) {
            while (numbers[i] < (max + 1) / 2) numbers[i] *= 2;
        }

        int solution = 0;
        int k = -1;
        int maxNum = 1 << 20;

        for (k = 0; k < maxK; k++) {
            int num = -1;
            int r = -1;

            while (size > 1) {
                r = rng.nextInt(size);
                num = numbers[r];

                if (num <= maxNum && num >= (max + 1) / 2) break;

                // Too small; exclude.
                size--;
                numbers[r] = numbers[size];
                numbers[size] = num;
            }

            if (size <= 1) break;

            num = 2 * num + rng.nextInt(2);
            max = Math.max(max, num);

            solution += num;
            numbers[r] = num;
        }

        return new int[][]
                {
                        numbers,
                        new int[]{k, solution}
                };
    }

    private static Hashtable<Integer, Integer> GetShuffle(int size, int[] k) {
        ShuffleItem[] arr = new ShuffleItem[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ShuffleItem();
            arr[i].key = i;
            arr[i].shift = i + rng.nextDouble() * k[0];
        }

        Arrays.sort(arr);

        int minDif = Integer.MAX_VALUE;
        int maxDif = Integer.MIN_VALUE;
        int minDifAbs = Integer.MAX_VALUE;
        int maxDifAbs = Integer.MIN_VALUE;

        Hashtable<Integer, Integer> dict = new Hashtable<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            int dif = i - arr[i].key;

            minDif = Math.min(minDif, dif);
            maxDif = Math.max(maxDif, dif);
            minDifAbs = Math.min(minDifAbs, Math.abs(dif));
            maxDifAbs = Math.max(maxDifAbs, Math.abs(dif));

            dict.put(arr[i].key, i);
        }

        k[0] = maxDifAbs;
        return dict;
    }

    private static void shuffle(int[] arr, int start, int length) {
        // Shuffle
        for (int i = 0; i < length; i++) {
            int baseInd = start + i;
            int rndInd = rng.nextInt(length - i) + baseInd;

            int tmp = arr[baseInd];
            arr[baseInd] = arr[rndInd];
            arr[rndInd] = tmp;
        }
    }

    private static int[] getRandomNumbers(int size) {
        int maxSize = size * 10;

        int[] integers = new int[maxSize];
        for (int i = 0; i < maxSize; i++) {
            integers[i] = i;
        }

        shuffle(integers, 0, integers.length);

        return Arrays.copyOf(integers, size);
    }

    private static class ShuffleItem implements Comparable<ShuffleItem> {
        public int key;
        public double shift;

        @Override
        public int compareTo(ShuffleItem other) {
            Double thisDbl = shift;
            return thisDbl.compareTo(other.shift);
        }
    }

}
