/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrixL;

/**
 * Clase creada para la manupulación de matrices
 * @author eduar
 */
class Matrix {
    
    String matrixName;
    int col_amount;
    int row_amount;
    
    Matrix(String new_matrixName, int new_row_amount, int new_col_amount)
    {
        this.matrixName = new_matrixName;
        this.col_amount = new_col_amount;
        this.row_amount = new_row_amount;
    }
}
