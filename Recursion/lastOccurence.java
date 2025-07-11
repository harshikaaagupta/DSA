public class lastOccurence {
    public static int lastOccurence(int arr[] , int key , int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(arr[i] == key && isFound == -1){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,4};
        System.out.println(lastOccurence(arr, 4, 0)+" ");

    }
    
}
