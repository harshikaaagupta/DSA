import java.util.*;
public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int num = sc.nextInt();
        if(isPalindrome(num)){
            System.out.println("The number " + num + " is a palindrome.");
        }else{
            System.out.println("The number "+num+" is not a palindrome.");
        }
    }
    public static boolean isPalindrome(int num){
        int palindrome = num;
        int reverse=0;
        while(num!=0){
            int remainder = num % 10;
            reverse =reverse*10+remainder;
            num =num/10;
        }
        if (palindrome == reverse){
            return true;
        }else{
            return false;
        }
    }
    
}
