import java.util.*;
public class intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[10];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("phy : "+marks[0]);
        System.out.println("chem : "+marks[1]);
        System.out.println("maths : "+marks[2]);

        int perc = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage : " +perc+"%");

    }
    
}
