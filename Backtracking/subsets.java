public class subsets {
    public static void findSubset(String str, String ans , int i){
        if(i == str.length()){
            if(str.length() == 0){
                System.err.println("null");
            }else{
                System.err.println(ans);
            } return;
        } 
        //Yes choice
        findSubset(str, ans+str.charAt(i), i+1);
        //No choice
        findSubset(str, ans, i+1);
    }
    public static void main(String[] args){
        String str = "abc";
        findSubset(str, " ",0);
    }
    
}
