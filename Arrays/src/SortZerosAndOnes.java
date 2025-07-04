import java.util.Scanner;

public class SortZerosAndOnes {
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
        sortZerosAndOnes(arr);
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

//    static void sortZerosAndOnes(int[] arr){
//        int n = arr.length;
//        int zeros = 0;
//        // Count Number of zeros
//        for(int i=0; i<n; i++){
//            if(arr[i] == 0){
//                zeros++;
//            }
//        }
//        // 0 to Zeros - 1 : 0, zeros to n-1 : 1
//        for(int i=0; i<n; i++){
//            if(i<zeros){
//                arr[i] = 0;
//            }
//            else{
//                arr[i] = 1;
//            }
//        }

    static void sortZerosAndOnes(int[] arr){
        int n = arr.length;
        int left  = 0;
        int right = n-1;
        for(int i =0 ;i< n; i++){
            while(left<right){
                if(arr[left]==1 && arr[right]==0){
                    swap(arr, left, right);
                    left++;
                    right--;
                }
                if(arr[left] == 0){
                    left++;
                }
                if(arr[right]==1){
                    right--;
                }
            }
        }
    }
}
