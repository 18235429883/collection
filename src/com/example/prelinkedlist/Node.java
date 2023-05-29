package com.example.prelinkedlist;

/**
 * 模拟LinkedList源码--节点类
 */
public class Node {
    // 上一个元素的地址
    private Node pre;
    // 当前存入的元素
    private Object obj;
    // 下一个元素的地址
    private Node next;

    public Node() {
    }

    public Node(Node pre, Object obj, Node next) {
        this.pre = pre;
        this.obj = obj;
        this.next = next;
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "pre=" + pre +
                ", obj=" + obj +
                ", next=" + next +
                '}';
    }
}
