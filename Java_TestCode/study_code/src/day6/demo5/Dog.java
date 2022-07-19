package day6.demo5;

/**
 * @author NJR10byh
 * @date 2022/7/19 17:35:41
 * @description
 */

public class Dog extends Animal implements Jumpping {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void Jump() {
        System.out.println("狗会跳高了");
    }
}
