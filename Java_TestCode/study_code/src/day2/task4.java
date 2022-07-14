package day2;

import java.util.Random;

/**
 * @author NJR10byh
 * @date 2022/7/13 14:36:49
 * @description Random探索
 */

public class task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10);
        System.out.println(num);

//        获得[MIN, MAX]的随机数
//        int randNumber = rand.nextInt(MAX - MIN + 1) + MIN;
    }
}
