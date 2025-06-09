import java.util.Scanner;

public class Rotate90 {
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
        rotate(a, r1);
        printMatrix(a);
    }

    static void printMatrix(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void rotate(int[][] matrix, int r){
        //Transpose
        transposeInPlace(matrix, r, r);
        //ReverseArray
        for(int i=0; i<r; i++){
            reverseArray(matrix[i]);
        }
    }

    static void reverseArray(int[] arr){
        int i=0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void transposeInPlace(int[][]matrix, int r, int c){
        for(int i=0; i<c; i++){
            for(int j=i; j<r;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
