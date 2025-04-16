import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        findMax(arr);
    }
        public static void findMax(int[] arr){
            int max = Integer.MIN_VALUE;
            for(int i=0; i<arr.length; i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            System.out.println("Maximum value " + max);
        }

}
