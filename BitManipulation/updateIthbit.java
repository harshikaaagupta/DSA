import java.util.Scanner;

public class updateIthbit {
    public static int clearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int setIthBit(int n , int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static int updateIthbit(int n , int i , int newBit){
        if (newBit == 0){
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        System.out.println("Enter the value of i :");
        int i = sc.nextInt();
        System.out.println(updateIthbit(n, i, 3)+"");
    }
}
