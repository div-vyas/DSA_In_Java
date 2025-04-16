import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a & b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swapNumbers(a,b);
    }
    public static void swapNumbers(int a, int b){
        System.out.println("New values of a & b are : ");
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
