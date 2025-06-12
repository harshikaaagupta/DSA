public class pairsArray {
    public static void pairsArray(int numbers[]){
        int total = 0;
            for(int i = 0;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j = i+1 ;j<numbers.length;j++){
                System.out.print("(" + curr + "," + " "+numbers[j]+")");
                total++;
            }
            System.out.println();
        } 
        System.out.println("The total number of pairs are : "+total);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12};
        pairsArray(numbers);
    }
}
