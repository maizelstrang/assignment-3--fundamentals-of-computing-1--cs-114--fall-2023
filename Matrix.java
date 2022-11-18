public class Matrix {
    private int[][] matrix;
    private int matrixSize;
    final String COLOR = "\033[33m";
    final String RESET = "\033[39m";

    //-----------------------------------------------------------------------------------------------------
    public void createMatrix (int size){
        matrix = new int[size][size];
        matrixSize = size;
        System.out.println("\n" + "Created Matrix size is: " + size + " x " + size);
    }
    //-----------------------------------------------------------------------------------------------------
    private void swap(int x1, int y1, int x2, int y2){
        int temporary = matrix[x1][y1];

        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = temporary;
    }
    //-----------------------------------------------------------------------------------------------------
    public void printMatrix(){
        int diagonalHighlight = matrixSize-1;
        // for (int row = 0; row < matrixSize ; row++ ){
        //     for (int col = 0; col < matrixSize; col++){
        //     matrix[row][col] = 0;
        //     }
        // }

        for (int row = 0; row< matrixSize; row++){
            System.out.println();
            for(int col = 0; col < matrixSize; col++){
                if (diagonalHighlight == col){
                    System.out.printf("%s%d%s", COLOR, matrix[row][col], "\t");
                    diagonalHighlight--;
                } else {
                    System.out.printf("%s%d%s", RESET, matrix[row][col], "\t");
                }
            }
        }
    }

    //-----------------------------------------------------------------------------------------------------
    public void populateMatrix(){
        int diagonalHighlight = matrixSize-1;
        int incrementer = 1;

        for (int row = 0; row < matrixSize ; row++){
            for (int col = 0; col < matrixSize; col++){
                matrix[row][col] = incrementer++;
            }
        }

        System.out.println("\n\nPopulating Matrix...matrix populated");
        System.out.println("\nPrinting matrix:");

        for (int row = 0; row< matrixSize; row++){
            System.out.println();
            for(int col = 0; col < matrixSize; col++){
                if (diagonalHighlight == col){
                    System.out.printf("%s%d%s", COLOR, matrix[row][col], "\t");
                    diagonalHighlight--;
                } else {
                    System.out.printf("%s%d%s", RESET, matrix[row][col], "\t");
                }
            }
        }
    }
    //--------------------------------------------------------------------------------------------------

    // public void flipMatrix(){
    //     int diagonalHighlight = matrix.length-1;
    //     int x2 = matrixSize-1;
    //     int x1 = 0;

    //     System.out.print("\n\nFlipping Matrix...Matrix Flipped");

    //     //This algorithm is for the odd matrix
    //     // if (matrixSize%2 == 1){

    //         for (int row = 0; row < matrixSize ; row++){
    //             int y2 = matrixSize-1;
    //             int y1 = 0;
    //             System.out.println();

    //             for (int col = 0; col < matrixSize; col++){
    //                 if (diagonalHighlight == col){
    //                     System.out.printf("%s%d%s", COLOR, matrix[row][col], "\t");
    //                     diagonalHighlight--;
    //                 } else {

    //                     swap(x1, y1, x2, y2);
    //                     y2--;
    //                     y1++;
    //                     System.out.printf("%s%d%s", RESET, matrix[row][col], "\t");

    //                 }
    //             }
    //             x1++;
    //             x2--;
    //         }

    //     //Algorithm for an even matrix size
    //     // }
    //     // else {
    //         // for (int row = 0; row < matrixSize ; row++){
    //         //     int y2 = matrixSize-1;
    //         //     int y1 = 0;
    //         //     System.out.println();

    //         //     for (int col = 0; col < matrixSize; col++){
    //         //         if (diagonalHighlight == col){
    //         //             System.out.printf("%s%d%s", COLOR, matrix[row][col], "\t");
    //         //             diagonalHighlight--;
    //         //             // if (y1-1 == y2 && x1+1 == x2){
    //         //             //     swap(x1, y1, x2, y2);
    //         //             // }

    //         //         } else {
    //         //             swap(x1, y1, x2, y2);
    //         //             y2--;
    //         //             y1++;
    //         //             System.out.printf("%s%d%s", RESET, matrix[row][col], "\t");
    //         //             if (x1 == (matrixSize/2)-1 && y2 == matrixSize-1){
    //         //                 matrix[row][col]++;
    //         //                 System.out.printf("%s%d%s", RESET, matrix[row][col], "\t");
    //         //             }

    //         //         }
    //         //     }
    //         //     x1++;
    //         //     x2--;
    //         // }
    //     // }

    // }
    //--------------------------------------------------------------------------------------------------
    public void flipMatrixV1(){
        for (int col = 0; col < (matrixSize-1); col++){
            for (int row = 0; row < (matrixSize-1)-col ; row++){
                swap(row, col, ((matrixSize-1)- row), ((matrixSize-1)-col));
            }
        }
        System.out.println();
    }
}
