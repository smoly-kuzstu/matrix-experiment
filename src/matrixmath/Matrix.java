/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrixmath;

import java.util.Arrays;
import matrixmath.exception.MatrixSizeException;

/**
 *
 * @author Andrey
 */
public class Matrix {
    protected double[][] elements;
    protected int rowCount;
    protected int columnCount;
    
    public Matrix (int rowCount, int columnCount){
        this.rowCount = rowCount;
        this.columnCount = columnCount;

        elements = new double[rowCount][columnCount];
        
    }
    public Matrix(double [][] initArr) {
        this.rowCount = initArr.length;
        this.columnCount = initArr[0].length;
        elements = initArr;
    }
    /**
     * Создаёт единичную матрицу
     * @param rowCount Количечство строк  
    */
    public static Matrix createUnitMatrix(int rowCount){
        Matrix m = new Matrix(rowCount, rowCount);
        double[][] A = m.getElements();
        for (int i = 0; i < rowCount; i++){
            A[i][i] = 1;
        }
        
        return m;
    }
    
    
    public Matrix multiply(Matrix secondMatrix) throws MatrixSizeException{
        double[][] A, B;

        A = this.getElements();
        B = secondMatrix.getElements();
        
        int m = this.getRowCount();
        int n = this.getColumnCount();
        
        int k = secondMatrix.getColumnCount();
        //ColCount(A) should be = RowCount(B)
        if ( n != secondMatrix.getRowCount() ){
            throw new MatrixSizeException();
        }
        
        Matrix res = new Matrix(m, k);
        double [][] C = res.getElements();
        
        for( int i = 0; i < m; i++){
                for( int j = 0; j < k; j++){
                    C[i][j] = 0;
                    for (int r = 0; r < n; r++){
                        C[i][j] += A[i][r] * B[r][j];
                    }
                }
        }

        return res;
    }

    /**
     * Возвращяет эквивалентны ли по содержимому две матрицы
    */
    public boolean isEqualMatrix(Matrix secondMatrix){
        
        //return 
        int r2 = secondMatrix.getRowCount();
        int c2 = secondMatrix.getColumnCount();
        int r1 = this.getRowCount();
        
        if ( r1 != r2 || this.getColumnCount() != c2){
            return false;
        }
        
        double[][] A = this.getElements();
        double[][] B = secondMatrix.getElements();
        
        for(int i = 0; i < r1; i++){
            if (!Arrays.equals(A[i], B[i])) return false; 
        }
        
        return true;
    }
    
    @Override
    public String toString(){
        String s = "";
        int  r, c;
        
        r = this.getRowCount();
        c = this.getColumnCount();
        double[][] elements = this.getElements();
        
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                s += elements[i][j] + " ";
            }
            
            s += "\n";
        }
        
        return s;
    }
    
    /**
     * @return the elements
     */
    public double[][] getElements() {
        return elements;
    }

    /**
     * @param elements the elements to set
     */
    public void setElements(double[][] elements) {
        this.elements = elements;
    }

    /**
     * @return the rowCount
     */
    public int getRowCount() {
        return rowCount;
    }

    /**
     * @return the columnCount
     */
    public int getColumnCount() {
        return columnCount;
    }
}
