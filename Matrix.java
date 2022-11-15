public class Matrix {
    private int[][] matrix;
    private int matrixSize;


    public int[][] getMatrixSize(){
        return matrix;
    }


    public void createMatrix (int size){
        matrix = new int[size][size];
        matrixSize = size;
        System.out.println("\n" + "Created Matrix size is: " + size + " x " + size);
    }

    public void defaultMatrix(){
        for (int row = 0; row < matrixSize ; row++ ){
            for (int col = 0; col < matrixSize; col++){
                matrix[row][col] = 0;
            }
        }
    }

    public void printDefaultMatrix(){
        System.out.println("\nPrinting matrix with default values:");
        for (int row = 0; row< matrixSize; row++){
            System.out.println();

            for(int col = 0; col < matrixSize; col++){
            System.out.printf("%d%s", matrix[row][col], "\t");
            }
        }
    }

    public void printMatrix(){
        for (int row = 0; row < matrixSize ; row++ ){
            for (int col = 0; col < matrixSize; col++){
                matrix[row][col] = 0;
            }
        }
    }

}
