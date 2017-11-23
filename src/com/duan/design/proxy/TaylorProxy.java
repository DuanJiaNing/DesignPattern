package com.duan.design.proxy;

/**
 * Created on 2017/11/23.
 * 静态代理
 *
 * @author DuanJiaNing
 */
public class TaylorProxy implements Artist {

    private ArtistTaylor taylor;

    public TaylorProxy(ArtistTaylor taylor) {
        this.taylor = taylor;
    }

    @Override
    public void meetFan() {
        System.out.println("taylor meet fans under cover");
        taylor.meetFan();
        System.out.println("seed taylor home");
    }

}
