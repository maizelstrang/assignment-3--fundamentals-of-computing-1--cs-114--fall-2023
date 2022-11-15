
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

      public void transpose() {
          for(int i = 0; i < matrix.length; i++) {
              for(int j = i + 1; j < matrix.length; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
              }

          }
      }

  }
