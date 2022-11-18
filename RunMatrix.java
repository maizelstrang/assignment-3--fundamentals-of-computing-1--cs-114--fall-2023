import java.util.Scanner;

public class RunMatrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int matrixSize;

        System.out.println("Please enter the desired size of the matrix: ");
        matrixSize = input.nextInt();


        if (matrixSize < 2){
            System.out.println("Error: Number must be 2 or higher");
            System.exit(0);
        }

    System.out.println("You entered: " + matrixSize);
    System.out.println("Your matrix is " + matrixSize + "x" + matrixSize);

    Matrix matrix = new Matrix(matrixSize);
    System.out.println("Blank Matrix: ");
    matrix.printMatrix();

    System.out.println("Filled Matrix: ");
    matrix.populateMatrix();
    matrix.printMatrix();

    System.out.println("Flipped Matrix: ");
    matrix.flipMatrix();
    matrix.printMatrix();


    }

}
