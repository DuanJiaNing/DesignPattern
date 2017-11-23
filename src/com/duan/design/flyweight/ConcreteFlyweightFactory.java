package com.duan.design.flyweight;

import java.util.Hashtable;

/**
 * Created on 2017/11/23.
 * 享元工厂
 *
 * @author DuanJiaNing
 */
public class ConcreteFlyweightFactory {

    private final Hashtable<Integer, ConcreteFlyweight> flyweights = new Hashtable<>();

    /**
     * 从享元工厂中获取实例，如果实例已经存在于享元工厂直接返回，否则创建实例，加入工厂并返回
     *
     * @param id 内部状态
     * @return
     */
    public ConcreteFlyweight getFlyweight(int id) {
        ConcreteFlyweight flyweight = flyweights.get(id);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(id);
            flyweights.put(id, flyweight);
        }
        return flyweight;
    }
}
