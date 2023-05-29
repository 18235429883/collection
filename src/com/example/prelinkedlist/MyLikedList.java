package com.example.prelinkedlist;

/**
 * 模拟LinkedList源码--自定义LinkedList
 */
public class MyLikedList {
    // 链中一定有首节点
    private Node first;
    // 链中一定有尾节点
    private Node last;
    // 计数器
    private int count = 0;

    /**
     * 提供一个构造器
     */
    public MyLikedList() {
    }

    /**
     * 自定义添加元素方法 add
     */
    public void add(Object o) {
        // 证明添加的元素是第一个节点
        if (first == null) {
            // 将添加的元素封装为Node对象
            Node node = new Node();
            // 既然当前是第一个节点，所以没有首节点指向
            node.setPre(null);
            // 将传入的第一个数据赋值
            node.setObj(o);
            // 既然当前是第一个节点，所以没有尾节点指向
            node.setNext(null);

            // 当前链中第一个节点变为node
            first = node;
            // 当前链中最后一个节点变为node
            last = node;
        } else {// 证明不是链中的第一个元素/节点
            // 将添加的元素封装为Node对象
            Node node = new Node();
            // 当前节点的上一个节点一定是当前链中的最后一个节点
            node.setPre(last);
            node.setObj(o);
            node.setNext(null);
            // 当前链中的最后一个节点的下一个元素 要指向Node
            last.setNext(node);
            // 将最后一个节点变为当前node
            last = node;
        }
        // 链表中的元素数量+1
        count++;
    }

    /**
     * 模拟：获取元素的总数量
     */
    public int getSize() {
        return count;
    }

    /**
     * 模拟：通过下标获取元素
     */
    public Object get(int index) {
        // 获取链表的头元素
        Node node = first;
        // 通过循环得到要查找的链表次数
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getObj();
    }
}

class Test {
    public static void main(String[] args) {
        // 创建一个MyLikedList集合对象
        MyLikedList myLikedList = new MyLikedList();
        myLikedList.add("aa");
        myLikedList.add("bb");
        myLikedList.add("cc");

        System.out.println(myLikedList.getSize());
        System.out.println(myLikedList.get(2));
        System.out.println(myLikedList.get(0));
    }
}