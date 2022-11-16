import java.util.Scanner;

import Matrix.Matrix;

public class RunMatrix {
    public static void main(String[] args){
        Matrix table1 = new createTable;

        Scanner SizeScan = new Scanner(System.in);

        System.out.print("Please enter the size of your matrix: ");
        String SizeInput = SizeScan.nextLine();
        System.out.println();
        System.out.println();
        System.out.println("The size of your matrix is: " +
                            SizeInput + " x " + SizeInput);
        table1.returnTable();
    }
}
