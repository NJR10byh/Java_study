package day6.demo1;

/**
 * @author NJR10byh
 * @date 2022/7/19 14:18:59
 * @description 多态
 */

public class dog extends Animal { // 1、有继承
    @Override // 2、有方法重写
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
