//input parameters.
import java.util.*;
public class lect2 {
    public static void numSum(int x, int y){
        int z=x+y;
        System.out.println("The sum is "+z);
    }
    public static void  main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1= sc.nextInt();
        System.out.println("Enter the second number:");
        int n2= sc.nextInt();
        numSum(n1,n2);
        

    }
}
