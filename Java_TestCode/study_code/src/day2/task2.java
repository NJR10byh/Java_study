package day2;

/**
 * @author NJR10byh
 * @date 2022/7/13 14:34:13
 * @description 求1000以内所有水仙花数
 */

public class task2 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            double middle = 0;
            if (i / 100 != 0) {
                // 三位数
                middle = Math.pow((i / 100), 3) + Math.pow((i / 10 % 10), 3) + Math.pow(i % 10, 3);
                if ((int) middle == i) {
                    System.out.println(i + " ");
                }
            } else if (i / 10 != 0) {
                // 两位数
                middle = Math.pow((i / 10), 3) + Math.pow(i % 10, 3);
                if ((int) middle == i) {
                    System.out.println(i + " ");
                }
            }
        }
    }
}
