 // if the person is allowed to either take 1 or 2 or 3 steps while climbing the stairs.
 
import java.util.Arrays;

public class climbingStairsVariation {
    public static int countWays(int n , int ways[]){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(ways[n] != -1){
            return ways[n];
        }
        ways[n] = countWays(n-1, ways)+countWays(n-2, ways)+countWays(n-3, ways);
        return ways[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(countWays(n,ways));
    }
}
