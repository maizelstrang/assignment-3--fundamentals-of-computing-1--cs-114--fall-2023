//******************************************************************************
//  RunMatrix.java
//
//  Uses the Matrix class to generate a matrix from user input and perform
//  various operations on the matrix.
//******************************************************************************

import java.util.Scanner;

public class RunMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrixSize;

        System.out.println();
        System.out.print("\tEnter the dimension of the matrix: ");
        matrixSize = input.nextInt();
        System.out.println();

        while (matrixSize < 2) {
            System.out.println("\tInvalid -- input must be at least 2.");
            System.out.println("\n");

            System.out.print("\tEnter the dimension of the matrix: ");
            matrixSize = input.nextInt();
        }

        Matrix matrix = new Matrix(matrixSize);

        System.out.println("\tThe empty matrix:");
        matrix.printMatrix();

        matrix.populateMatrix();

        System.out.println("\tThe populated matrix:");
        matrix.printMatrix();

        matrix.flipMatrix();

        System.out.println("\tThe flipped matrix:");
        matrix.printMatrix();

        input.close();
    }
}
