package day7.demo2;

/**
 * @author NJR10byh
 * @date 2022/7/20 11:27:51
 * @description 抽象类名作为形参和返回值
 */

public class task2 {
    public static void main(String[] args) {
        Animal a = new Cat();
        AnimalOperator a_o = new AnimalOperator();
        a_o.useAnimal(a); // 抽象类名作为形参

        Animal a2 = a_o.getAnimal(); // 抽象类名作为返回值
        a2.eat();
    }
}
