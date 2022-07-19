package day6.demo3;

/**
 * @author NJR10byh
 * @date 2022/7/19 14:41:02
 * @description 多态中的转型
 */

public class dog extends Animal {
    public int age = 50;
    public int height = 100;

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void drink() {
        System.out.println("狗喝水");
    }
}
