package day9.demo2;

import java.util.Objects;

/**
 * @author NJR10byh
 * @date 2022/7/26 13:55:13
 * @description equals 与 Object.equals
 */

public class task2 {
    public static void main(String[] args) {
        People p1 = new People("张三", 19, "男");
        People p2 = new People("张三", 19, "男");

        System.out.println(p1.equals(p2));

        String a1 = null;
        String a2 = "njr";
//        System.out.println(a1.equals(a2)); // Cannot invoke "String.equals(Object)" because "a1" is null
        System.out.println(Objects.equals(a1, a2));// Objects.equals更安全，它会提前先判断比较的值是否为null，再进行比较
    }
}