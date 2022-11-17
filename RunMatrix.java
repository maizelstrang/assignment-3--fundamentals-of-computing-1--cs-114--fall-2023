import java.util.Scanner;

public class RunMatrix {
    public static void main(String[] args){
        int inputSize;
        Scanner input = new Scanner(System.in);

        do {
        System.out.println("\nPlease input the desired matrix size:");
        inputSize = input.nextInt();
        } while (inputSize <0);

        Matrix userMatrix;
        userMatrix = new Matrix();

        userMatrix.createMatrix(inputSize);
        userMatrix.printMatrix();
        userMatrix.populateMatrix();
        userMatrix.flipMatrix();

    }
}
