import java.util.LinkedList;

public class addFirst {
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
        public static Node head ;
        public static Node tail;

        public void addFirst(int data){
            Node newNode = new Node(data);
            
            //step 1 -> create newNode
            if(head == null){
                head = tail = newNode;
                return;
            } 

            //step 2 - newNode next = head (linking phase)
            newNode.next = head;

            //step 3 - head = newNode
            head = newNode;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        list.add(1);
        list.add(2);

    }
    
}
