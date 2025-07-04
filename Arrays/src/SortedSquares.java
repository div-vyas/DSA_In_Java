import java.sql.SQLOutput;
import java.util.Scanner;

public class SortedSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: ");
        printArray(arr);
        System.out.println("Sorted Array");
        int[] ans =sortedSquare(arr);
        printArray(ans);
    }

    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static int[] sortedSquare(int[] arr){
        int n = arr.length;
        int left = 0;
         int right = n-1;
         int[] ans = new int[n];
         int k = 0;
         while(left<=right){
             if(Math.abs(arr[left])> Math.abs(arr[right])){
                 ans[k++] = arr[left] * arr[left];
                 left++;
             }
             else{
                 ans[k++] = arr[right] * arr[right];
                 right--;
             }
         }
         reverse(ans);
         return ans;
    }
     static void reverse(int[] arr){
        int i=0, j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
     }
     static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
     }
}
