package day7.demo4;

/**
 * @author NJR10byh
 * @date 2022/7/20 15:39:46
 * @description 购物车模型架构
 */

public class Goods {
    private String name;
    private Double price;
    private int count;

    public Goods() {
    }

    public Goods(String name, Double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
