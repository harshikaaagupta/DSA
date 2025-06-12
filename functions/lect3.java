//call by value : swap function

public class lect3 {
    public static void swap(int a,int b){
        int temp = a;
        a=b;
        b = temp;
        System.out.println("a: "+a+"b: "+b);
    }
    public static void main(String args[]){
        int a=10;
        int b =40;
        System.out.println("a: "+a+"b: "+b);
        swap(a,b);
        
    }
    
}
