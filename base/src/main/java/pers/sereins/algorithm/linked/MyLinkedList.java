package pers.sereins.algorithm.linked;

public class MyLinkedList {
    // 索引是从0开始
    public int val;
    public int size;
    public MyLinkedList next;

    public MyLinkedList() {
    }


    public int get(int index) {
        if (index > this.size || isEmpty() || index < 0) return -1;

        MyLinkedList pre = this;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        return pre.val;
    }

    // 头部添加元素
    public void addAtHead(int val) {
        // 是否是第一个节点
        if (isEmpty()) {
            this.val = val;
            this.size++;
            return;
        }

        // 创建新的节点
        MyLinkedList node = new MyLinkedList();
        node.val = this.val;
        node.next = this.next;

        this.val = val;
        this.next = node;
        this.size++;
    }

    // 尾部追加元素
    public void addAtTail(int val) {
        // 如果是一个空的链表直接加入
        if (isEmpty()) {
            this.val = val;
            this.size++;
            return;
        }

        // 一个新的节点
        MyLinkedList node = new MyLinkedList();
        node.val = val;

        // 找到最后一个节点
        MyLinkedList pre = this;

        while (pre.next != null) {
            pre = pre.next;
        }
        this.size++;
        pre.next = node;
    }

    // 指定位置加入
    public void addAtIndex(int index, int val) {

        // 小于0 加入链表的头部
        if (index <= 0) {
            this.addAtHead(val);
            return;
        }

        // 等于链表的长度增加到末尾
        if (this.size == index) {
            this.addAtTail(val);
            return;
        } else if (this.size < index) {
            return;
        }

        MyLinkedList pre = this;
        for (int i = 0; i < index - 1; i++) {
            pre = pre.next;
        }

        // 创建一个节点
        MyLinkedList node = new MyLinkedList();
        node.val = val;

        node.next = pre.next;
        pre.next = node;

        this.size++;
    }

    // 删除索引指定的元素
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= this.size) {
            return;
        }
        if (index ==0){
            this.val = this.next == null ? 0 :this.next.val;
            this.next = this.next == null ? null : this.next.next;
        }

        MyLinkedList pre = this;
        int i;
        for (i = 1; i < index; i++) {
            pre = pre.next;
        }

        // 是否删除最后一个元素
        if (i == this.size ) {
            pre.next = null;
        }else {
            pre.next = pre.next.next;
        }

        this.size--;
    }

    // 展示列表
    public void showLists() {
        if (isEmpty()) {
            return;
        }
        MyLinkedList pre = this;
        while (true) {
            System.out.println(pre.val);
            if (pre.next == null) {
                break;
            }
            pre = pre.next;
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
