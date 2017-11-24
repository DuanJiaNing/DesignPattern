package com.duan.design.observer;

/**
 * Created on 2017/11/24.
 *
 * @author DuanJiaNing
 */
@FunctionalInterface
public interface Observer<D> {

    void onNotify(D data);

}
