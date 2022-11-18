package Matrix;

public class Matrix {
    private int size;
    private int[][] array;

    public Matrix(int entsize){
        size = entsize;
    }
    public void createTable() {
        array = new int[size][size];
        //make table here
        for (int row =0;row < array.length;row++) {
            for(int col = 0;col < array[row].length;col++){
                System.out.print(array[row][col]+"\t");
                }
            System.out.println();
            }
        }
    public void populateTable() {
        System.out.println();
        System.out.println("Populating Table...");
        System.out.println();
        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                array[row][col] = row*10+col;
            }
        }
    }
    public void printTable() {
        for (int row =0;row < array.length;row++) {
            for(int col = 0;col < array[row].length;col++){
                System.out.print(array[row][col]+"\t");
                }
            System.out.println();
            }
    }
}
