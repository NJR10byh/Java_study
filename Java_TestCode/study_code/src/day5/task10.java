package day5;

/**
 * @author NJR10byh
 * @date 2022/7/18 23:52:40
 * @description static共享成员变量
 */

public class task10 {
    public static void main(String[] args) {
        task10_Fu.university = "南京邮电大学";

        task10_Fu t1 = new task10_Fu();
        t1.name = "Tutu";
        t1.show();

        task10_Fu t2 = new task10_Fu();
        t2.name = "Baobao";
        t2.show();
    }
}
