package main.java.com.example.srpingbootdemo.entity;

import java.util.Objects;

/**
 * @description: Springcloud product
 * @author: fashion wei,愿诸神保佑，我的代码永无bug
 * @create: 2020-05-04
 **/
public class Product {

    private String name;
    private Integer age;
    private String add;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(age, product.age) &&
                Objects.equals(add, product.add);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, add);
    }

    public Product() {
        this.name = "位小东";
        this.age =18;
        this.add="beijing";
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", add='" + add + '\'' +
                '}';
    }
}
