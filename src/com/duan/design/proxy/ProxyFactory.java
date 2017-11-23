package com.duan.design.proxy;

import com.sun.istack.internal.NotNull;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created on 2017/11/23.
 * 动态代理
 *
 * @author DuanJiaNing
 */
public class ProxyFactory {

    public static Object getProxyInstance(@NotNull final Object object,
                                          @NotNull final Invocations invocations) {
        return Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    invocations.before(proxy, method, args);
                    Object o = method.invoke(object, args);
                    invocations.after(proxy, method, args);
                    return o;
                }
        );
    }


    public interface Invocations {

        void before(Object proxy, Method method, Object[] args);

        void after(Object proxy, Method method, Object[] args);
    }
}
