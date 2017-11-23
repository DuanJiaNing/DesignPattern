package com.duan.design.flyweight;

import java.util.function.Consumer;

/**
 * Created on 2017/11/23.
 *
 * @author DuanJiaNing
 */
public class Test {

    public static void main(String[] args) {
        ConcreteFlyweightFactory factory = new ConcreteFlyweightFactory();
        ConcreteFlyweight f = factory.getFlyweight(1);
        ConcreteFlyweight f1 = factory.getFlyweight(2);
        ConcreteFlyweight f2 = factory.getFlyweight(3);
        ConcreteFlyweight f3 = factory.getFlyweight(1); // 复用 f
        ConcreteFlyweight f4 = factory.getFlyweight(2); // 复用 f1

        p.accept(f2);
        p.accept(f3);
        p.accept(f3 == f);
        p.accept(f4 == f1);

//        输出
//        com.duan.design.flyweight.ConcreteFlyweight@776ec8df
//        com.duan.design.flyweight.ConcreteFlyweight@4eec7777
//        true
//        true
    }

    public static Consumer<Object> p = System.out::println;

}
