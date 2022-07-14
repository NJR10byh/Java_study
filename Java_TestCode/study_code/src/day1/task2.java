package day1;

import java.util.Scanner;

/**
 * @author NJR10byh
 * @date 2022/7/13 14:30:42
 * @description p*mr*(1+mr)^m/((1+mr)^m-1) -- 等额本息计算房贷
 * p:贷款本金（元）
 * mr:月利率
 * m:还款月数
 */

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入贷款本金");
        double principal = scanner.nextDouble();// 用户输入本金
        System.out.println("请输入年利率");
        double yr = scanner.nextDouble();// 年利率
        double mr = yr / 12.0 / 100;
        System.out.println("请输入贷款月数");
        int months = scanner.nextInt();// 用户输入贷款月数
        double monthlyamount = principal * mr * Math.pow((1 + mr), months) / (Math.pow((1 + mr), months) - 1);
        System.out.println("每月需要还：" + monthlyamount + "元");
    }
}
