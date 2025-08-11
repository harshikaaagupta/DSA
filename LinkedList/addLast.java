

public class addLast {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addLast(int data){ // O(1)
        // step 1 -> create newNode

        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        //step 2 -> tail.next = newNode
        tail.next = newNode;

        //step 3 -> tail = newNode
        tail = newNode;
    }

    public static void main(String[] args) {
        addLast ll = new addLast();
        ll.addLast(3);
        ll.addLast(4);
    }
    
}
