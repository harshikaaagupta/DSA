import java.util.*;
public class sumNatural{
    public static int sumofNatural(int n){
        int sum = 0;
        if(n == 0){
            return 0 ;
        }
        return n + sumofNatural(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int num = sc.nextInt();
        System.out.println(sumofNatural(num) + " ");

    }

}