/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thedaego.stringcomparatorutils;

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
    public void testCompare() {
        System.out.println("compare");
        String s1 = "";
        String s2 = "";
        ADynamicStringComparator instance = null;
        int expResult = 0;
        int result = instance.compare(s1, s2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
