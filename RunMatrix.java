import java.util.Scanner;

public class RunMatrix {

    public static void main(String[] args) {

        //scanner is place so that it focus just in the number of the user input.
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the Matrix:\n");
        //define size as the input in order to set the matrix size
        int size = scan.nextInt();
        //Create a matrix object that can runs methods, when calling this line it calls the construct
        Matrix m1 = new Matrix(size,size);
        m1.printMatrix();
    }
}
        //Requests from the user a positive number
        //representing the size of a matrix
        //System.out.println("Enter the size of the Matrix");
        //int a = sc.nextInt();
        //System.out.println();
        //System.out.println();

        //int value = 0;

        //System.out.println("Re-enter the number selected");
        //int c = sc.nextInt();
        //rc is the size of the matrix in rows and columns
        //Load table with values
        //int[][] table = new int[a][a];
        //for (int row = 0; row < table.length; row++) {
            //for (int col = 0; col < table[row].length; col++) {
                //table[row][col] = value++; // (row * rc) + col;
            //}

        //}
        //Print the table consistant of '0's
        // System.out.println("Here is the table consistent of '0'");
        // for (int row = 0; row < table.length; row++) {
        //     for (int col = 0; col < table[row].length; col++) {
        //         table[row][col] = 0;
        //         System.out.print(table[row][col] + "\t");
        //     }
        //         System.out.println();
        // }
        //Print the original table
        //System.out.println("Here is the Original table");
        //int count = 0;
        //for (int row = 0; row < table.length; row++) {
            //for (int col = 0; col < table[row].length; col++){

                //System.out.println(table[row][col]);

                //table[row][col] = row + col;
                //table[row][col] = count;
                //count++;
                //System.out.print(table[row][col] + "\t");
            //}
                //System.out.println();


        //Print the Reverse table
        //System.out.println("Here is the Reverse table");
        //count = (a*a)-1;
        //for (int row = 0; row < table.length; row++) {
            //for (int col = 0; col < table[row].length; col++){
                //table[row][col] = row + col;
                //table[row][col] = count;
                //count--;
                //System.out.print(table[row][col] + "\t");
            //}
                //System.out.println();

        //}
    //}
