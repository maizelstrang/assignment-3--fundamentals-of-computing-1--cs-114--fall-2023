import java.util.Scanner;

public class RunMatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int matrixSize;

		// Ask user for size of matrix
		System.out.print("Enter a size: ");
		matrixSize = input.nextInt();

		// Creating the matrix
		Matrix matrix = new Matrix(matrixSize, matrixSize);

		// Filling the matrix
		matrix.fillMatrix(true);
		matrix.fillMatrix(false);

		// Printing the matrix
		matrix.printMatrix();
	}

}
