import java.util.Scanner;

public class RunMatrix {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        int matrixSize;

        //Tell the user to input an integer. Then, save the input under matrixSize.
        System.out.println();
        System.out.println("Please enter an integer greater than 1.");
        System.out.println("This will become the size of your matrix.");
        matrixSize = userInput.nextInt();

        Matrix matrix = new Matrix(matrixSize);
        //run the public method defaultMatrix from the Matrix.java document
        matrix.defaultMatrix();

        //run the public method to populate the matrix
        matrix.populateMatrix();
        matrix.defaultMatrix();

        //run the public method to swap the values of the matrix
        matrix.flipMatrix();
        matrix.defaultMatrix();

        userInput.close();
    }
}
