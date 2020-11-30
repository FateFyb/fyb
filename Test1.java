package com.qfedu.test;


import java.util.*;

public class Test1{


    public static void main(String[] args) {

        //size:返回此列表中的元素个数
        ArrayList<Object> list = new ArrayList<Object>();

        int size = list.size();
        System.out.println("size=" + size); //没有数据则结果为0
        list.add("Hello,World"); //添加一个数据
        int size1 = list.size();
        System.out.println("size1=" + size1); //打印结果为1
        System.out.println("************************************************************");


        List<Object> list1 = new ArrayList<Object>();
        System.out.println("是否为空：" + list1.isEmpty()); //没有数据则返回true
        list.add("Hello,Bear");
        System.out.println("是否为空：" + list1.isEmpty()); //有数据则返回false


        //返回一个列表迭代器，可用于遍历集合内容
        List<String> list2 = new ArrayList<>();
        list2.add("This is a listIterator method");
        list2.add("This is a listIterator method");
        list2.add("This is a listIterator method");
        list2.add("This is a listIterator method");
        ListIterator<String> listIterator = list2.listIterator();
        while (listIterator.hasNext()) { //如果有元素
            String next = listIterator.next(); //遍历这个集合
            System.out.println(next);
            System.out.println("*******************************");
        }


        //spliterator:用于分割和遍历集合
        List<String> list3 = new ArrayList<>();
        list3.add("This is a spliterator method1");
        list3.add("This is a spliterator method2");
        list3.add("This is a spliterator method3");

        Spliterator<String> spliterator = list3.spliterator();
        spliterator.forEachRemaining(System.out::println); //调用Spliterator接口的方法遍历集合数据
        System.out.println("*****************************************");


        //subList:返回此集合在指定区间位置的元素
        List<String> list5 = new ArrayList<>();
        list5.add("-------------------------");
        list5.add("A1");
        list5.add("A2");
        list5.add("-------------------------");
        List<String> subList = list5.subList(1, 3); //获取1-3号索引区间的值
        System.out.println(subList);


        List<Integer> list7 = Arrays.asList(10, 1, 6, 4, 8, 7, 9, 3, 2, 5);

        System.out.println("原始数据：");
        list7.forEach(n -> {
            System.out.print(n + ", ");
        });

        System.out.println("");
        System.out.println("升序排列：");
        Collections.sort(list7); // 升序排列
        list.forEach(n -> {
            System.out.print(n + ", ");
        });

        System.out.println("");
        System.out.println("降序排列：");
        Collections.reverse(list); // 倒序排列
        list.forEach(n -> {
            System.out.print(n + ", ");
        });















    }
}
