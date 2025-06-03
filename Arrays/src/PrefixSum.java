import java.util.Scanner;

public class PrefixSum {
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
        System.out.println("Prefix Array");
        int[] ans = makePrefixSum(arr);
        printArray(ans);
    }

    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
// Extra Memory
//    static int[] makePrefixSum(int[] arr){
//        int n = arr.length;
//        int[] pre = new int[n];
//        pre[0] = arr[0];
//        for(int i=1; i<n; i++){
//            pre[i] = pre[i-1] + arr[i];
//        }
//        return pre;
//    }

    static int[] makePrefixSum(int[] arr){
        int n = arr.length;
        for(int i =1 ; i< n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
}
