import java.util.Scanner;

public class RangeQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: ");
        printArray(arr);

        int[] prefSum = makePrefixSum(arr);

        System.out.println("Enter number of queries");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter the range (1-based index):");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefSum[r] - prefSum[l - 1];

            System.out.println("Sum: " + ans);
        }
    }

    static void printArray(int[] arr){
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSum(int[] arr){
        int n = arr.length;
        int[] pref = new int[n + 1]; // 1-based indexing

        for (int i = 1; i <= n; i++) {
            pref[i] = pref[i - 1] + arr[i - 1];
        }

        return pref;
    }
}
