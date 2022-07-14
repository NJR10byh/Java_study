package day2;

/**
 * @author NJR10byh
 * @date 2022/7/13 16:03:52
 * @description 带参数方法的定义和调用
 */

public class task6 {
    public static void main(String[] args) {
        int m = 10, n = 20;
        System.out.println(maxNum(m, n));
    }

    public static int maxNum(int a, int b) {
        return a >= b ? a : b;
    }
}
