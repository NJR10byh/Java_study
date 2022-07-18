package day5;

/**
 * @author NJR10byh
 * @date 2022/7/18 16:47:06
 * @description 继承中构造方法的访问特点
 */

public class task5 {
    public static void main(String[] args) {
        task5_Zi task5_zi = new task5_Zi();
        /**
         * result
         * 调用了task5_Fu无参构造方法
         * 调用了task5_Zi无参构造方法
         */

        task5_Zi task5_zi_2 = new task5_Zi(20);
        /**
         * result
         * 调用了task5_Fu无参构造方法
         * 调用了task5_Zi带参构造方法
         */

        /**
         * reason
         * 1、子类会继承父类中的数据，所以要在子类初始化前完成父类数据的初始化；
         * 2、每一个子类构造方法的第一条默认语句都是super()
         */
    }
}
