import java.util.Scanner;

public class clearIthBit {
    public static int clearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        System.out.println("Enter the value of i :");
        int i = sc.nextInt();
        System.out.println(clearIthBit(n, i)+"");
    }
}
