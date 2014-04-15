/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrixexperiment;

import matrixmath.Matrix;

/**
 *
 * @author Andrey
 */
public class MatrixExperiment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        Matrix result ;
        
        try{
             result = instance.multiply(secondMatrix);
             System.out.println(result);
             result.isEqualMatrix(expResult);
        } catch (Exception e){
        }
        
        
    }
    
}
