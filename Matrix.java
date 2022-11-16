// Create a Constructor
//Method call for the matrix class, setting base parameters.
public class Matrix {
    // starting tablle
    int[][] table;

    //inputing rows and columns
    Matrix(int r,int c){
        table = new int[r][c];

        for(int row = 0; row < table.length ; row++){
            for(int col = 0 ; col < table[row].length ; col++){
                table[row][col] = 0;
            }
        }
    }

    public void printMatrix(){
        for(int row = 0;row < table.length ; row++){
            for(int col = 0 ; col < table[row].length ; col++){
            System.out.print(table[row][col] + " ");
        }
        System.out.println();
    }
}
}
