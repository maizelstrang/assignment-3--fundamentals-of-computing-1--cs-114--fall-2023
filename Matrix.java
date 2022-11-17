
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
        int highlight = size - 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if(highlight == j) {
                    System.out.print(ANSI_YELLOW);
                    highlight--;
                } else {
                    System.out.print(ANSI_RESET);
                }
                System.out.print("\t" + matrix[i][j] + " ");
            }
         System.out.println();
        }
     }

     public void swapCells(int value1, int value2) {
        int temp = 0;
        value1 = temp;
        value1 = value2;
        value2 = temp;
     }

      public void swapValues() {
        int highlight = size - 1;
          for(int i = 0; i < size; i++) {
              for(int j = 0; j < size; j++) {
                if(highlight == j) {
                    System.out.print(ANSI_YELLOW);
                    highlight--;
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
