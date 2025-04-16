import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();

//        i.      ******
//                ******
//                ******

//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=c; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        ii.     **********
//                *        *
//                *        *
//                *        *
//                *        *
//                *        *
//                *        *
//                **********
//
//        for(int i=1; i<=r; i++){
//            for (int j=1; j<=c; j++){
//                if(i==1 || i==r || j==1 || j==c){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        iii.    *
//                **
//                ***
//                ****
//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        iv.     ****
//                ***
//                **
//                *
//
//        for(int i=r; i>=1; i--){
//            for(int j=i; j>=1; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        v.         *
//                  ***
//                 *****
//                *******
//
//        for(int i=1; i<=r; i++){
//
//            for(int j=1; j<= r-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=2*i-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println();


//       vi.  1234567
//            2345671
//            3456712
//            4567123
//            5671234
//            6712345
//        7123456
//
//        for(int i=1; i<=r; i++){
//            for(int j=i; j<=r; j++){
//                System.out.print(j);
//            }
//            for(int j=1; j<=i-1; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        vii. 1212
//            2121
//            1212
//            2121
//
//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=c; j++){
//                if((i+j) % 2 == 0){
//                    System.out.print("1");
//                }
//                else{
//                    System.out.print("2");
//                }
//            }
//            System.out.println();
//        }

//        viii.           1
//                      121
//                     12321
//                    1234321
//
//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=r-i; j++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=i; k++){
//                System.out.print(k);
//            }
//            for(int l=i-1; l>=1; l--){
//                System.out.print(l);
//            }
//            System.out.println();
//        }


        
    }
}
