import java.util.Scanner;

public class RunMatrix {
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Please enter a number for your Matrix.");
        int size = input.nextInt();
        Matrix matrix = new Matrix(size);
        matrix.displayMatrix();
        System.out.println();
        matrix.fillMatrix();
        matrix.displayMatrix();
        System.out.println();
        matrix.fillMatrix();
        matrix.flipMatrix();


    }
}
