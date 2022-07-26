package day9.demo11;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author NJR10byh
 * @date 2022/7/26 19:18:37
 * @description Period（日期间隔）
 */

public class task11 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthday = LocalDate.of(2000, 10, 7);
        System.out.println(birthday);

        Period period = Period.between(birthday, today); // 第二个参数 - 第一个参数

        System.out.printf("距出生已经：%d年 %d个月 %d天", period.getYears(), period.getMonths(), period.getDays());
    }
}
