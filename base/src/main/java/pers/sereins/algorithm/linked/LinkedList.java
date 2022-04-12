package pers.sereins.algorithm.linked;

public class LinkedList {


    /**
     * 初始化一个单独头节点的链表
     * @return
     */
    public LinkNode initHeadLinked(int[] nums){
        LinkNode linkNode = new LinkNode();

        LinkNode current = linkNode;

        for (int i :nums) {
            LinkNode node = new LinkNode(i);
            current.next = node;
            current = node;
        }
        return  linkNode;
    }

    /**
     * 打印链表里面的元素
     */
    public void showLinkedList(LinkNode node)
    {
        LinkNode current;
        current = node;

        while (current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }
}
