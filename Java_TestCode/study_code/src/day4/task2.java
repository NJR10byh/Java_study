package day4;

import java.util.Scanner;

/**
 * @author NJR10byh
 * @date 2022/7/15 18:29:08
 * @description 模拟用户登录（使用equals比较）
 */
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = "njr10byh";
        String passWord = "123456";
        boolean result = false;
        while (!result) {
            System.out.print("请输入用户名：");
            String username = scanner.nextLine();
            System.out.print("请输入密码：");
            String password = scanner.nextLine();

            if (username.equals(userName) && password.equals(passWord)) {
                result = true;
            } else {
                System.out.println("登录失败，请重新登录！");
            }
        }
        System.out.println("登录成功！");
    }
}
