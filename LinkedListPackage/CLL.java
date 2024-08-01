package LinkedListPackage;

public class CLL {

    private Node head;
    private Node tail;
    private int size;

    public CLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insert (int value) {
        Node node = new Node(value);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next =head;
        tail = node;
        size++;
    }

    public void display() {
        Node node  = head;
        if(head != null) {
            do {
                System.out.print(node.value + " --> ");
                node = node.next;
            }while(node != head);
            System.out.println("Circular");
        }
    }

    public int delete(int value) {
        if(head.value == value) {
            head = head.next;
            tail.next = head;
            return value;
        }
        Node node = head;
        do {
            if(node.next.value == value) {
                node.next = node.next.next;
                return value;
            }
            node = node.next;
        }while(node!=head);
        return -1;
    }


    public class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

}
