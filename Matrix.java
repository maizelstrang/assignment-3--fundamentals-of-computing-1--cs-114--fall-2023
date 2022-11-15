public class Matrix {
    private int[][] matrix;
    private int matrixSize;


    public int[][] getMatrixSize(){
        return matrix;
    }


    public void createMatrix (int size){
        matrix = new int[size][size];
        matrixSize = size;
        System.out.println("Created Matrix size is: " + size);
    }

    public void populateMatrix(){
        for (int row = 0; row < matrixSize ; row++ ){
            for (int col = 0; col < matrixSize; col++){
                matrix[row][col] = 0;
            }
        }
    }


    public void printMatrix(){
    for (int row = 0; row< matrixSize; row++){
        System.out.println();
        for(int col = 0; col < matrixSize; col++){
        System.out.printf("%d", matrix[row][col]);
            // System.out.println(matrix[row][col]);
        }
    }

    }


}
