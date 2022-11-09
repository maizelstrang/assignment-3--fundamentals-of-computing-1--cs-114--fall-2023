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
                    System.out.print("\t\u001B[33m" + matrix[row][column]
                                    + "\u001B[0m");
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
    //  Swaps the value at (x1, y1) in the matrix with the value at (x2, y2).
    //--------------------------------------------------------------------------
    private void swap(int x1, int y1, int x2, int y2) {
        int temp = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = temp;
    }

    //--------------------------------------------------------------------------
    //  Flips the matrix across the diagonal that runs from top right
    //  to bottom left.
    //--------------------------------------------------------------------------
    public void flipMatrix() {
        System.out.print("\tFlipping the matrix... ");

        for (int column = 0; column < (matrix.length - 1); column++) {
            for (int row = 0; row < (matrix.length - column - 1); row++) {
                swap(row, column, (matrix.length - row - 1),
                    (matrix.length - column - 1));
            }
        }

        System.out.println("Matrix flipped.");
        System.out.println();
    }
}
