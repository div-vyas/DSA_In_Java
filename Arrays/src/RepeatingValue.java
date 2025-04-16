import java.util.Scanner;

public class RepeatingValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        repeatingValue(arr);
    }
    public static void repeatingValue(int[] arr){
        int ans = -1;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    ans = arr[i];
                }
            }
        }
        System.out.println("Answer is "+ ans);
    }
}
