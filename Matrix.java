public class Matrix {
    final String YELLOW = "\033[33m";
    final String RESET = "\033[39m";
        int[][] table;

    //Load the 0 table
    Matrix(int rw, int cl) {
    System.out.println("Matrix with default values:");
        table = new int[rw][cl];
            for (int row = 0; row < table.length; row++) {
                for (int col = 0; col < table[row].length; col++) {
                    table[row][col] = 0;
                }
            }
        }

    //Print the 0 table
public void blankMatrix() {
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = 0;
            }
        }
    }

    // Load the incrementing table
public void populateMatrix() {
    System.out.println("\nMatrix:");
        int x = 0;
            for (int row = 0; row < table.length; row++) {
                for (int col = 0; col < table[row].length; col++) {
                x++;
                    table[row][col] = x;
                }
            }
        }

    //Swap Matrix
public void Swap(int x1, int y1, int x2, int y2) {

    int p1 = table[x1][y1];
    int p2 = table[x2][y2];

    table[x1][y1] = p2;
    table[x2][y2] = p1;
    }

    // Print the incrementing table
public void printMatrix() {
    int targetX = table.length - 1;
    int targetY = 0;
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                if (row == targetY && col == targetX) {
            System.out.print (YELLOW + table[row][col] + "\t" + RESET);
                targetX--;
                targetY++;
            }
            else {
            System.out.print (table[row][col] + "\t");
            }
        }
            System.out.println();
    }
}

    // Loads and prints flipped table
public void FlipMatrix() {
    System.out.println("\nFlipped Matrix:");
    int countX = 0;
    int countY = 0;
    int targetX = table.length - 1;
    int targetY = 0;
        for (int row = table.length - 1; row >= 0; row--) {
            for (int col = table[row].length - 1; col >= 0; col--) {
                if (countY == targetY && countX == targetX) {
                    System.out.print (YELLOW + table[targetY][targetX] + "\t" + RESET);
                    targetX--;
                    targetY++;
                }
                else {
                System.out.print (table[row][col] + "\t");
                }
                countX++;
                }
                countX = 0;
                countY++;
                System.out.println();
        }
    }
}
