import java.util.*;

public class increasing {
    public static void increase(int n){
        if(n == 0){
            return ;
        }
        increase(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int num = sc.nextInt();
        increase(num);
    }
    
}
