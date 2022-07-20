package day7.demo8;

/**
 * @author NJR10byh
 * @date 2022/7/20 18:02:05
 * @description 单例模式 -- 懒汉单例
 */

public class task8 {
    public static void main(String[] args) {
        SingleInstance instance1 = SingleInstance.getInstance();
        SingleInstance instance2 = SingleInstance.getInstance();

        System.out.println(instance1 == instance2); // true
    }
}
