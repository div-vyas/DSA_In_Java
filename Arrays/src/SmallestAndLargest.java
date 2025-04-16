import java.util.Arrays;
import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = smallestAndLargestElement(arr);
        System.out.println("Smallest "+ ans[0]+" and Largest "+ ans[1]);
    }
    static int[] smallestAndLargestElement(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0],arr[arr.length-1]};
        return ans;
    }
}
