
public class arraySort {
    public static boolean arraySort(int arr[] , int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr [i] > arr [i+1]){
            return false;
        }
        return arraySort(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(arraySort(arr, 0) + " ");


    }
}
