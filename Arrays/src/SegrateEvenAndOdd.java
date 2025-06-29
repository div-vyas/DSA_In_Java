import java.util.Scanner;

public class SegrateEvenAndOdd {
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
        segregateEvenAndOdd(arr);
        System.out.println("Sorted Array: ");
        printArray(arr);
    }

    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void segregateEvenAndOdd(int[] arr){
        int n = arr.length;
        int left  = 0;
        int right = n-1;

            while(left<right){
                if(arr[left] % 2 == 1 && arr[right]%2 ==0){
                    swap(arr, left, right);
                    left++;
                    right--;
                }
                if(arr[left] % 2 == 0){
                    left++;
                }
                if(arr[right] % 2 ==1){
                    right--;
                }
            }

    }
}
