import java.util.Scanner;

public class RunMatrix {
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        //Requests from the user a positive number
        //representing the size of a matrix.
        System.out.println("Enter the size of the Matrix");
        int rc = sc.nextInt();
        System.out.println();
        System.out.println();

        //System.out.println("Re-enter the number selected");
        //int c = sc.nextInt();

        //Load table with values.
        int[][]table = new int[rc][rc];
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = (row * rc) + col;
            }

        }
        //Print the table consistant of '0's.
        System.out.println("Here is the table consistent of '0'");


        //Print the original table.
        System.out.println("Here is the Original table");
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++){
                System.out.print(table[row][col] + "\t");
            }
                System.out.println();
        }

        //Print the Inverse Table.
        System.out.print("Here is the Reverse table");
        for (int i = 0; i < table.length/2; i++){
            int temp = table[i];
            table[i] = table[table.length - i - 1];
            table[table.length - i - 1] = temp;
        }
        for (int j = 0; j < table.length; j++){
            for (int i = 0; i < table[j].length / 2; i++){
                int temp = table[j][i];
                table[j][i] = table[j][table[j].length - i - 1];
                table[j][table[j].length - i - 1] = temp;
            }
        }
    //    for (int row = 0; row < table.length; row++) {
    //        for (int col = 0; col < table[row].length; col++){
    //            System.out.print(table[col][row] + "\t");
    //        }
    //            System.out.println();
    //    }
    }
}
