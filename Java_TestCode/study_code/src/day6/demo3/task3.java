package day6.demo3;

/**
 * @author NJR10byh
 * @date 2022/7/19 14:41:02
 * @description 多态中的转型
 */

public class task3 {
    public static void main(String[] args) {
        Animal a = new dog(); // 向上转型 子类对象作为父类引用
        a.eat();

        dog d = (dog) a; // 向下转型 父类引用转为子类对象
        d.eat();
        d.drink();
    }
}
