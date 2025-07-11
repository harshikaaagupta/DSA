import java.util.*;

public class fibonacci {
    public static int fibonacci(int num){
        if(num == 0 || num == 1){
            return num ;
        }
        return fibonacci( num - 1) + fibonacci(num - 2);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for(int i = 0 ;i<n;i++){
            System.out.print(fibonacci(i) + " ");

        }
    }
    
}
