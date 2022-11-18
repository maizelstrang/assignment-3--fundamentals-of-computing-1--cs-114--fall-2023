
// Create a Constructor
//Method call for the matrix class, setting base parameters.
import java.util.Scanner;

public class Matrix {
// Creating table and naming it as array
    int[][] array;
    //Setting color for the diagnal numbers
    //Terminal must be open in the Windows PowerShell from the app Visual Studio Code
    // Dont use command prompt to open this assignment or else the number will not be color coded.
    final String YELLOW = "\033[33m";
    final String RESET = "\033[39m";

    // starting to load the table and setting its values consistant to zero.
    Matrix(int r, int c) {
        array = new int[r][c];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = 0;
            }
        }
    }
    //Loading values for the populate matrix starting from 1 going to the input given.
    public void populateMatrix() {
        //Prints Matrix With Number inputed by the User.
        System.out.println("Populating Matrix...Matrix Populated");
        System.out.println("Printing Matrix:");
        // Setting X to start the number count from 1 to the number inputed by user.
        int x = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                x++;
                array[row][col] = x;
            }
        }
    }
    //Establishing coordinates to swap numbers from one area to another.
    public void swap(int x1, int y1, int x2, int y2) {
        System.out.println("Printing Swap Matrix");
        int p1 = array[x1][y1];
        int p2 = array[x2][y2];

        array[x1][y1] = p2;
        array[x2][y2] = p1;
    }

    public void printMatrix() {
        //Setting color to the given tables
        int targetX = array.length - 1;
        int targetY = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (row == targetY && col == targetX) {

                    //Printing table with the color given YELLOW = "\033[33m" and
                    //Reset to anulated the continuation of coloring RESET = "\033[39m"
                    System.out.print(YELLOW + array[row][col] + "\t" + RESET);
                    targetX--;
                    targetY++;
                } else {
                    System.out.print(array[row][col] + "\t");
                }
            }
            System.out.println();
        }
    }
    //Flips the contents of the matrix along the diagonal from top right to bottom left
    //highlighting the elements that comprise the diagonal and leaving them untouched/unswapped
    public void flipMatrix() {
        int countX = 0;
        int countY = 0;
        int targetX = array.length - 1;
        int targetY = 0;
        for (int row = array.length - 1; row >= 0; row--) {
            for (int col = array[row].length - 1; col >= 0; col--) {
                if (countY == targetY && countX == targetX) {
                    System.out.print(YELLOW + array[targetY][targetX] + "\t" + RESET);
                    targetX--;
                    targetY++;
                } else {
                    System.out.print(array[row][col] + "\t");
                }
                countX++;
            }
            countX = 0;
            countY++;
            System.out.println();
        }
    }
}
