import java.util.Scanner;

public class UniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Unique Element : "+ uniqueElement(arr));
    }
    public static int uniqueElement(int[] arr){
        int ans=-1;
        for(int i=0; i< arr.length;i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
//                    arr[i] = -1;
//                    arr[j] = -1;

                        ans = arr[j];

                }
            }
        }
//        for(int i=0; i< arr.length; i++){
//            if(arr[i] > 0){
//                ans = arr[i];
//            }
//        }

        return ans;
    }
}
