package LinkedListPackage;

import java.sql.SQLOutput;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value) {

        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail ==null) {
            tail = head;
        }

        size++;

    }

    public void insertLast(int value) {

        Node node = new Node(value);
        tail.next = node;
        node.next = null;

        tail = node;
        if(head == null) {
            head =tail;
        }

        size++;

    }

    public void insert (int value, int index) {

        if(index == 0) {
            this.insertFirst(value);
            return;
        }
        if(index == size-1) {
            this.insertLast(value);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++) {
            temp=temp.next;
        }

        Node node = new Node(value, temp.next);

        temp.next = node;
        size++;
    }

    public void insertRec(int val, int index) {

        head = insertUsingRecursion(val, index, head);

    }

    private Node insertUsingRecursion(int value, int index, Node node) {
        if(index == 0) {
            Node temp = new Node(value,node);
            size++;
            return temp;
        }
        node.next = insertUsingRecursion(value, --index, node.next);
        index--;
        return node;
    }



    public int deleteFirst(){
        int value = head.value;
        size--;
        if(head==tail) {
            head=head.next;
            tail=tail.next;
            return value;
        }
        head=head.next;
        return value;
    }

    public int deleteLast() {

        if(size <=1) {
            return deleteFirst();
        }
        int value = tail.value;

        Node secondLast = get(size-2);

        tail = secondLast;
        tail.next = null;
        size--;

        return value;

    }

    public int delete(int index) {
        if(index == 0) {
            return deleteFirst();
        }

        if(index == size-1) {
            return deleteLast();
        }

        Node previousNode = get(index-1);
        int val = previousNode.next.value;

        previousNode.next =previousNode.next.next;

        return val;
    }

    public void display () {
        Node temp = head ;
        while(temp!=null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void displayNode(Node node) {
        System.out.println(node.value);
    }

    public Node find(int value) {
        Node node = head;
        for(int i=0;i<size-1;i++) {
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for(int i=0;i<index;i++) {
            node = node.next;
        }
        return node;
    }




    public class Node{

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }

    }

    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static void main(String[] args) {
        LL list= new LL();
        list.insertFirst(5);
        list.insertFirst(5);
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(2);
        list.insertFirst(2);

        list.duplicates();

        list.display();
    }

}
