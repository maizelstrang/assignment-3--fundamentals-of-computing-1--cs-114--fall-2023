import java.util.Scanner;

public class RunMatrix {
    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Please enter a number for your matrix:");
        int size = input.nextInt();

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
        matrix.transpose();
        System.out.println("Transposed Matrix:");
        System.out.println();
        matrix.print();
        System.out.println();

    }

}
