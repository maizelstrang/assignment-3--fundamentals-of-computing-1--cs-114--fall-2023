public class Matrix {
    public int[][] matrix;
    int length;

    public Matrix(int size){
        matrix = new int[size][size];
        length = matrix.length;
    }


private void swap(int x1, int y1, int x2, int y2) {
    int value = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = value;
    }


public void printMatrix() {
    for (int row = 0; row < length; row++){
        for (int col = 0; col < length; col++){
            if (row == length - col - 1){
                System.out.print("\t\u001B[33m" + matrix[row][col] + "\u001B[0m");
            }
            else {
                System.out.print("\t" + matrix[row][col]);
            }
        }
    System.out.println("");
    }
}


public void populateMatrix(){
    for (int row = 0; row < length; row++){
        for (int col = 0; col < length; col++){
           matrix[row][col] = col + (row * length) + 1;
        }
    }
}


public void flipMatrix(){
    for (int row = 0; row < length - 1; row++){
        for ( int col = 0; col < length - row - 1; col++){
            swap(row, col, (length - 1 - row),
                (length - 1 - col));
        }
    }
}

}
