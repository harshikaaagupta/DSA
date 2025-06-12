// Write a Java method to compute the sum of the digits in an integer.
import java.util.*;
public class sumNum {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");
        int number =  sc.nextInt();
        System.out.println("The sum of digits :"+ sumDigits(number));

    }
    public static int sumDigits(int num){
        int sumOfDigits = 0;
        while(num > 0) {
            int lastDigit = num % 10;
            sumOfDigits += lastDigit;
            num /= 10;
        }
        return sumOfDigits;
    }
}
    

