import java.util.Scanner;

public class RunMatrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease input the desired matrix size:");
        int inputSize = input.nextInt();


        Matrix userMatrix;
        userMatrix = new Matrix();

        userMatrix.createMatrix(inputSize);
        userMatrix.printMatrix();
        userMatrix.populateMatrix();

    }
}
