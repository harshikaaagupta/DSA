import java.util.Arrays;

public class lc167 {

    public static int[] sortedArrayII(int numbers[], int target) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};   // 1-based index
                }
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String args[]) {

        int numbers[] = {1, 2, 3, 4, 5, 6};
        int target = 5;

        int[] result = sortedArrayII(numbers, target);

        System.out.println(Arrays.toString(result));
    }
}
