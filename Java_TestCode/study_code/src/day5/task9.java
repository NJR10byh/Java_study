package day5;

/**
 * @author NJR10byh
 * @date 2022/7/18 23:40:47
 * @description final修饰局部变量 和 引用类型变量
 */

public class task9 {
    public static void main(String[] args) {
        // final修饰 局部变量
        final int count = 100;
        // count = 20; // 报错：final修饰的局部变量已经为最终值，不可被重新赋值
        System.out.println(count);

        // final修饰 引用类型变量
        final task9_Fu t = new task9_Fu();
        t.age = 100; // 不报错：final修饰的引用类型变量为t，t是一个地址值，不能变，但是其指向的内容可以被修改
        System.out.println(t.age);

        // t = new task9_Fu(); // 报错：t被final修饰，其地址值不能被修改
    }
}
