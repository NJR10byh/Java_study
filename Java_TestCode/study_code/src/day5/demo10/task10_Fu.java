package day5.demo10;

/**
 * @author NJR10byh
 * @date 2022/7/18 23:52:48
 * @description static共享成员变量
 */

public class task10_Fu {
    public String name;
    public static String university; // 表明该成员变量被所有对象共享

    public void show() {
        System.out.println("姓名：" + name);
        System.out.println("大学：" + university);
    }
}
