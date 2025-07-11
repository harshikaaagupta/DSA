import java.util.*;
public class largest {
    public static int largest(int matrix[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(max<matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
    public static int smallest(int matrix[][]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(min>matrix[i][j]){
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length , m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j =0 ;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int  j =0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("The largest element is:"+largest(matrix));
        System.out.println("The smallest element is:"+smallest(matrix));
    }

    
}
