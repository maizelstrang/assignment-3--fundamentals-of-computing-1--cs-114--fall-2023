import java.util.Scanner;

public class RunMatrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int inputSize = input.nextInt();


        Matrix userMatrix;
        userMatrix = new Matrix();

        userMatrix.setMatrixSize(inputSize);
        userMatrix.createMatrix();
        userMatrix.populateMatrix();







    }
}
