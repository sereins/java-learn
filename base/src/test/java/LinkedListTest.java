import pers.sereins.algorithm.linked.MyLinkedList;

public class LinkedListTest {


    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList();

//        linkedList.addAtHead(1);
//        linkedList.addAtTail(3);
//
//        linkedList.addAtIndex(1,2);
//        linkedList.showLists();
//        System.out.println();
//        linkedList.deleteAtIndex(1);
//        linkedList.showLists();
////        int i = linkedList.get(1);


        linkedList.addAtHead(1);
        linkedList.deleteAtIndex(0);
        linkedList.showLists();


    }
}
