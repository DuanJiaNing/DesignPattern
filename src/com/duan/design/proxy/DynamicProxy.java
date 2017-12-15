package com.duan.design.proxy;

import java.lang.reflect.Proxy;
import java.util.function.Consumer;

/**
 * Created on 2017/12/15.
 *
 * @author DuanJiaNing
 */
public class DynamicProxy {

    public static void main(String[] args) {
        // 要代理的目标对象
        final Artist artist = new ArtistTaylor();
        // 代理对象
        Artist proxy = (Artist) Proxy.newProxyInstance(
                artist.getClass().getClassLoader(),
                artist.getClass().getInterfaces(),
                (proxy1, method, args1) -> {
                    p.accept("before");
                    Object o = method.invoke(artist, args1); // 执行接口的方法
                    p.accept("after");
                    return o;
                });
        proxy.meetFan();
    }

    public static Consumer<Object> p = System.out::println;
}
