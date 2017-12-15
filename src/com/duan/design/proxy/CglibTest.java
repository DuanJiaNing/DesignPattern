package com.duan.design.proxy;

import com.duan.design.P;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created on 2017/12/15.
 *
 * @author DuanJiaNing
 */
public class CglibTest {

    public static void main(String[] args) {
        getArtist(new ArtistProxy()).perform(new Date());
        // before show
        // perform when Fri Dec 15 18:27:33 CST 2017
        // after show

    }

    static Artist getArtist(ArtistProxy proxy) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Artist.class);
        enhancer.setCallback(proxy);
        return (Artist) enhancer.create();
    }

    static class ArtistProxy implements MethodInterceptor {

        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            P.p.accept("before show");
            Object res = methodProxy.invokeSuper(o, objects);
            P.p.accept("after show");
            return res;
        }
    }

    static class Artist {

        public String perform(Date when) {
            P.p.accept("perform when " + when);
            return "show is over";
        }
    }
}
