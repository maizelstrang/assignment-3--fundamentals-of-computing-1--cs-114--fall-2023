public class Matrix {
    private int[][] matrix;
    private int matrixSize;
    final String COLOR = "\033[33m";
    final String RESET = "\033[39m";

    public void createMatrix (int size){
        matrix = new int[size][size];
        matrixSize = size;
        System.out.println("\n" + "Created Matrix size is: " + size + " x " + size);
    }

    public void printMatrix(){
        for (int row = 0; row < matrixSize ; row++ ){
            for (int col = 0; col < matrixSize; col++){
                matrix[row][col] = 0;
            }
        }
    System.out.println("\nPrinting matrix with default values:");
        for (int row = 0; row< matrixSize; row++){
            System.out.println();

            for(int col = 0; col < matrixSize; col++){
            System.out.printf("%d%s", matrix[row][col], "\t");
            }
        }
    }

    public void populateMatrix(){
        for (int row = 0; row < matrixSize ; row++ ){
            for (int col = 0; col < matrixSize; col++){
                matrix[row][col] += (col+row);
            }
        }
        System.out.println("\nPrinting matrix with default values:");
        for (int row = 0; row< matrix.length; row++){
            System.out.println();

            for(int col = 0; col < matrix.length; col++){
            System.out.printf("%d%s", matrix[row][col], "\t");
            }
        }
    }

    // public void printMatrix(){
    //     System.out.println("\nPrinting matrix with default values:");
    //     for (int row = 0; row< matrixSize; row++){
    //         System.out.println();

    //         for(int col = 0; col < matrixSize; col++){
    //         System.out.printf("%d%s", matrix[row][col], "\t");
    //         }
    //     }
    // }

}
