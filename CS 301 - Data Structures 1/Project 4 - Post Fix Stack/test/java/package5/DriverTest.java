package package5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
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
     * Test of calculations method, of class Driver.
     */
    @Test
    public void testCalculations() {
        System.out.println("\tCalculations Testing");
        
        Stack<Double> stack = new Stack();
        ArrayList arrayOfStrings = new ArrayList<>();
        String fileAsAString = "3 10 5 + *";
        
        Stack expResult = new Stack();
        expResult.push(45.0);
        
        Stack result = Driver.calculations(stack, arrayOfStrings, fileAsAString);
        assertEquals(expResult.pop(), result.pop());
    }

}