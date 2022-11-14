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

        //Load table with values
        int[][]table = new int[rc][rc];
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = (row * rc) + col;
            }

        }
        //Print the table consistant of 0


        //Print the table
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++){
                System.out.print(table[row][col] + "\t");
            }
                System.out.println();
        }

    //    for (int row = 0; row < table.length; row++) {
    //        for (int col = 0; col < table[row].length; col++){
    //            System.out.print(table[col][row] + "\t");
    //        }
    //            System.out.println();
    //    }
    }
}
