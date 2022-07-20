package day7.demo1;

/**
 * @author NJR10byh
 * @date 2022/7/20 11:10:27
 * @description
 */

public abstract class Human {

    private String name;
    private int age;
    private String sport;

    public Human() {
    }

    public Human(String name, int age, String sport) {
        this.name = name;
        this.age = age;
        this.sport = sport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
