// Print the number of 7’s that are in the 2d array.
// Example :
// Input - int[][] array = { {4,7,8},{8,8,7} };
// Output - 2
public class assignmentQuestion_1 {
    public static void main(String[] args){
        int matrix [][] = {{4,7,8},{8,8,7}};
    int count = 0;
    for(int i = 0 ; i<matrix.length;i++){
        for(int j = 0 ; j<matrix[0].length ; j++){
            if(matrix[i][j] == 7){
                count++;
            } 
        }
    }
    System.out.println(count+"");
    
    }
}
