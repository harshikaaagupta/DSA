import java.util.*;
public class decreasing {
    public static void decrease(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        decrease(n-1);
    }
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
       decrease(num);       
        
    
    }
    
}
