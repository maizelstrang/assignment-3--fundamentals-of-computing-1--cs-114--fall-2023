import java.util.Scanner;

public class RunMatrix {
    public static void main(String[] args){
        int inputSize;
        Scanner input = new Scanner(System.in);

        do {
        System.out.println("\nPlease input the desired matrix size(Greater than One):");
        inputSize = input.nextInt();
        } while (inputSize <1);

        Matrix userMatrix;
        userMatrix = new Matrix();

        userMatrix.createMatrix(inputSize);

        System.out.println("\nPrinting matrix with default values:");

        userMatrix.printMatrix();
        userMatrix.populateMatrix();
        userMatrix.flipMatrixV1();

        System.out.println("\nPrinting flipped matrix:");

        userMatrix.printMatrix();


    }
}
