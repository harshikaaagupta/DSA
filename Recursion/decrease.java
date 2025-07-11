import java.util.*;
public class decrease {
    public static void decrease(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        decrease(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n = sc.nextInt();
        decrease(n);

    }
    
}
