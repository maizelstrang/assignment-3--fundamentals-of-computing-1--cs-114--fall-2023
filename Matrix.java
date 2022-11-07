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
        System.out.println("\tThe empty matrix:");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                System.out.print("\t" + matrix[row][column]);
            }

            System.out.println("");
        }

        System.out.println();
    }
}
