package day7.demo1;

/**
 * @author NJR10byh
 * @date 2022/7/20 10:37:21
 * @description
 */

public class task1 {
    public static void main(String[] args) {
        Pingpongball_Player p_p = new Pingpongball_Player();
        p_p.learn();
        p_p.learnEnglish();

        Pingpongball_Coach p_c = new Pingpongball_Coach();
        p_c.teach();
        p_c.learnEnglish();

        Basketball_Player b_p = new Basketball_Player();
        b_p.learn();

        Basketball_Coach b_c = new Basketball_Coach();
        b_c.teach();
    }
}
