package package3;
import java.util.Scanner;
import java.util.ArrayList;

public class StackOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.print("Please enter five numbers:\n");
        for (int i = 0; i < 5; i++) {
            numbers.add(scanner.nextInt());
        }
        sort(numbers);
        System.out.print("Numbers in increasing order is: ");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void sort(ArrayList<Integer> list) {
        int temp;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    temp = list.get(j);
                    list.set((j), list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}