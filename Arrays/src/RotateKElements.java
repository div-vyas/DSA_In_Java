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
    public static void rotateKElements(int[] arr,int k){
        int n = arr.length;
        int a = k % n;
        int j = 0;
        int[] ans = new int[n];
        for(int i=n-a; i<n; i++){
             ans[j++] = arr[i];
        }
        for(int i=0; i<=n-a-1; i++){
            ans[j++] = arr[i];
        }
        for(int i=0; i<n; i++){
            System.out.print(ans[i]);
        }
    }
}
