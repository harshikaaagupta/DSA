// Write a program to Find Transpose of a Matrix.
// What is Transpose?
// Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,
// Matrix
// a11 a12 a13
// a21 a22 a23
// Transposed Matrix
// a11 a21
// a12 a22
// a13 a23

public class transpose {
    public static void printMatrix(int matrix[][]){
        for(int i =0 ;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        int row = 2 , col = 3;
        int matrix[][] = {{1,2,3},{4,5,6}};
        System.out.println("The original matrix is :");
        printMatrix(matrix);
        int transpose[][] = new int[col][row];
        for(int i =0;i<row;i++){
            for(int j = 0 ;j<col;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("The transpose of the matrix is:");
        printMatrix(transpose);

    }
}
