package day10.demo2;

import java.util.Scanner;

/**
 * @author NJR10byh
 * @date 2022/7/27 11:17:52
 * @description 正则表达式
 */

public class task2_zhengze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 检查手机号格式
        while (true) {
            System.out.print("请输入手机号码：");
            String userPhone = scanner.nextLine();
            if (validate.validatePhone(userPhone)) {
                System.out.println("校验通过！");
                break;
            } else {
                System.out.println("校验失败，请重试！");
            }
        }

        // 检查邮箱格式
        while (true) {
            System.out.print("请输入邮箱：");
            String userEmail = scanner.nextLine();
            if (validate.validateEmail(userEmail)) {
                System.out.println("校验通过！");
                break;
            } else {
                System.out.println("校验失败，请重试！");
            }
        }

        // 校验电话格式
        while (true) {
            System.out.print("请输入电话：");
            String userTelePhone = scanner.nextLine();
            if (validate.validateTelePhone(userTelePhone)) {
                System.out.println("校验通过！");
                break;
            } else {
                System.out.println("校验失败，请重试！");
            }
        }
    }

}
