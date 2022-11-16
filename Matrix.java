public class Matrix {
    private int[][] table;

    public void createTable(int size) {
        table = new int[size][size];
        populateTable();
    }
    public void populateTable() {
        for (int row = 0; row < table.length; row++){
            for (int col = 0; col < table[row].length; col++){
                table[row][col] = row*10+col;
            }
        }
    }
    public int[][] returnTable(int RowIndex, int ColIndex) {
        return table;
    }
}

//https://stackoverflow.com/questions/20519100/java-how-to-return-in-a-method-multidimensional-array-without-aliasing
