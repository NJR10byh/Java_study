package day7.demo6;

/**
 * @author NJR10byh
 * @date 2022/7/20 17:17:13
 * @description 静态代码块、构造代码块
 */

public class testClass {
    // 静态代码块（随类一起被优先加载）
    private int age;
    private static String name;

    static {
//        age = 1;// 只能访问静态资源
        name = "aaa";
        System.out.println("我是静态代码块");
    }

    // 构造代码块（随对象一起被加载），在构造方法前执行
    {
        System.out.println("我是构造代码块");
    }

    public void getInfo() {
        System.out.println("姓名：" + name);
    }
}
