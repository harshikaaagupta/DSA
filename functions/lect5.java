public class lect5 {
    public static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int binomialCoefficient(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    public static void main(String args[]) {
        int n = 5;
        int r = 2;
        System.out.println("Binomial Coefficient C(" + n + "," + r + ") is: " + binomialCoefficient(n, r));
    }
}
