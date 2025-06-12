//Find the product of a and b.
//Fcatorial of a number.
import java.util.*;
public class lect4 {
    public static void multiply(int a , int b){
        System.out.println("The product of both the numbers are:"+a*b);
    }
    public static int fac(int n){
        if((n==0)||(n==1)){
            return 1;
        }else{
            return n*fac(n-1);

        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        multiply(a,b);
        int num = fac(n);
        System.out.println("The factorial of "+n+"is :"+nu,)

    }
}
