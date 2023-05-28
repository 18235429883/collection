package com.example.test01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List接口常用方法（这里只作特例）
 * 增加：add(int index, E element)
 * 删除：remove(int index)  remove(Object o)
 * 修改：set(int index, E element)
 * 查看：get(int index)
 */
public class Test03 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(13);
        list.add(17);
        list.add(6);
        list.add(-1);
        list.add(2);
        list.add("abc");
        System.out.println(list);

        // add(int index, E element) 指定位置添加元素
        list.add(3, 66);
        System.out.println(list);

        // set(int index, E element) 修改指定位置的元素
        list.set(3, 77);
        System.out.println(list);

        // remove(int index)  remove(Object o) 在集合中存入的是Integer类型数据，调用remove方法调用的是 remove(int index) 根据索引下标进行删除元素
        list.remove(2);
        System.out.println("删除下标为2索引的元素：" + list);
        list.remove("abc");
        System.out.println("删除元素abc：" + list);

        // get(int index) 根据索引查看元素
        System.out.println(list.get(0));

        System.out.println("------------------------------------------------");

        // List集合遍历方式：
        // 1.普通for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("------------------------------------------------");
        // 2.增强for循环
        for (Object o : list) {
            System.out.println(o);
        }

        System.out.println("------------------------------------------------");
        // 3.迭代器遍历
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
