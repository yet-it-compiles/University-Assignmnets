/*
 * Project: 
 * Completion time: ? hours
 * 
 * Honor code: “I pledge that I have neither given nor received help from anyone
 * other than the instructor or the TAs for all program components included here.”
 */
package package4;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bmxfr
 */
public class DriverTest {

    public DriverTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of iteratorTime method, of class Driver.
     */
    @Test
    public void testIteratorTime() {
        System.out.println("iteratorTime testing method \n");
        double[] array = {1, 2, 3, 4, 3, 2, 1};
        MyVector myVectorArrayList = new MyVector(array);
        List<Double> linkedList = new LinkedList<>();
        List<Double> linkedListCopy;
        boolean expResult = true;
        boolean result = false;

        for (double digit : array) {
            linkedList.add(digit);
        }

        linkedListCopy = linkedList;
        ListIterator<Double> listIterator = linkedList.listIterator();
        ListIterator<Double> listIteratorCopy = linkedListCopy.listIterator(7);

        while (listIterator.hasNext() & listIteratorCopy.hasPrevious()) {
            double digit = listIterator.next();
            double digit2 = listIteratorCopy.previous();

            if (digit == digit2) {
                System.out.println("\nIs Palindrome " + expResult);
                break;
            } else {
                System.out.println("\nIs not Palindrome " + result);
                break;
            }
        }
        Driver.iteratorTime(myVectorArrayList);
    }
}
