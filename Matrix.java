import java.util.Scanner;

public class Matrix {


    public static void main(String args[]) {
        int a [][] = new int[3][3],i,j,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix Elements");
        for (i=0;i<3;i++){
            for (j = 0; j < 3; j++){
                System.out.print("Enter Number in Pocket["+i+"]["+j+"]");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is ....");
        for (i = 0; i < 3; i++){
            for(j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for ( i = 0; i<3; i++){
            t = a[0][i];
            a[0][i]= a[3][i];
            a[3][i] = t;

        }
        System.out.println("After Swapping Row of Matrix");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
