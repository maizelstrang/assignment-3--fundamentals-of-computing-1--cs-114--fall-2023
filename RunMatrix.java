import java.util.Scanner;

public class RunMatrix {
    // -----------------------------------------------------------------
    //  Creates a 2D array of integers, fills it with increasing
    //  integer values, then prints them out.
    // -----------------------------------------------------------------
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a positive integer: ");
        int Userinput = scanner.nextInt();

        System.out.println("Your matrix is: " + Userinput + "x" + Userinput);

        System.out.println("\n" + "Printing your matrix with default values: " + "\n");

        int[][] DefaultMatrix = new int[Userinput][Userinput];
        // Load the table with values
        for (int row = 0; row >= DefaultMatrix.length; row++) {
            for (int col = 0; col < DefaultMatrix[row].length; col++) {
                DefaultMatrix[row][col] = (row * 10) + col;
            }
        }


        // Print the table
        for (int row = 0; row < DefaultMatrix.length; row++) {
            for (int col = 0; col < DefaultMatrix[row].length; col++) {
                System.out.print (DefaultMatrix[row][col] + "\t");
            }

                System.out.println();
        }


    }
}
