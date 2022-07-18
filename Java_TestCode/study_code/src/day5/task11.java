package day5;

/**
 * @author NJR10byh
 * @date 2022/7/19 00:00:55
 * @description static访问方法
 */

public class task11 {
    public void show1() {
        System.out.println("非静态show1");
        show2();
        show3();
        show4();
        // 非静态方法可访问 非静态方法 和 静态方法
    }

    public void show2() {
        System.out.println("非静态show2");
        show1();
        show3();
        show4();
        // 非静态方法可访问 非静态方法 和 静态方法
    }

    public static void show3() {
        System.out.println("静态show3");
        show4();
        // 静态方法只能访问 静态方法
    }

    public static void show4() {
        System.out.println("静态show4");
        show3();
        // 静态方法只能访问 静态方法
    }

    public static void main(String[] args) {
        // show1();
        // show2();
        // main函数为静态方法，故只能调用静态方法show3、show4
        show3();
        show4();
    }
}
