import java.util.Scanner;

public class RunMatrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease input the desired matrix size:");
        int inputSize = input.nextInt();


        Matrix userMatrix;
        userMatrix = new Matrix();

        // userMatrix.getMatrixSize();
        userMatrix.createMatrix(inputSize);
        userMatrix.defaultMatrix();
        userMatrix.printDefaultMatrix();
    }
}
