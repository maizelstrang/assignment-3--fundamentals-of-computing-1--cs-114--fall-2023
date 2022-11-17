/*
 * I can't count the times I wanted to sit down and cry making this algorithm
 * Sincerely,
 * Past Justin
 */

public class Matrix {
    private String ANSI_YELLOW = "\u001B[33m";
    private String ANSI_RESET = "\033[0m";
    private int size = 0;
    private int matrix[][];


    public Matrix(int iSize) {
       size = iSize;
       matrix = new int[size][size];

     }


     public void populate() {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                matrix[i][j] = (i * size) + j + 1;
            }
        }
     }

     public void print() {
        int cellToHighlight = size - 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if(cellToHighlight == j) {
                    System.out.print(ANSI_YELLOW);
                    cellToHighlight--;
                } else {
                    System.out.print(ANSI_RESET);
                }
                System.out.print("\t" + matrix[i][j] + " ");
            }
         System.out.println();
        }
     }

      public void swapValues() {
        int cellToHighlight = size - 1;
          for(int i = 0; i < size; i++) {
              for(int j = 0; j < size; j++) {
                if(cellToHighlight == j) {
                    System.out.print(ANSI_YELLOW);
                    cellToHighlight--;
                } else {
                    System.out.print(ANSI_RESET);
                }
                int[][] rotatedMatrix = new int[size][size];
                rotatedMatrix[i][j] = matrix[size - 1 - j][size - 1 - i];
                System.out.print("\t" + rotatedMatrix[i][j] + " ");

              }
              System.out.println();
          }
      }
  }
