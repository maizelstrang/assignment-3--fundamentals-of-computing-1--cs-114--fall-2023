package Matrix;

import java.util.*;
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
                System.out.println();
                }
            }
        }
    }
    // public void populateTable() {
    //     for (int row = 0; row < array.length; row++){
    //         for (int col = 0; col < array[row].length; col++){
    //             array[row][col] = row*10+col;
    //         }
    //     }
    // }
    // public void returnTable() {

    //     for(int i=0;i<array.length;i++) {
    //         for(int j=0;j<array[i].length;j++) {
    //             System.out.println(array[i][j]);
    //         }
    //     }
    // }

//https://stackoverflow.com/questions/20519100/java-how-to-return-in-a-method-multidimensional-array-without-aliasing
