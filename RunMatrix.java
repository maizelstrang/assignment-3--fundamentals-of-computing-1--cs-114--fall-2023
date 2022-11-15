import java.util.Scanner;

public class RunMatrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int matrixSize;

        System.out.println("Please enter the size of your matrix: ");
        matrixSize = scan.nextInt();

        System.out.print("Your matrix is: " + matrixSize); System.out.println("x" +matrixSize);
        System.out.println("Printing matrix with default values...");
        for (int column=0; column<matrixSize; column++) {
            for (int row=0; row<matrixSize; row++) {
            System.out.print("0  ");
            }
            System.out.print("\n");
        }




        }
}
