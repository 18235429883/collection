package com.example.test01;

import com.example.entry.Student;

import java.util.HashSet;

/**
 * HashSet集合针对不同数据类型的示例
 */
public class Test06 {
    public static void main(String[] args) {
        // 调用方法set1
        set1();
        System.out.println("--------------------------------");

        // 调用方法set2
        set2();
        System.out.println("--------------------------------");

        // 调用方法set3
        set3();
        System.out.println("--------------------------------");
    }

    /**
     * HashSet放入Integer类型数据
     */
    public static void set1() {
        // 创建一个HashSet集合：
        HashSet<Integer> set = new HashSet<>();
        set.add(19);
        set.add(5);
        set.add(20);
        set.add(19);
        set.add(41);
        set.add(0);
        System.out.println(set.size());
        System.out.println(set);
        // 通过结果可以查看到set集合中的数据是无序且唯一的
    }

    /**
     * HashSet放入String类型数据
     */
    public static void set2() {
        //创建一个HashSet集合：
        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("apple");
        hs.add("banana");
        hs.add("html");
        hs.add("apple");
        hs.add("css");
        System.out.println(hs.size());
        System.out.println(hs);
        // 通过结果可以查看到set集合针对String类型数据也是无序且唯一的
    }

    /**
     * HashSet放入自定义的引用数据类型的数据
     */
    public static void set3() {
        HashSet<Student> hs = new HashSet<>();
        hs.add(new Student(19, "lili"));
        hs.add(new Student(20, "lulu"));
        hs.add(new Student(18, "feifei"));
        hs.add(new Student(19, "lili"));
        hs.add(new Student(10, "nana"));
        System.out.println(hs.size());
        System.out.println(hs);
        // 查看结果，自定义类型不满足唯一，无序的特点，这是为什么？
        // 因为HastSet底层是数组+链表形成的哈希表结构，放入HashSet中的数据，一定要重写两个方法 hashCode、equals方法 才会实现无序、唯一
    }
}
