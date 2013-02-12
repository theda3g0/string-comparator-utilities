/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thedaego.stringcomparatorutils;

import java.util.ArrayList;
import java.util.Collections;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

/**
 *
 * @author thedaego
 */
public class ADynamicStringComparatorTest extends TestCase {
    
    public ADynamicStringComparatorTest(String testName) 
    {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of compare method, of class ADynamicStringComparator.
     */
    public void testCompare() 
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("seven");
        list.add("one");
        list.add("four");
        list.add("three");
        list.add("two");
        list.add("six");
        list.add("5");
        list.add("N|ne");
        list.add("eight");
        list.add("zten");
        list.add("aleven");
        list.add("btwelve");
        list.add("dthirteen");
        list.add("cfourteen");
        
        ArrayList<String> desiredOrder = new ArrayList<String>();
        desiredOrder.add("One");
        desiredOrder.add("Two");
        desiredOrder.add("three");
        desiredOrder.add("four");
        desiredOrder.add("5");
        desiredOrder.add("six");
        desiredOrder.add("seven");
        desiredOrder.add("eight");
        desiredOrder.add("n|ne");
        System.out.println("----------------");
        System.out.println("before sort");
        System.out.println("----------------");
        for (String string : list) {
            System.out.println(string);
        }        
        System.out.println("----------------");
        System.out.println("desiredOrder");
        System.out.println("----------------");
        for (String string : desiredOrder) {
            System.out.println(string);
        }
        
        Collections.sort(list, new ADynamicStringComparator(desiredOrder));
        System.out.println("----------------");
        System.out.println("after sort");
        System.out.println("----------------");
        for (String string : list) {
            System.out.println(string);
        }
        
        assertEquals(list.get(0), "one");
        assertEquals(list.get(1), "two");
        assertEquals(list.get(2), "three");
        assertEquals(list.get(3), "four");
        assertEquals(list.get(4), "5");
        assertEquals(list.get(5), "six");
        assertEquals(list.get(6), "seven");
        assertEquals(list.get(7), "eight");
        assertEquals(list.get(8), "N|ne");
        assertEquals(list.get(9), "aleven");
        assertEquals(list.get(10), "btwelve");
        assertEquals(list.get(11), "cfourteen");

    }
}
