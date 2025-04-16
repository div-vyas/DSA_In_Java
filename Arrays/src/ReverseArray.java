import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        SwapApproach1(arr);
        swapApproach2(arr);
    }

    public static void SwapApproach1(int[] arr){
        int[] ans = new int[arr.length];
        int j = 0;
        for(int i = arr.length-1; i>=0; i--){
            ans[j++] = arr[i];
        }
        System.out.println("Reversed from approach 1");
        for(int i=0; i< ans.length; i++){
            System.out.print(ans[i]);
        }
        System.out.println();
    }

    public static void swapApproach2(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            i++;
            j--;
        }
        System.out.println("Swap using approach 2");
        for(int k=0; k< arr.length; k++){
            System.out.print(arr[k]);
        }
    }
}
