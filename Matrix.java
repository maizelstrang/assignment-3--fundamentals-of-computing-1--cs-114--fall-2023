public class Matrix {
    private int[][] matrix;
    private int matrixSize;
    int row, col;


    public int[][] getMatrixSize(){
        return matrix;
    }


    public void createMatrix (int size){
        matrix = new int[size][size];
        matrixSize = size;
        System.out.println("Created Matrix size is: " + size);
    }

    public void populateMatrix(){
        for (col = 0; col < matrixSize ; col++ ){
            for (row = 0; row < matrixSize; row++){
                matrix[col][row] = 0;
                System.out.println(matrix[col][row]);
            }
        }
    }


    // public void printMatrix(){
    //     for (col = 0; col <= matrixSize ; col++ ){
    //         System.out.println(matrix[col][row]);
    //     }
    // }


}
