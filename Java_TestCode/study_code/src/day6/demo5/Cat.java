package day6.demo5;

/**
 * @author NJR10byh
 * @date 2022/7/19 17:33:49
 * @description
 */

public class Cat extends Animal implements Jumpping {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void Jump() {
        System.out.println("猫会跳高了");
    }
}
