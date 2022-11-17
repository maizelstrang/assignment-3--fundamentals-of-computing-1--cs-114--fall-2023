
public class Matrix {
    private String ANSI_YELLOW = "\u001B[33m";
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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
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
          for(int i = 0; i < size; i++) {
              for(int j = 0; j < size; j++) {
                int[][] rotatedMatrix = new int[size][size];
                rotatedMatrix[i][j] = matrix[size - 1 - j][size - 1 - i];
                System.out.print("\t" + rotatedMatrix[i][j] + " ");

              }
              System.out.println();
          }
      }
  }
