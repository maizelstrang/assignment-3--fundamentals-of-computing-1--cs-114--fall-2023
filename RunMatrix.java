import java.util.Scanner;

public class RunMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrixSize;

        System.out.println();
        System.out.print("\tEnter the dimension of the matrix: ");
        matrixSize = input.nextInt();

        while (matrixSize < 2) {
            System.out.println("\tInvalid -- input must be at least 2.");
            System.out.println();

            System.out.print("\tEnter the dimension of the matrix: ");
            matrixSize = input.nextInt();
        }
    }
}
