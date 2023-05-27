package com.example.test01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection集合迭代器遍历方式
 */
public class Test02 {
    public static void main(String[] args) {
        Collection collection = new ArrayList<>();
        collection.add(18);
        collection.add(12);
        collection.add(11);
        collection.add(17);
        collection.add("abc");
        collection.add(9.8);

        // 对集合遍历（对集合中元素进行查看）
        // 方式1：增强For循环
        for (Object o : collection) {
            System.out.println(o);
        }
        System.out.println("--------------------------------");
        // 方式2：iterator迭代器
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
