package day6.demo4;

/**
 * @author NJR10byh
 * @date 2022/7/19 15:19:16
 * @description 抽象类
 */

public abstract class Animal {
    public abstract void eat();

    public void drink() {
        System.out.println("动物喝水");
    }
}
