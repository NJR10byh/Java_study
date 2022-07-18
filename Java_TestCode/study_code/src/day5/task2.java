package day5;

import java.util.ArrayList;

/**
 * @author NJR10byh
 * @date 2022/7/18 10:06:45
 * @description 集合 ArrayList
 */
public class task2 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("Neymar");
        array.add("JR");
        array.add("10");

        array.add(2, "byh"); // 在下标 index 的元素前面新增指定元素，注意 index 不能大于 array.length
        System.out.println(array.size());
    }
}
