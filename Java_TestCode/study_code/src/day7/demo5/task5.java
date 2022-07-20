package day7.demo5;

import java.util.Scanner;

/**
 * @author NJR10byh
 * @date 2022/7/20 16:08:19
 * @description 调用工具类，隐私手机号码
 */

public class task5 {
    public static void main(String[] args) {
        System.out.print("请输入手机号：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(telTool.telHide(s));
    }
}
