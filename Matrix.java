public class Matrix {
    private int matrixSize = 0;
    private int matrix[][];
    private String YELLOW = "\u001B[33m";
    private String RESET = "\033[0m";

    public Matrix(int size){
        matrixSize = size;
        matrix = new int [matrixSize][matrixSize];

    }
    public void displayMatrix(){
        int highlight = matrixSize - 1;
        for(int row = 0; row < matrix.length; row++){
            for(int colum = 0; colum < matrix[row].length; colum++){
                if(highlight == colum) {
                    System.out.print(YELLOW);
                    highlight--;
                } else {
                    System.out.print(RESET);
                }
                System.out.print("\t" + matrix[row][colum] + " ");
            }
            System.out.println();
        }
    }
    public void fillMatrix(){
        for(int row = 0; row < matrixSize; row++){
            for(int colum = 0; colum < matrixSize; colum++){
                matrix[row][colum] = (colum + 1) + (row * matrixSize);
            }
        }

    }
    public void flipMatrix(){
        int highlight = matrixSize - 1;
        for(int row = 0; row < matrixSize; row++) {
            for(int colum = 0; colum < matrixSize; colum++) {
              int[][] flipMatrix = new int[matrixSize][matrixSize];
              flipMatrix[row][colum] = matrix[matrixSize - 1 - colum][matrixSize - 1 - row];
              if(highlight == colum) {
                System.out.print(YELLOW);
                highlight--;
            } else {
                System.out.print(RESET);
            }
            System.out.print("\t" + flipMatrix[row][colum] + " ");

            }
            System.out.println();

        }
    }
}
