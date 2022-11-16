import java.util.*;
import Matrix.Matrix;

public class RunMatrix {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();

        Scanner SizeScan = new Scanner(System.in);

        System.out.print("Please enter the size of your matrix: ");
        String SizeInput = SizeScan.nextLine();
        System.out.println();
        System.out.println();
        System.out.println("The size of your matrix is: " +
                            SizeInput + " x " + SizeInput);
        // table1.returnTable();
        char[][] twoDarray = returnTable(al);
    }

    private static char[][] returnTable(ArrayList<String> al) {
        return null;
    }
}
