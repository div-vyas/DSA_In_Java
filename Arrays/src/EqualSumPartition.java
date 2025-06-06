import java.util.Scanner;

public class EqualSumPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+ n + " elements");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Equal Partition Possible:" + equalSumPartion(arr));
    }

    static boolean equalSumPartion(int[] arr){
        int totalSum = findArraySum(arr);
        int n = arr.length;
        int prefSum = 0;
        for(int i=0 ; i<n-1; i++){
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if(suffixSum == prefSum){
                return true;
            }
        }
            return false;
    }

    static int findArraySum(int[] arr){
        int totalSum = 0;
         for(int i=0; i<arr.length; i++){
             totalSum += arr[i];
         }
         return totalSum;
    }
}
