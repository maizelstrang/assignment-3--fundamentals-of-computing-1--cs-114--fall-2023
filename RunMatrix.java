import java.util.Scanner;

public class RunMatrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the desired matrix size:");
        int inputSize = input.nextInt();


        Matrix userMatrix;
        userMatrix = new Matrix();

        // userMatrix.setMatrixSize(inputSize);
        // userMatrix.getMatrixSize();
        userMatrix.createMatrix(inputSize);
        userMatrix.populateMatrix();
        userMatrix.printMatrix();
    }
}
