import java.util.Scanner;

public class RunMatrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int matrixSize, variable, variable2;

        System.out.println("Please enter the size of your matrix: ");
        matrixSize = scan.nextInt();

        System.out.print("Your matrix is: " + matrixSize); System.out.println("x" +matrixSize);

        System.out.println("Printing matrix with default values...");

        int [][] table = new int [matrixSize][matrixSize];

        for (int row=0; row < matrixSize; row++) {
            for (int col=0; col < matrixSize; col++) {
                System.out.print(table[row][col] +"\t");
            }
            System.out.print("\n");
        }

        System.out.println("Populating matrix with values...");

        for (int row=0; row < matrixSize; row++) {
            for (int col=0; col < matrixSize; col++) {
                table[row][col] = row * matrixSize + col +1;
                //"+1" makes it so that printing won't start at 0
                System.out.print(table[row][col] +"\t");
            }
            System.out.print("\n");
        }

        System.out.println("Swapping values across diagonal line...");
        variable = 1;
        variable2 = 1;
        for (int row=0; row < matrixSize; row++) {
            for (int col=0; col < matrixSize; col++) {
                table[row][col] = row * matrixSize + col +1;
                //"+1" makes it so that printing won't start at 0
                for(int i=matrixSize;i>1;i--) for (int k=1;k<matrixSize;k++){
                    for(int j=matrixSize;j>variable;j--) for (int l=variable2; l<matrixSize; l++){
                        table[matrixSize-i][matrixSize-j] = table[matrixSize-k][matrixSize-l];
                    }
                    variable++;
                    variable2--;
                }



                System.out.print(table[row][col] +"\t");
            }
            System.out.print("\n");
        }




        }
}
