import java.util.*;
public class oddEven {
    public static void oddEven(int num){
        if((num & 1) == 0){
            System.out.println("The number is an even number");
        }else{
            System.out.println("The number is an odd number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        oddEven(num);
        
    }
    
}
