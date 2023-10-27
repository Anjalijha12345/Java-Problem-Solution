import java.util.*;
public class MatrixMultiply{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of matrix A: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the number of columns of matrix A: ");
        int m1 = sc.nextInt();
        System.out.println("Enter the number of rows of matrix B: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the number of columns of matrix B: ");
        int m2 = sc.nextInt();
        int[][] A = new int[n1][m1];
        int[][] B = new int[n2][m2];
        if(m1!=n2){
            System.out.println("Matrix A and Matrix B are not of same size");
            System.exit(0);
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                System.out.println("Enter the value of A["+i+"]["+j+"]: ");
                A[i][j] = sc.nextInt();
                System.out.println();
            }
            System.out.println();
        }
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                System.out.println("Enter the value of B["+i+"]["+j+"]: ");
                B[i][j] = sc.nextInt();
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
        int[][] C = new int[n1][m2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                for(int k=0;k<m1;k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
            System.out.println();
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}