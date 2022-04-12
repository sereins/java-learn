package pers.sereins.algorithm.linked;

/**
 * 链表的节点
 */
public class LinkNode {

    int val;
    LinkNode next;

    LinkNode() {
    }


    LinkNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "LinkNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
