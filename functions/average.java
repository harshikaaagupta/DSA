import java.util.*;
public class average {
   public static int avgThree(int a, int b, int c){
    return (a+b+c)/3;
   } 
   public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the three numbers:");
    int x= sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    System.out.println(""+ avgThree(x,y,z));

   }
}
