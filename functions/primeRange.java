// To check the prime numbers lying within a range.
public class primeRange {
   public static void primesInRange(int n){
    for(int i=2;i<=n;i++){
        if(isPrime(i)){
            System.out.println(i+"");
        }
    }
    System.out.println();
   }
   public static boolean isPrime(int n){
    boolean isPrime=true;
    for(int i=2;i<n-1;i++){
        if(n%i == 0){
            isPrime=false;
            return isPrime;
        }
    }
    return isPrime;
   }
   public static void main(String[] args) {
       primesInRange(16);
   }
}
