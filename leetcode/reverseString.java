public class reverseString{
    public static void reverseString(char[] str){
        int left = 0;
        int right = str.length -1;
        char temp;

        while(left < right){
            temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String args[]){
        String str = "hello";
    }
}