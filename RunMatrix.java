import java.nio.file.attribute.UserPrincipal;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class RunMatrix {
    // -----------------------------------------------------------------
    //  Creates a 2D array of integers, fills it with increasing
    //  integer values, then prints them out.
    // -----------------------------------------------------------------
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a positive integer: ");
        int Userinput = scanner.nextInt();

        int Squared = Userinput * Userinput;
        System.out.println("Your number squared is: " + Squared);





    }
}
