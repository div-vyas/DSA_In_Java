import java.sql.SQLOutput;
import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        System.out.println("Answer : "+targetSum(arr,target));
    }

    public static int targetSum(int[] arr, int target){
        int ans = 0;
        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
}
