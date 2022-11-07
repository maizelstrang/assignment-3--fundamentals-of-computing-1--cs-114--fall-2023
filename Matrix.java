public class Matrix {
    private int[][] matrix;

    //------------------------------------------------------
    //  Constructor: Sets up a matrix object with dimension
    //  size.
    //------------------------------------------------------
    public Matrix(int size) {
        matrix = new int[size][size];

        System.out.println("\tGenerated a " + size + " x " + size + " matrix.");
    }
}
