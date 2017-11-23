package com.duan.design.flyweight;

/**
 * Created on 2017/11/23.
 * 具体享元
 *
 * @author DuanJiaNing
 */
public class ConcreteFlyweight implements Flyweight {

    /**
     * 享元的内部状态，该值用于在享元工厂中索引对应实例，从而找到实例
     */
    private final int id;

    public ConcreteFlyweight(int id) {
        this.id = id;
    }

    @Override
    public void operation() {
        System.out.println("operation " + id);
    }

    public int getId() {
        return id;
    }
}
