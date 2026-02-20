public class lc74{
    public static void main(String[] args) {
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(target == matrix[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}


