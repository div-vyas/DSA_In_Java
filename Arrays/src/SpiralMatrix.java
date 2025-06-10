import java.util.Scanner;

public class SpiralMatrix {
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
        System.out.println("Spiral Matrix");
        spiralMatrix(a, r1, c1);
    }

    static void printMatrix(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void spiralMatrix(int[][] matrix, int r, int c){
        int topRow =0, rightCol = c-1, leftCol = 0, bottomRow = r-1;
        int totalElements = 0;
        while(totalElements < r*c){
            // topRow ->  leftCol to RightCol
            for(int i=leftCol ; i<=rightCol; i++){
                System.out.print(matrix[topRow][i] + " ");
                totalElements++;
            }
            topRow++;
            // rightCol -> topRow to bottomRow
            for (int i=topRow; i<=bottomRow; i++){
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;
            // bottomRow -> rightCol to leftCol
            for (int i=rightCol; i>=leftCol; i--){
                System.out.print(matrix[bottomRow][i] + " ");
                totalElements++;
            }
            bottomRow--;
            // leftCol -> bottomRow to topRow
            for(int i=bottomRow; i>=topRow; i--){
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }
}
