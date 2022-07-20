package day7.demo1;

/**
 * @author NJR10byh
 * @date 2022/7/20 10:32:10
 * @description 乒乓球、篮球运动员和教练学英语
 */

public class Pingpongball_Player extends Player implements Learning {
    public void learnEnglish() {
        System.out.println("乒乓球运动员学会英语了");
    }

    public void learn() {
        System.out.println("乒乓球运动员学习");
    }
}
