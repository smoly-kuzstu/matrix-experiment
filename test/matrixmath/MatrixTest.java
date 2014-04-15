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
        
        int rowCount = 3;
        
        double[][] E = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1},
        }; 
        
        Matrix expResult = new Matrix(E);
        Matrix result = Matrix.createUnitMatrix(rowCount);
        
        assertTrue(result.isEqualMatrix(expResult));
    }

    /**
     * Test of multiply method, of class Matrix.
     */
    @Test
    public void testMultiply() throws Exception {
        System.out.println("multiply");
        
        double[ ][ ] A = { 
            {2, -2}, 
            {4, 3}, 
            {5, 0} 
        };
        
        double[ ][ ] B = { 
            {4, 5, -3}, 
            {-2, 3, 2}
        };
        
        //Expected result
        double [][] C = { 
            {12, 4, -10}, 
            {10, 29, -6},
            {20, 25, -15}
        };
        
        
        Matrix instance = new Matrix(A);
        Matrix secondMatrix = new Matrix(B);
        
        Matrix expResult = new Matrix(C);
        
        Matrix result = instance.multiply(secondMatrix);
        assertTrue(result.isEqualMatrix(expResult));
        
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

   
    
}
