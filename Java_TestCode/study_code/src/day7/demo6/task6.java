package day7.demo6;

/**
 * @author NJR10byh
 * @date 2022/7/20 17:17:18
 * @description 静态代码块、构造代码块
 */

public class task6 {
    static {
//        age = 1;// 只能访问静态资源
        System.out.println("我是main前的静态代码块");
    }

    public static void main(String[] args) {
        testClass t = new testClass();
        //加载有类时，静态代码块被优先执行，且只执行一次，在构造方法前执行
        // 只有创建对象时，构造代码块才会被执行
        t.getInfo();
    }
}
