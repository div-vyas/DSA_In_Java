import java.util.Scanner;

public class QueryNumberSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] freq = frequencyArray(arr);
        // elements of q
        System.out.println("Enter number of Queries");
        int q = sc.nextInt();

        while(q>0){
            System.out.println("Enter the number you want to search ");
            int num = sc.nextInt();
            if(freq[num] > 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            q--;
        }
    }

    public static int[] frequencyArray(int[] arr){
        int[] freq = new int[100005];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
}
