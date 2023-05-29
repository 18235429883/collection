package com.example.test01;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * LinkedList常用方法：
 * 增加 addFirst(E e) addLast(E e)
 * offer(E e) offerFirst(E e) offerLast(E e)
 * 删除 poll()
 * pollFirst() pollLast()  ---》JDK1.6以后新出的方法，提高了代码的健壮性
 * removeFirst() removeLast()
 * 查看 element()
 * getFirst()  getLast()
 * indexOf(Object o)   lastIndexOf(Object o)
 * peek()
 * peekFirst() peekLast()
 */
public class Test04 {
    public static void main(String[] args) {
        // 创建一个LinkedList集合对象
        LinkedList<String> list = new LinkedList<>();
        list.add("aaaaa");
        list.add("bbbbb");
        list.add("ccccc");
        list.add("ddddd");
        list.add("eeeee");
        list.add("bbbbb");
        list.add("fffff");
        // LinkedList可以添加重复的数据
        System.out.println(list);

        // addFirst(E e) 添加首位置元素
        list.addFirst("addFirst");

        // addLast(E e) 添加尾部元素
        list.addLast("addLast");

        // offer(E e) 添加元素到尾部
        list.offer("offer");

        // offerFirst(E e) 添加元素到首位
        list.offerFirst("offerFirst");

        // offerLast(E e) 添加元素到尾部
        list.offerLast("offerLast");

        System.out.println(list);
        System.out.println("--------------------------------");

        // poll()方法是 JDK1.6 以后新出的方法，提高了代码的健壮性
        // poll() 删除首位元素并返回删除的元素
        System.out.println(list.poll());
        // pollFirst() 删除首位元素并返回删除的元素
        System.out.println(list.pollFirst());
        // pollLast() 删除尾部元素并返回删除的元素
        System.out.println(list.pollLast());

        // removeFirst() 删除首位元素并返回删除的元素
        System.out.println(list.removeFirst());
        // removeLast() 删除尾部元素并返回删除的元素
        System.out.println(list.removeLast());

        System.out.println("--------------------------------");

        // 查看集合中首位元素
        String element = list.element();
        System.out.println("查看集合中首位元素element：" + element);

        // getFirst() 查看集合首位元素
        String first = list.getFirst();
        System.out.println("查看集合首位元素getFirst：" + first);

        // getLast() 查看集合尾部元素
        String last = list.getLast();
        System.out.println("查看集合尾部元素getLast：" + last);

        // indexOf(Object o) 根据元素查找对应在集合中的索引indexOf
        int i1 = list.indexOf("bbbbb");
        System.out.println("根据元素查找对应在集合中的索引indexOf：" + i1);

        // lastIndexOf(Object o) 根据元素查找最后一次出现在集合中位置的索引
        int i2 = list.lastIndexOf("ddddd");
        System.out.println("根据元素查找最后一次出现在集合中位置的索引lastIndexOf：" + i2);

        // peek() 查看集合首位元素
        String peek = list.peek();
        System.out.println("查看集合首位元素peek：" + peek);

        // peekFirst() 查看集合首位元素
        String p1 = list.peekFirst();
        System.out.println("查看集合首位元素peekFirst：" + p1);

        // peekLast() 查看集合尾部元素
        String p2 = list.peekLast();
        System.out.println("查看集合尾部元素peekLast：" + p2);


        System.out.println("-------------普通For遍历---------------");
        // 集合遍历
        // 1.普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------------增强For遍历-------------");

        // 2.增强For循环
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------迭代器遍历-------------");

        // 3.迭代器遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("--------------源码中遍历方式--------------");

        // 4.迭代器for循环
        // 这种方式相较于上面的迭代器遍历，更加节省内容，但是不易理解，可以多看几次
        for (Iterator<String> iter = list.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }
    }
}
