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
        for (int col = 0; col < matrixSize ; col++ ){
            for (int row = 0; row < matrixSize; row++){
                matrix[col][row] = 0;
                System.out.println(matrix[col][row]);
            }
        }
    }


    public void printMatrix(){
        int diagonal = matrixSize-1;

        for (int col = 0; col <= matrixSize ; col++ ){
            for (int row = 0; row < matrixSize; row++){

            }
        }
    }


}
