
package package_Stack;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;


public class Main {

    public static void main(String[] args) {
        Stack ofNames = new Stack();
        Stack<String> strings = new Stack<>();

        strings.push("Hello");

        ofNames.push("Tyler");
        ofNames.push("Jessica");
        ofNames.push("Eric");
        ofNames.push("Chloe");
        ofNames.push("Quan");
        ofNames.push("Heaven");

        System.out.println(ofNames);
        System.out.println(ofNames.peek());
        System.out.println(ofNames.addAll(1, strings));

        System.out.println(ofNames);
    }
}
