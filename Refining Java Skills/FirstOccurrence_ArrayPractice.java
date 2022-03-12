package package3;

public class FirstOccurrence_ArrayPractice {

    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4,5};
        int size = inputArray.length; // size = 6

        // int result = solution(inputArray, size);
        // System.out.println(result);
        int resultTwo = solutionTwo(inputArray);
    }

    /*
     * Computes the running sum of the array
     */
    public static int solution(int[] arr, int n){
        int runningSum = 0;

        for(int i = 0; i < n; i++)
            runningSum += arr[i];

        return runningSum;
    }

    public static int solutionTwo(int[] arr){
        String tempStorage;

        for(int i = 0; i < arr.length; i++)
            System.out.print (arr[i] + " ");


        return 0;
    }

}
