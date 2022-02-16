
import package2.Sequence;

/** Project: Project2
 * Completion time: 5.5 hours (fill in the time it took you to write the program)
 * Honor Code: “I pledge that I have neither given nor received help from 
 * anyone* other than the instructor or the TAs for all program components 
 * included here.”
 */

public class Driver {

    /**
     * Creates the sequence object and then sets data to the array
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Sequence<String> s = new Sequence<>();

        s.append("Hello Java");
        s.append(", my old fiend");

        System.out.println(s.get(0)); // prints Hello Java
        System.out.println(s.get(1)); // prints ", java my old friend"
        System.out.println(s.get(2)); // prints null, as there is no data
    }
}