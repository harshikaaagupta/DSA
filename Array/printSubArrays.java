public class printSubArrays {
    public static void printSubArrays(int numbers[]){
        int total=0;
        for(int i=0 ;i<numbers.length;i++){
            int start = i ;
            for(int j=i;j<numbers.length;j++){
                int end = j ;
                for(int k = start ;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                    total++;
                    int sum =0;
                    for(int m=0;m<numbers.length;m++){
                        sum=sum+numbers[m];
                        System.out.println("The sum is: "+sum);
                    }
                }
                System.out.println();
            }
            System.out.println();
            
        }
        System.out.println("Total subarrays formed are : "+total);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        printSubArrays(numbers);
    }
    
}
