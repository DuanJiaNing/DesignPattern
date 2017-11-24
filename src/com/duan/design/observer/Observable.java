package com.duan.design.observer;

/**
 * Created on 2017/11/24.
 *
 * @author DuanJiaNing
 */
public interface Observable<D> {
    void addObserver(Observer<D> observer);

    void removeObserver(Observer<D> observer);

    void notify(D data);
}
