package day1;

/**
 * @author NJR10byh
 * @date 2022/7/13 14:29:21
 * @description 数据类型、类型转换
 */

public class task1 {
    public static void main(String[] args) {
//        long a = 10000000000;
//        System.out.println(a); // 会报错
//        报错原因：整数默认是int类型，10000000000超过了int能表示的范围
//        解决方案：long a = 10000000000L;

//        float a = 13.14;
//        System.out.println(a); // 会报错
//        报错原因：浮点数默认是double类型，导致定义时变量类型不兼容
//        解决方案：float a = 13.14F;

//        int a = 10;
//        char b = 'A';
//        System.out.println(a + b); // 75

        int i = 10;
        i += 20.3;
        System.out.println(i); // 30（+=隐含了强制转换，有数据丢失）
    }
}
