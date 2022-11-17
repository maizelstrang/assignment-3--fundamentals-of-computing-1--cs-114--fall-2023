import java.util.Scanner;
public class RunMatrix {
    public static void main (String[] args) {

    int matrixSize;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Matrix size:");
        matrixSize = scan.nextInt();
        Matrix m1 = new Matrix(matrixSize, matrixSize);

        m1.printMatrix();
        m1.populateMatrix();
        m1.Swap(1,1,2,2);
        m1.printMatrix();
        m1.FlipMatrix();

    }
}
