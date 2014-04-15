/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrixmath;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrey
 */
public class MatrixTest {
    
    public MatrixTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createUnitMatrix method, of class Matrix.
     */
    @Test
    public void testCreateUnitMatrix() {
        System.out.println("createUnitMatrix");
        int rowCount = 0;
        Matrix expResult = null;
        Matrix result = Matrix.createUnitMatrix(rowCount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Matrix.
     */
    @Test
    public void testMultiply() throws Exception {
        System.out.println("multiply");
        Matrix secondMatrix = null;
        Matrix instance = null;
        Matrix expResult = null;
        Matrix result = instance.multiply(secondMatrix);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Matrix.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Matrix instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElements method, of class Matrix.
     */
    @Test
    public void testGetElements() {
        System.out.println("getElements");
        Matrix instance = null;
        double[][] expResult = null;
        double[][] result = instance.getElements();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setElements method, of class Matrix.
     */
    @Test
    public void testSetElements() {
        System.out.println("setElements");
        double[][] elements = null;
        Matrix instance = null;
        instance.setElements(elements);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRowCount method, of class Matrix.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        Matrix instance = null;
        int expResult = 0;
        int result = instance.getRowCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnCount method, of class Matrix.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        Matrix instance = null;
        int expResult = 0;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
