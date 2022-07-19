package day5.demo3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author NJR10byh
 * @date 2022/7/18 14:55:48
 * @description ArrayList存储学生类对象并遍历（用户手动输入信息）
 */

public class task3 {
    public static void main(String[] args) {
        ArrayList<task3_Student> array = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入第 " + (i + 1) + " 位姓名: ");
            String n = scanner.nextLine();
            System.out.print("请输入第 " + (i + 1) + " 位年龄: ");
            int a = scanner.nextInt();

            task3_Student s = new task3_Student(n, a);
            array.add(s);
        }

        for (int i = 0; i < array.size(); i++) {
            task3_Student s = array.get(i);
            System.out.println("name: " + s.getName());
            System.out.println("age: " + s.getAge());
        }
    }
}
