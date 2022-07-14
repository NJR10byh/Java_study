package day3;

/**
 * @author NJR10byh
 * @date 2022/7/14 16:24:01
 * @description 100以内逢七过
 */
public class task2 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (!(i % 10 == 7 || i / 10 == 7 || i % 7 == 0)) {
                System.out.print(i + " ");
            }
        }
    }
}
