package day7.demo1;

/**
 * @author NJR10byh
 * @date 2022/7/20 10:46:40
 * @description 乒乓球、篮球运动员和教练学英语
 */

public class Pingpongball_Coach extends Coach implements Learning {
    public void learnEnglish() {
        System.out.println("乒乓教练学会英语了");
    }

    public void teach() {
        System.out.println("乒乓教练教学");
    }
}
