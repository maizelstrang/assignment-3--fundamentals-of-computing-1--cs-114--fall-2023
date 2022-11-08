//******************************************************************************
//  Matrix.java
//
//  Creates a matrix object that stores a 2-D array of values.
//******************************************************************************

public class Matrix {
    private int[][] matrix;

    //--------------------------------------------------------------------------
    //  Constructor: Sets up a matrix object with dimension size.
    //--------------------------------------------------------------------------
    public Matrix(int size) {
        matrix = new int[size][size];

        System.out.println("\tGenerated a " + size + " x " + size +
                           " matrix.\n");
    }

    //--------------------------------------------------------------------------
    //  Prints out the matrix to the terminal.
    //--------------------------------------------------------------------------
    public void printMatrix() {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                if (row == (matrix.length - column - 1)) {
                    System.out.print("\t" + matrix[row][column] + "\"");
                }
                else {
                    System.out.print("\t" + matrix[row][column]);
                }
            }

            System.out.println("");
        }

        System.out.println();
    }

    //--------------------------------------------------------------------------
    //  Populates the matrix with values from 1 - (size x size).
    //--------------------------------------------------------------------------
    public void populateMatrix() {
        System.out.print("\tPopulating the matrix... ");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                matrix[row][column] = (column + (row * matrix.length) + 1);
            }
        }

        System.out.println("Matrix populated.");
        System.out.println();
    }

    //--------------------------------------------------------------------------
    //  Flips the matrix across the diagonal that runs from top right
    //  to bottom left.
    //--------------------------------------------------------------------------
    public void flipMatrix() {
        System.out.println("\tFlipping the matrix... ");

        for (int row = 0; row < (matrix.length - 2); row++) {
            for (int column = 0; column < (matrix.length - row - 2); column++) {
                swap(row, column, (matrix.length - column - 1),
                    (matrix.length - row - 1));
            }
        }
    }
}
