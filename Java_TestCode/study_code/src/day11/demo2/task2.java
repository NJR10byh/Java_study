package day11.demo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author NJR10byh
 * @date 2022/7/28 11:25:50
 * @description 一些循环方法
 */

public class task2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaScript");
        list.add("Python");

        // 迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("-----------------");

        // foreach
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-----------------");

        // JDK 1.8后的Lambda表达式
        list.forEach(str -> {
            System.out.println(str);
        });
    }
}
