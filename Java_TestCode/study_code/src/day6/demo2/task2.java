package day6.demo2;

/**
 * @author NJR10byh
 * @date 2022/7/19 14:26:35
 * @description 多态中成员访问的特点
 */

public class task2 {
    public static void main(String[] args) {
        Animal a = new dog();
        System.out.println(a.age);
        // System.out.println(a.height);
        // 访问成员变量，编译看左边，执行看左边

        a.eat(); // 狗吃骨头（重写）
        // a.drink();
        // 访问成员方法，编译看左边，执行看右边
    }
}
