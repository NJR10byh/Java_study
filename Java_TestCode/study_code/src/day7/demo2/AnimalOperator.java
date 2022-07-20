package day7.demo2;

/**
 * @author NJR10byh
 * @date 2022/7/20 14:33:29
 * @description 抽象类名作为形参和返回值
 */

public class AnimalOperator {
    // 抽象类名作为形参
    public void useAnimal(Animal a) {
        a.eat();
    }

    // 抽象类名作为返回值
    public Cat getAnimal() {
        Cat c = new Cat();
        return c;
    }
}
