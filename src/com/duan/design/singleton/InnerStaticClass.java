package com.duan.design.singleton;

/**
 * Created on 2017/11/23.
 *
 * @author DuanJiaNing
 */
public class InnerStaticClass {

    private InnerStaticClass() {
    }

    public static InnerStaticClass getInstance() {
        return Inner.instance;
    }

    private static class Inner {
        private static final InnerStaticClass instance = new InnerStaticClass();
    }

}
