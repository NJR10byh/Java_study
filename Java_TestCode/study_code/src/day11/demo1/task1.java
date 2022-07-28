package day11.demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author NJR10byh
 * @date 2022/7/28 10:46:44
 * @description Collection
 */

public class task1 {
    public static void main(String[] args) {
        // 有序、可重复、有索引
        Collection list = new ArrayList();
        list.add("Java");
        list.add("Java");
        list.add("SE");
        list.add(12);
        list.add(12);
        list.add(45);
        list.add(true);
        list.add(false);
        list.add(true);
        list.add(null);
        System.out.println(list); // [Java, Java, SE, 12, 12, 45, true, false, true, null]

        // 无序、不重复、无索引
        Collection hashSet = new HashSet();
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("SE");
        hashSet.add(12);
        hashSet.add(12);
        hashSet.add(45);
        hashSet.add(true);
        hashSet.add(false);
        hashSet.add(true);
        hashSet.add(null);
        System.out.println(hashSet); // [null, Java, SE, false, 12, 45, true]

    }
}
