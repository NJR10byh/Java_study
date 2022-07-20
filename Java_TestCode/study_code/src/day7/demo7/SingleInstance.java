package day7.demo7;

/**
 * @author NJR10byh
 * @date 2022/7/20 17:47:17
 * @description 单例模式 -- 饿汉单例
 */

public class SingleInstance {

    public static SingleInstance instance = new SingleInstance();

    // 构造器私有化
    private SingleInstance() {
    }
}
