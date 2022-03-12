package package3;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList linky = new LinkedList();

        System.out.println("Linked List Practice: ");
        linky.add("Tyler"); // always is the head
        System.out.println("First element: " + linky.peekFirst());
        linky.add("Jessica");
        System.out.println("First element after adding: " + linky.getFirst());
        System.out.println("Whole Linked List: " + linky);
        System.out.println("After deletion: " + linky.remove());
        System.out.println(linky.indexOf("Jessica"));


/*        Stack stacky = new Stack();
        System.out.println("\nStack Practice: ");
        stacky.push("Tyler");
        System.out.println("First Element: " + stacky.peek());
        stacky.push("Jessica");
        System.out.println("First element after adding: " + stacky.peek());
        System.out.println("Whole Stack: " + stacky);
        System.out.println("After deletion: " + stacky.pop());*/





    }

}
