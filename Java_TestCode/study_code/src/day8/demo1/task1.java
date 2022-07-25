package day8.demo1;

/**
 * @author NJR10byh
 * @date 2022/7/25 14:46:10
 * @description 在内部类的成员方法中，对局部变量、内部类变量、外部类变量的访问
 */
public class task1 {
    public static void main(String[] args) {
        People.Heart h = new People().new Heart();
        h.show();
    }
}
