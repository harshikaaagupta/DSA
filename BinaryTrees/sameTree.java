public class sameTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isSameTree(Node root1, Node root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        if(root1.data != root2.data) return false;
        return isSameTree(root1.left,root2.left) && isSameTree(root1.right, root2.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);

        
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);

        boolean result = isSameTree(root1, root2);

        if(result == true){
            System.out.println("Both the trees are same.");
        }else{
            System.out.println("Both the trees are different");
        }
    }
}
