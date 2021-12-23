package package_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Hello");
        list.add("World");
        list.add("it's been a while");
        list.toArray();

        

        System.out.println(list);
    }
}
