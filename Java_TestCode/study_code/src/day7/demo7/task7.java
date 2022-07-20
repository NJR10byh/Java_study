package day7.demo7;

/**
 * @author NJR10byh
 * @date 2022/7/20 17:46:44
 * @description 单例模式 -- 饿汉单例
 */

public class task7 {
    public static void main(String[] args) {
        SingleInstance s1 = SingleInstance.instance;
        SingleInstance s2 = SingleInstance.instance;

        System.out.println(s1 == s2); // true
    }
}
