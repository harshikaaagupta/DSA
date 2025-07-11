public class firstOccurence {
    public static int firstOccurence(int arr[], int key , int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8,5,3,2,4,3,6,7,9,3,6};
        System.out.println(firstOccurence(arr, 3, 0) + " ");
    }
    
}
