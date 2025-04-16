import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int lastDigit;
        while(n>0){
            lastDigit = n%10;
            rev = rev * 10 + lastDigit;
            n = n/10;
        }
        System.out.println(rev);
    }
}
