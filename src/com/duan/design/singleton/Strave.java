package com.duan.design.singleton;

/**
 * Created on 2017/11/23.
 *
 * @author DuanJiaNing
 */
public class Strave {

    private static final Strave instance = new Strave();

    private Strave() {
    }

    public Strave getInstence() {
        return instance;
    }

}
