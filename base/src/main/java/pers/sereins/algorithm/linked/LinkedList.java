package pers.sereins.algorithm.linked;

public class LinkedList {
    // 索引是从0开始
    int val;

    LinkedList next;

    public LinkedList() {
    }


    public int get(int index) {
        if (next == null) return -1;

        int i = 0;
        while (next != null) {
            if (i == index) return this.val;
            next = next.next;
            i++;
        }

        return -1;
    }

    // 头部添加元素
    public void addAtHead(int val) {

        // 创建新的节点
        LinkedList node = new LinkedList();
        node.val = this.val;

        this.val = val;
    }

    public void addAtTail(int val) {

    }

    public void addAtIndex(int index, int val) {

    }

    public void deleteAtIndex(int index) {

    }

}
