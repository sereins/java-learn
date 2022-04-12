import pers.sereins.algorithm.linked.LinkNode;
import pers.sereins.algorithm.linked.LinkedList;

public class LinkedListTest {


    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        int[] nums = {1, 2, 3, 4, 5};

        LinkNode linkNode = linkedList.initHeadLinked(nums);

        linkedList.showLinkedList(linkNode);
    }
}
