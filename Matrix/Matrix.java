package Matrix;

import java.util.*;
public class Matrix {
    private int[][] array;

    public int createTable(int size) {
        return size;
        //make table here
    }
    public void populateTable() {
        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                array[row][col] = row*10+col;
            }
        }
    }
    public void returnTable() {

        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[i].length;j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}

//https://stackoverflow.com/questions/20519100/java-how-to-return-in-a-method-multidimensional-array-without-aliasing
