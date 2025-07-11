import java.util.Arrays;          
import java.util.Collections;

public class inbuiltSort {
    public static void printArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Integer arr[] = {5, 4, 1, 3, 2};
        int arr[] ={5,4,3,1,2};
        // Arrays.sort(arr, Collections.reverseOrder());  
        Arrays.sort(arr);
        Arrays.sort(arr,0,3);
        printArray(arr);  
    }
}
