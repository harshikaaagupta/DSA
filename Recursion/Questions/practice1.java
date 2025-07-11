public class practice1 {
    public static void practice1(int arr[] , int key , int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i+" ");
        }
        practice1(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        practice1(arr, key, 0);
    }

}
    

