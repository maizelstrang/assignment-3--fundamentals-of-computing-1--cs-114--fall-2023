
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

     public void swapValues(int value1, int value2) {
        int temp = 0;
        value1 = temp;
        value1 = value2;
        value2 = temp;
     }

      public void transpose() {
        //Diagonal ends at [size - 1][0]


        int diag = matrix[0][size - 1];

          for(int row = 0; row < size; row++) {
            int topCells = matrix[0][row];
            int bottomCells = matrix[size - 1][size - (row + 1)];
            int diagonals = matrix[row][size - (row + 1)];
            //swapValues(topCells, bottomCells);
            //System.out.print(topCells + " ");
            //System.out.print(bottomCells + " ");
            System.out.print(diagonals + " ");
              for(int col = 0; col < size; col++) {
                //topCells = matrix[row][col];

                //System.out.print(bottomCells);

              }

          }
      }

  }
