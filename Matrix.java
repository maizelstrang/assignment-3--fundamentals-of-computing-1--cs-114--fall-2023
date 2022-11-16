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
    public void printTable() {

    }
}
