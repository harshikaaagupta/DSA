import java.util.*;
public class setIthBit {
    public static int setIthBit(int n , int i){
        int bitMask = 1<<i;
        return n|bitMask;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        System.out.println("Enter the value of i :");
        int i = sc.nextInt();
        System.out.println(setIthBit(n, i)+"");


        
    }
}
