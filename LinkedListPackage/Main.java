package LinkedListPackage;

public class Main {
    public static void main(String[] args) {

        //                  Linked List
//        LL list = new LL();
//        list.insertFirst(4);
//        list.insertFirst(2);
//        list.insertFirst(1);
//        list.insertLast(5);
//
//        list.insert(3,2);
//
//        list.display();

//        System.out.println(list.deleteFirst());
//
//        list.display();
//
//        System.out.println(list.deleteLast());
//
//        list.display();

        LL list = new LL();
        list.insertRec(2,0);
        list.insertRec(5,1);
        list.insertRec(6,2);
        list.insertRec(7,3);
        list.display();




//        System.out.println(list.delete(2));
//
//        list.display();
//
//        System.out.println(list.find(6));


        //                                      Doubly Linked List

//        DLL dList = new DLL();
//
//        dList.insertFirst(5);
//        dList.insertFirst(1);
//        dList.insert(2,1);
//        dList.insert(3,2);
//        dList.insertLast(6);
//
//        dList.display();

//        dList.displayReverse();


        //                              Circular Linked List

//        CLL cList = new CLL();
//        cList.insert(5);
//        cList.insert(4);
//        cList.insert(3);
//        cList.insert(2);
//        cList.insert(1);
//
//        cList.display();
//
//        System.out.println(cList.delete(4));
//
//        cList.display();


    }
}
