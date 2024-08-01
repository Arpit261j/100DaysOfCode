package LinkedListPackage;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.size = size;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.previous =null;
        node.next=head;
        if(head!=null) {
            head.previous = node;
        }
        head = node;

        if(tail == null) {
            tail =head;
        }
        size++;
    }

    public void insert(int value, int index) {
        Node node = new Node(value);
        Node temp = get(index-1);
        node.next=temp.next;
        node.previous = temp;
        node.next.previous = node;
        temp.next =node;
        size++;
    }

    public void insertLast(int value) {
        if(head == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        node.previous = null;
        node.next = null;
    }


    public void display() {
        Node temp = head;
        while(temp!= null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void displayReverse() {

        Node temp = tail;
        while(temp != null) {
            System.out.print(temp.value + " --> ");
            temp =temp.previous;
        }
        System.out.println("Start");
    }

    public Node get(int index) {
        Node node =head;
        for(int i=0;i<index;i++) {
            node = node.next;
        }
        return node;
    }



    public class Node {

        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

    }

}
