package day6.demo4;

/**
 * @author NJR10byh
 * @date 2022/7/19 15:19:02
 * @description 抽象类
 */

public class task4 {
    public static void main(String[] args) {
//        Animal a = new Animal();// Animal 为抽象类，无法实例化
        Animal a = new Dog(); // 可以通过子类对象实例化
        a.eat();
    }
}
