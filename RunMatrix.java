import java.util.Scanner;

public class RunMatrix {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        //Requests from the user a positive number
        //representing the size of a matrix
        System.out.println("Enter the size of the Matrix");
        int rc = sc.nextInt();
        System.out.println();
        System.out.println();

        //System.out.println("Re-enter the number selected");
        //int c = sc.nextInt();
        //rc is the size of the matrix in rows and columns
        //Load table with values
        int[][]table = new int[rc][rc];
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = (row * rc) + col;
            }

        }
        //Print the table consistant of '0's
        System.out.println("Here is the table consistent of '0'");
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = 0;
                System.out.print(table[row][col] + "\t");
            }
                System.out.println();
        }
        //Print the original table
        System.out.println("Here is the Original table");
        int count = 0;
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++){
                //table[row][col] = row + col;
                table[row][col] = count;
                count++;
                System.out.print(table[row][col] + "\t");
            }
                System.out.println();

        }
        //Print the Reverse table
        System.out.println("Here is the Reverse table");
        count = (rc*rc)-1;
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++){
                //table[row][col] = row + col;
                table[row][col] = count;
                count--;
                System.out.print(table[row][col] + "\t");
            }
                System.out.println();

        }
    }
}
