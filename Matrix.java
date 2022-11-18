import java.util.*;

public class Matrix {
    private int[][] matrix;
    private int row;
    private int col;

    // Setting up matrix dimensions
    public Matrix(int setRows, int setCols) {
        matrix = new int[setRows][setCols];
        this.row = setRows;
        this.col = setCols;

    }

    // Filling the matrix
    public void fillMatrix(boolean flip) {

        // Check if you want to print the flipped values
        int counter = 0;
        if (flip) {
            counter = this.row * this.col - 1;
        }

        for (int row = 0; row < this.row; row++) {
            for (int col = 0; col < this.col; col++) {
                matrix[row][col] = counter;

                // increment or decrement depending on if flipped
                if (flip) {
                    counter -= 1;
                } else {
                    counter += 1;
                }
            }
        }
    }

    // Creating the empty matrix
    public void printMatrix() {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                int matrixValue = matrix[row][col];
                // This is what will be yellow and what will be white
                if (matrixValue == matrix[row][row]) {
                    System.out.print("\t\u001B[33m" + matrixValue + "\u001B[0m");
                } else {
                    System.out.print("\t" + matrixValue);
                }
            }
            System.out.println("");
        }
    }
}
