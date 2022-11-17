import java.util.Scanner;

public class RunMatrix {
    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Please enter a number for your matrix:");
        int size = input.nextInt();

        if(size < 2) {
            System.out.println("Please enter an integer greater than or equal to 2");
            System.exit(1);
        }

        Matrix matrix = new Matrix(size);
        System.out.println();
        System.out.println("You requested a Matrix with size: " + size + " x " + size);
        System.out.println();
        System.out.println("Regular Matrix:");
        System.out.println();
        matrix.print();
        System.out.println();
        matrix.populate();
        System.out.println("Populated Matrix:");
        System.out.println();
        matrix.print();
        System.out.println();
        System.out.println("Transposed Matrix:");
        System.out.println();
        matrix.swapValues();


        System.out.println();

    }

}
