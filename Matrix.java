public class Matrix {
    private int[][] table;

    public createTable() {
        table = new int[5][5];
        populateTable();
    }
    public populateTable() {
        for (int row = 0; row < table.length; row++){
            for (int col = 0; col < table[row].length; col++){
                table[row][col] = row*10+col;
            }
        }
    }
    public
}
