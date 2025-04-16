import java.util.Scanner;

public class RotateKElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k ");
        int k = sc.nextInt();
        rotateKElements(arr,k);
    }

    // Approach 1:

//    public static void rotateKElements(int[] arr,int k){
//        int n = arr.length;
//        int a = k % n;
//        int j = 0;
//        int[] ans = new int[n];
//        for(int i=n-a; i<n; i++){
//             ans[j++] = arr[i];
//        }
//        for(int i=0; i<=n-a-1; i++){
//            ans[j++] = arr[i];
//        }
//        for(int i=0; i<n; i++){
//            System.out.print(ans[i]);
//        }
//    }

    // Approach 2 : Without Extra Space

    public static void rotateKElements(int[] arr, int k){
        int n = arr.length;
        int a = k%n;
        reverseArr(arr, 0, n-a-1);
        reverseArr(arr, n-k, n-1);
        reverseArr(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
    }

    public static void reverseArr(int[] arr, int st, int end){
        while(st<end){
            swap(arr, st, end);
            st++;
            end--;
        }
    }

    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
}
