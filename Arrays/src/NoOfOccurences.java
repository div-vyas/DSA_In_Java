import java.sql.SQLOutput;
import java.util.Scanner;

public class NoOfOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the digit x");
        int x = sc.nextInt();

        System.out.println("No of Occurence if the digit "+x+" is "+ NoOfOccurences(arr,x));
    }

    private static int NoOfOccurences(int[] arr, int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
}
