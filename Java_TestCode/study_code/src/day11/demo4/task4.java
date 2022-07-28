package day11.demo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author NJR10byh
 * @date 2022/7/28 14:56:41
 * @description 迭代器遍历删除
 */

public class task4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("C++");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("Go");
        list.add("Java");
        list.add("Rust");

        System.out.println(list);

        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Java")) {
                // list.remove(it.next()); // 会报错，因为可能会漏删
                it.remove(); // 解决方法，不使用集合中的删除，使用迭代器中的删除
            }
        }
        System.out.println(list);
    }
}
