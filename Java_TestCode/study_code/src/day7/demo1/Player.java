package day7.demo1;

/**
 * @author NJR10byh
 * @date 2022/7/20 10:27:29
 * @description 乒乓球、篮球运动员和教练学英语
 */

public abstract class Player extends Human {
    public Player() {
    }

    public Player(String name, int age, String sport) {
        super(name, age, sport);
    }

    public abstract void learn();
}
