public class Matrix {
    private int size;
    private int[][] matrix;
    int matrixSize;


    public int[][] getMatrixSize(){
        return matrix;
    }

    public void setMatrixSize(int inputSize){
        this.size = inputSize;
    }

    public void createMatrix (){
        int[][] matrix = new int[size][size];
        matrixSize = size;
        System.out.println("Created Matrix size is: " + size);
    }

    public void populateMatrix(){
        for (int col = 0; col < matrixSize ; col++ ){
            for (int row = 0; col < matrixSize; row++ ){
            }
        }
    }
}
