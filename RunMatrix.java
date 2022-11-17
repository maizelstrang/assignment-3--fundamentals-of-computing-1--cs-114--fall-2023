import java.util.Scanner;

public class RunMatrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int matrixSize;

        System.out.println("Please enter the size of your matrix: ");
        matrixSize = scan.nextInt();

        System.out.print("Your matrix is: " + matrixSize); System.out.println("x" +matrixSize);

        System.out.println("Printing matrix with default values...");

        int [][] table = new int [matrixSize][matrixSize];

        for (int row=0; row<matrixSize; row++) {
            for (int col=0; col<matrixSize; col++) {
                System.out.print(table[row][col] +"\t");
            }
            System.out.print("\n");
        }





        }
}
