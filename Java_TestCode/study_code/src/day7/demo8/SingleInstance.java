package day7.demo8;

/**
 * @author NJR10byh
 * @date 2022/7/20 18:02:29
 * @description 单例模式 -- 懒汉单例
 */

public class SingleInstance {
    // 构造器私有化
    private SingleInstance() {
    }

    private static SingleInstance instance;

    public static SingleInstance getInstance() {
        // 只有第一次来创建对象，才创建一个新的对象返回
        if (instance == null) {
            instance = new SingleInstance();
        }
        // 如果对象不为null，说明对象已经被创建，直接返回该地址即可
        return instance;
    }

}
