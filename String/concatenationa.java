


public class concatenationa {
    public static void printLetter(String str){
        for(int i =0 ;i<str.length() ; i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstName = "Harshika";
        String lastName = "Gupta";
        String fullName = firstName +" "+ lastName;
        // System.out.println(fullName + " is the user.");
        printLetter(fullName);
    }
}
