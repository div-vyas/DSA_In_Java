import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
//        S = 1-2+3-4...n

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                ans -= i;
            }
            else{
                ans += i;
            }
        }
        System.out.print(ans);
    }
}
