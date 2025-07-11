public class friendPair{
    public static int friendPair(int n){
        if(n == 1 || n == 2){
            return n;
        }
        // int single = friendPair(n-1);
        // int pair = (n-1) * friendPair(n-2);
        // int totalWay = single + pair;
        // return totalWay;
        return friendPair(n-1) + (n-1)*friendPair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendPair(3)+ " ");
    }
}