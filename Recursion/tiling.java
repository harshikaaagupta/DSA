public class tiling {
    public static int tilingProblem(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int vertical = tilingProblem(n-1);
        int horizontal = tilingProblem(n-2);
        int total = vertical + horizontal;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3) + " ");
    }
}
