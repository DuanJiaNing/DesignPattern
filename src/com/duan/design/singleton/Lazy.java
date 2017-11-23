package com.duan.design.singleton;

/**
 * Created on 2017/11/23.
 *
 * @author DuanJiaNing
 */
public class Lazy {

    private static Lazy instance;

    private Lazy() {
    }

    public static Lazy getInstance() {
        if (instance == null) {
            instance = new Lazy();
        }

        return instance;
    }
}
