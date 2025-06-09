import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of the matrix - 1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [] [] a = new int[r1][c1];
        System.out.println("Enter matrix 1 values");
        for(int i=0; i < r1; i++){
            for (int j=0 ; j<c1; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1");
        printMatrix(a);
        System.out.println("Transpose Matrix");
        int[][] ans = findTranspose(a, r1, c1);
        printMatrix(ans);
    }

    static void printMatrix(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] findTranspose(int[][] matrix, int r, int c){
        int[][] ans = new int[c][r];

        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}
