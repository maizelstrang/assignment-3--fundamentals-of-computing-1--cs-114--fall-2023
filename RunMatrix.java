import java.util.Scanner;
import Matrix.Matrix;

public class RunMatrix {
    public static void main(String[] args){
        Matrix table1;
        int Size;

        Scanner SizeScan = new Scanner(System.in);

        System.out.print("Please enter the size of your matrix: ");
        String SizeInput = SizeScan.nextLine();
        Size = Integer.parseInt(SizeInput);
        table1 = new Matrix(Size);
        System.out.println();
        System.out.println();
        System.out.println("The size of your matrix is: " +
                            SizeInput + " x " + SizeInput);
        System.out.println(" ");
        table1.createTable();
        table1.populateTable();
        table1.printTable();
    }
}
