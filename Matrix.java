public class Matrix {
    private int[][] matrix;

    //------------------------------------------------------------------
    //  Constructor: Sets up a matrix object with dimension size.
    //------------------------------------------------------------------
    public Matrix(int size) {
        matrix = new int[size][size];

        System.out.println("\tGenerated a " + size + " x " + size +
                           " matrix.\n");
    }

    //------------------------------------------------------------------
    //  Prints out the matrix to the terminal.
    //------------------------------------------------------------------
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

    //------------------------------------------------------------------
    //  Populates the matrix with values from 1 - (size x size).
    //------------------------------------------------------------------
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
}
