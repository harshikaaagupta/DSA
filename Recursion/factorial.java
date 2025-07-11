import java.util.*;
public class factorial {
    public static int factorial(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        return factorial(num -1) * num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n = sc.nextInt();
        System.out.println(factorial(n)+" ");

    }
}
