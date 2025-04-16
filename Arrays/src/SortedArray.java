import java.util.Scanner;
public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        if(checkSortedArray(arr)){
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Not sorted");
        }
    }

    static boolean checkSortedArray(int[] arr){
        for(int i=1; i< arr.length; i++){
            if(arr[i-1]>=arr[i]) {
                return false;
            }
        }
        return true ;
    }
}
