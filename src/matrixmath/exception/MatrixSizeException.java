/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrixmath.exception;

/**
 *
 * @author Andrey
 */
public class MatrixSizeException extends Exception{

    @Override
    public String getMessage() {
        return "Error in matrix sizes.ColCount(A) should be = RowCount(B)"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
