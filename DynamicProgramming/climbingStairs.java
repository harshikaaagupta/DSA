
import java.util.Arrays;

public class climbingStairs {
    // public static int countWays(int n){
    //     if(n == 0 || n == 1){
    //         return 1;
    //     }
    //     if(n < 0){
    //         return 0;
    //     }
    //     return countWays(n-1)+countWays(n-2);
    // }
    // public static void main(String[] args) {
    //     int n = 5;
    //     System.out.println(countWays(n));
    // }
    
    //Memoisation 

    public static int countWays(int n , int ways[]){
        if(n == 0 ){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n] != -1){
            return ways[n];
        }
        ways[n] = countWays(n-1,ways)+countWays(n-2,ways);
        return ways[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(countWays(n, ways));
    }

    
}
