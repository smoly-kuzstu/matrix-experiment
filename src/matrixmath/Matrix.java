/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrixmath;

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
    public boolean isExqualMatrix(Matrix secondMatrix){
        return elements.equals(secondMatrix.getElements());
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
