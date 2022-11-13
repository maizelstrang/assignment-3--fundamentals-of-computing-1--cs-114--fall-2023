/*
 * I would just like to note that writing this class killed almost every individual brain cell that I have,
 * similarly to sniffing one of those extremely synthetic smelling markers for an extended period of time.
 * Completing this felt so good, but I know that eventually I'm gonna look at this and think "hey this was really bad,
 * I should've just quit programming". Anywho, monologuing my stress levels while making these assignements in the form
 * of comments is suprisingly very relieving. Enjoy.
 */


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
                System.out.print(ANSI_YELLOW);
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
