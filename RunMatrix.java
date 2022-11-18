import java.util.Scanner;

public class RunMatrix {

    public static void main(String[] args) {
        // set the arraySize the input that the user will give to the computer
        // Scan the input, scanning just numbers given by user.
        int arraySize;

        Scanner scan = new Scanner(System.in);

        //Printing matrix size as well as the tables from the constructor.
        System.out.println("Enter Matrix Size");
        arraySize = scan.nextInt();
        Matrix table = new Matrix(arraySize, arraySize);
        System.out.println();

        table.printMatrix();
        System.out.println();

        table.populateMatrix();
        table.printMatrix();
        System.out.println();

        table.flipMatrix();
        System.out.println();
        System.out.println();

        table.swap(0, 0, 2, 2);
        table.printMatrix();

    }
}
