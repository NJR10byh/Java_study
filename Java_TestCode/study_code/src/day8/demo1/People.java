package day8.demo1;

/**
 * @author NJR10byh
 * @date 2022/7/25 14:46:46
 * @description 局部变量、内部类变量、外部类变量的访问
 */
class People {
    private int heartbeat = 150;

    public class Heart {
        private int heartbeat = 100;

        void show() {
            int heartbeat = 80;
            System.out.println(heartbeat); // 访问局部变量
            System.out.println(this.heartbeat); // 访问内部类变量
            System.out.println(People.this.heartbeat); // 访问外部类变量
        }
    }
}
