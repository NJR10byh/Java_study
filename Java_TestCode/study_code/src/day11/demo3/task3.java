package day11.demo3;

import java.util.LinkedList;

/**
 * @author NJR10byh
 * @date 2022/7/28 14:38:17
 * @description LinkedList（首尾操作效率极高）
 */

public class task3 {
    public static void main(String[] args) {
        LinkedList<String> stark = new LinkedList<>();
        stark.addFirst("1");
        stark.addFirst("2");
        stark.addFirst("3");
        stark.addFirst("4");
        System.out.println(stark); // [4, 3, 2, 1]

        stark.removeLast();
        System.out.println(stark); // [4, 3, 2]

        stark.removeFirst();
        System.out.println(stark); // [3, 2]
    }
}
