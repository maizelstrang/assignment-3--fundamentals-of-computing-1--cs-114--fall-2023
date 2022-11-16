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
    public void printMatrix(){
        int diagonalHighlight = matrixSize-1;
        for (int row = 0; row < matrixSize ; row++ ){
                for (int col = 0; col < matrixSize; col++){
                    matrix[row][col] = 0;
                }
        }
        System.out.println("\nPrinting matrix with default values:");

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

        for (int row = 0; row < matrixSize ; row+=matrixSize ){
            for (int col = 0; col < matrixSize; col++){
                matrix[row][col] += (col+row)+1;
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
    private void swapMatrix(int x1, int y1, int x2, int y2){

    }
}