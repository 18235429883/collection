package com.example.test01;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * ListIterator迭代器
 */
public class Test05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        // 需求：想在list集合元素"cc"后添加一个"kk"元素
        /*
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if ("cc".equals(iterator.next())){
                list.add("kk");
            }
        }
        System.out.println(list);
        */
        // 运行上面代码程序出错：java.util.ConcurrentModificationException 并发修改异常
        // 出错原因：迭代器和list集合同时对集合进行操作
        // 解决办法：事情让一个“人”做 ----> 引入新的迭代器：ListIterator 迭代和添加操作都是靠ListIterator来完成的
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if ("cc".equals(listIterator.next())) {
                listIterator.add("kk");
            }
        }
        System.out.println(list);

        // 在ListIterator中还有一些特有方法
        // 判断是否有上一个元素，由此可以进行逆向数据遍历
        listIterator.hasPrevious();
    }
}
