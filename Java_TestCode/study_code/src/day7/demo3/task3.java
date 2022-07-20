package day7.demo3;

import java.util.Random;
import java.util.Scanner;

/**
 * @author NJR10byh
 * @date 2022/7/20 14:49:06
 * @description 随机生成5位验证码
 */

public class task3 {
    public static void main(String[] args) {
        String s = "";
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("您希望输出几位验证码：");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    // 数字
                    s += random.nextInt(10);
                    break;
                case 1:
                    // 小写字母
                    s += (char) (random.nextInt(26) + 97);
                    break;
                case 2:
                    // 大写字母
                    s += (char) (random.nextInt(26) + 65);
                    break;
            }
        }
        System.out.println("验证码是：" + s);
    }
}
