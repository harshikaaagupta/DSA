public class doubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // add
    
    //addFirst (Insert in the begining)

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // addLast (Insert at the end)

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // remove

    //removeFirst() -> delete the first element
    
    public int removeFirst(int data){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    //removeLast() -> delete the last element
    
    public int removeLast(int data){
        if(head == null){
        System.out.println("DLL is empty");
        return Integer.MIN_VALUE;
    }


    int val = tail.data;
    tail = tail.prev;
    tail.next = null;
    return val;

    }

    //print 
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        doubleLL dll = new doubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);

        dll.print();
        System.out.println();

        dll.removeFirst(2);
        System.out.println();
        dll.removeLast(5);
        System.out.println();

        dll.print();
        System.out.println();
        
    }
}
