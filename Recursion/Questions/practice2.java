public class practice2 {
    public static void convertToWords(int num){
        if(num == 0){
            return;
        }
        String[] words ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        convertToWords(num/10);
        int digits = num%10;
        System.out.print(words[digits] + " ");
    }
    public static void main(String[] args) {
        int num = 2025;
        if(num == 0){
            System.out.println("zero");
        }else{
            convertToWords(num);
        }
    }
    
}
