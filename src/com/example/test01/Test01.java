package com.example.test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Collection集合常用方法
 */
public class Test01 {
    public static void main(String[] args) {
        /*
         * Collection接口的常用方法：
         * 增加：add(E e) addAll(Collection<? extends E> c)
         * 删除：clear() remove(Object o)
         * 修改：
         * 查看：iterator() size()
         * 判断：contains(Object o)  equals(Object o) isEmpty()
         */

        // 创建对象：接口不能创建对象，利用实现类创建对象，这里用了多态
        Collection<Object> collection = new ArrayList<>();

        // 1.add(E e)：往集合中添加元素
        // 集合有一个特点：只能存放引用数据类型的数据，不能是基本数据类型
        // 这里不报错原因：基本数据类型自动装箱，对应int类型的包装类Integer  int ----> Integer
        collection.add(18);
        collection.add(12);
        collection.add(11);
        collection.add(17);
        System.out.println(collection);

        // 2.addAll(Collection<? extends E> c)：往集合中添加一个集合，参数类型为Collection集合
        // 通过Arrays数组工具类的 asList 方法，可以将数组转换为集合
        List<Integer> list = Arrays.asList(11, 15, 13, 16, 26);
        collection.addAll(list);
        System.out.println(collection);

        // 3.clear()：清空集合元素
        // collection.clear();
        System.out.println(collection);

        System.out.println("集合中元素的数量为：" + collection.size());

        System.out.println("集合是否为空：" + collection.isEmpty());

        // 4.remove(Object o)：删除集合元素
        boolean isRemove = collection.remove(18);
        System.out.println(collection);
        System.out.println("集合中数据是否被删除：" + isRemove);

        // 5.equals(Object o) 判断集合是否相等
        Collection<Object> collection2 = new ArrayList<>();
        collection2.add(18);
        collection2.add(12);
        collection2.add(11);
        collection2.add(17);

        Collection<Object> collection3 = new ArrayList<>();
        collection3.add(18);
        collection3.add(12);
        collection3.add(11);
        collection3.add(17);

        // 6.判断两个集合是否相等，比较的是集合中的元素是否相等
        System.out.println(collection2.equals(collection3));
        // == 比较的是两个集合的地址值
        System.out.println(collection2 == collection3);

        // 7.contains(Object o) 是否包含元素
        System.out.println("是否包含元素:" + collection3.contains(17));

    }
}
