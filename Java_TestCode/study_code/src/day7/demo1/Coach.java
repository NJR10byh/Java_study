package day7.demo1;

/**
 * @author NJR10byh
 * @date 2022/7/20 11:00:26
 * @description 乒乓球、篮球运动员和教练学英语
 */

public abstract class Coach extends Human {
    public Coach() {
    }

    public Coach(String name, int age, String sport) {
        super(name, age, sport);
    }

    public abstract void teach();
}
