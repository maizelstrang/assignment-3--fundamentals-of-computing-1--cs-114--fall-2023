import java.util.Scanner;

public class RunMatrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int matrixSize, swapperVariable, moveLeftDiagonal, moveDownDiagonal;

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
        swapperVariable = 0;
        moveLeftDiagonal = 1;
        moveDownDiagonal = 0;
        for (int row=0; row < matrixSize; row++) {
            for (int col=0; col < matrixSize; col++) {
                table[row][col] = (matrixSize*matrixSize)-swapperVariable;
                table[moveDownDiagonal][matrixSize-moveLeftDiagonal]= matrixSize+(row*(matrixSize-1));

                System.out.print(table[row][col] +"\t");
                swapperVariable++;

            }
            System.out.print("\n");
            moveDownDiagonal++;
            moveLeftDiagonal++;
        }

    }
}
