import java.util.Scanner;

public class Matrix {

    public void matrixAssignment(){

        String yellow = "\u001B[33m";
        String white = "\u001B[37m";

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter the size of your matrix: ");
        int size = userInput.nextInt();

        System.out.println("\n");

        System.out.println("Your matrix is " + size + " x " + size + "\n");

        System.out.println("Printing matrix with default values: ");

        int[][]newArray0 = new int[size][size];

        for (int row = 0; row < newArray0.length; row++){
            for (int col = 0; col < newArray0[row].length; col++){
                newArray0[row][col] = row + col;
            }
        }

        for (int row = 0; row < newArray0[0].length; row++){
            for (int col = 0; col < newArray0.length; col++){
                if( col == newArray0.length - row - 1){
                    System.out.print(yellow + 0 + "\t");
                }
                else{
                    System.out.print(white + 0 + "\t");
                }
            }
            System.out.println("\n");
        }

        System.out.println("Populating matrix...matrix populated");

        System.out.println("\n");

        System.out.println("Printing matrix: ");

        int[][] newArray1 = new int[size][size];

        for (int row = 0, value = 1; row < newArray1.length; row++){
            for (int col = 0; col < newArray1[row].length; col++, value++){
                newArray1[row][col] = value;
            }
        }



        for (int row = 0; row < newArray1[0].length; row++){
            for (int col = 0; col < newArray1.length; col++){
                if( col == newArray1.length - row - 1){
                    System.out.print(yellow + newArray1[row][col] + "\t");
                }
                else{
                    System.out.print(white + newArray1[row][col] + "\t");
                }
            }
            System.out.println("\n");
        }

        System.out.println("\n");

        System.out.println("Flipping matrix...matrix flipped");

        System.out.println("\n");

        System.out.println("Printing flipped matrix: ");

        int[][]newArray2 = new int[size][size];

        for (int value = size * size, row = 0; row < newArray2.length; row++){
            for (int col = 0; col < newArray2[row].length; col++, value--){
                if(col == newArray2.length - row - 1){
                    newArray2[row][col] = newArray1[row][col];
                }
                else{
                    newArray2[row][col] = value;
                }
            }
        }

        for (int row = 0; row < newArray2[0].length; row++){
            for (int col = 0; col < newArray2.length; col++){
                if( col == newArray2.length - row - 1){
                    System.out.print(yellow + newArray2[row][col] + "\t");
                }
                else{
                    System.out.print(white + newArray2[row][col] + "\t");
                }
            }
                System.out.println("\n");
        }
    }
}
