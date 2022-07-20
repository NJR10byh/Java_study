package day7.demo4;

import java.util.ArrayList;

/**
 * @author NJR10byh
 * @date 2022/7/20 15:42:12
 * @description 集合充当购物车
 */

public class ShoppingCar {
    public static void main(String[] args) {
        ArrayList<Goods> array = new ArrayList<Goods>();

        Goods g1 = new Goods();
        g1.setName("MacBook Pro 14");
        g1.setPrice(13899.00);
        g1.setCount(2);
        array.add(g1);

        Goods g2 = new Goods();
        g2.setName("MacBook Air");
        g2.setPrice(7999.00);
        g2.setCount(1);
        array.add(g2);

        System.out.println(array.get(0).getPrice());
    }

}
