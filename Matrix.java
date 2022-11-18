public class Matrix{
    private int [][] matrix;

    public Matrix (int matrixSize) {
        matrix = new int [matrixSize][matrixSize];

    }

    //Create the unpopulated matrix
    public void defaultMatrix () {
        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix.length; column++) {
                //This denotes what text is yellow and what remains white
                if (row == (matrix.length - column -1)) {
                    System.out.print("\t\u001B[33m" + matrix[row][column]
                    + "\u001B[0m");
                }
                else{
                    System.out.print("\t" + matrix[row][column]);
                }
            }
            System.out.println("");
        }
        System.out.println();
    }

    //populate the matrix
    public void populateMatrix() {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                matrix [row][column] = (column + (row * matrix.length) +1);
            }
        }
        System.out.println();
    }

    //swap the value at (x1,y1) with the value at (y1,y2)
    private void swapValues(int x1, int y1, int x2, int y2) {
        int temporaryValue = matrix[x1][y1];
        matrix[x1][y1] = matrix [x2][y2];
        matrix [x2][y2] = temporaryValue;
    }

    //Flip the matrix using the swapValues method
    public void flipMatrix() {
        for (int column = 0; column < (matrix.length - 1); column++) {
            for (int row = 0; row < (matrix.length - column -1); row++) {
                swapValues (row, column, (matrix.length - row - 1), (matrix.length - column -1));
            }
        }
        System.out.println();
    }

    }


