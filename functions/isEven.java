import java.util.*;
public class isEven {
    public static void isEven(int num){
        if(num%2 == 0){
            System.out.println("The argument is even ");
        }else{
            System.out.println("The given argument is not even.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the argument:");
        int num = sc.nextInt();
        isEven(num);
    }
    
}
