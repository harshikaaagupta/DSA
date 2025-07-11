import java.util.*;
public class sumOfNatural {
    public static int natural(int num){
        if(num == 0){
            return 0;
        }
        return natural(num -1) + num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n = sc.nextInt();
        System.out.println(natural(n)+" ");

    }
}
