package day9.demo4;

import java.util.Date;

/**
 * @author NJR10byh
 * @date 2022/7/26 16:12:43
 * @description Date
 */

public class task4 {
    public static void main(String[] args) {
        Date d = new Date();
        // 形式1：日期对象
        System.out.println(d); // Tue Jul 26 16:36:58 CST 2022

        // 形式2：时间毫秒值
        System.out.println(d.getTime()); // 1658824618395
    }
}
