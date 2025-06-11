import java.util.Scanner;

public class GenerateSpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        int[][] matrix = generateSpiralMatrix(n);
        printMatrix(matrix);
    }

    static void printMatrix(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiralMatrix(int n) {
        int topRow = 0, rightCol = n - 1, leftCol = 0, bottomRow = n - 1;
        int curr = 1;
        int[][] matrix = new int[n][n];
        while (curr <= n*n) {
            // topRow ->  leftCol to RightCol
            for (int i = leftCol; i <= rightCol; i++) {
                matrix[topRow][i] = curr++;
            }
            topRow++;
            // rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow; i++) {
                matrix[i][rightCol] = curr++;
            }
            rightCol--;
            // bottomRow -> rightCol to leftCol
            for (int i = rightCol; i >= leftCol; i--) {
                matrix[bottomRow][i] = curr++;
            }
            bottomRow--;
            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow; i--) {
              matrix[i][leftCol] = curr++;
            }
            leftCol++;
        }
        return matrix;
    }
}
