/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Tyler Unsworth
 */
public class SequenceTest {

    public SequenceTest() {
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
     * Test of size method, of class Sequence.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Sequence<String> s = new Sequence<>();
        int expResult = 10;
        int result = s.size();
        assertEquals(expResult, result); // test to check if both equal 10
    }

    /**
     * Test of size method, of class Sequence
     */
    @Test
    public void testSize2() {
        System.out.println("size2");
        Sequence<Integer> s = new Sequence<>();
        int expResult = 10;
        int result = s.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of append method, of class Sequence.
     */
    @Test
    public void testAppend() {
        System.out.println("append");
        Object element = null;
        Sequence instance = new Sequence();
        instance.append(element);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of append method, of class Sequence.
     */
    @Test
    public void testAppend2() {
        System.out.println("append2");
        Object element = "hey";
        Sequence instance = new Sequence();
        instance.append(element);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of get method, of class Sequence.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int k = 0;
        Sequence<String> instance = new Sequence();
        Object expResult = null;
        Object result = instance.get(k);
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class Sequence.
     */
    @Test
    public void testGet2() {
        System.out.println("get2");
        int k = 7;  
        Sequence<Integer> instance = new Sequence();
        Object expResult = 7;
        instance.set(7, k);
        Object result = instance.get(k);
        assertEquals(expResult, result);
    }

    /**
     * Test of set method, of class Sequence. // TODO ; good
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int k = 0;
        int newElement = 123;
        Sequence<Integer> s = new Sequence<>();
        s.set(k, 123);
        assertEquals(newElement, s.get(0));
    }

    /**
     * Test of set method, of class Sequence. // TODO ; good
     */
    @Test
    public void testSet2() {
        System.out.println("set2");
        int k = 0;
        Sequence<String> s = new Sequence<>();
        String newElement = "Hello";
        s.set(k, "Hello");
        assertEquals(newElement, s.get(0));
    }
}
