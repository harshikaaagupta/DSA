import java.util.Scanner;

public class increase {
    public static void increase(int num){
        if (num == 0){
            return;
        }
        increase(num-1);
        System.out.println(num + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n = sc.nextInt();
        increase(n);

    }
}
