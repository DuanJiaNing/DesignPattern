package com.duan.design.observer;

import java.util.Vector;

/**
 * Created on 2017/11/24.
 *
 * @author DuanJiaNing
 */
public class NewsProvider implements Observable<News> {

    private final Vector<Observer<News>> observers = new Vector<>();

    @Override
    public void addObserver(Observer<News> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<News> observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(News data) {
        for (Observer o : observers) {
            o.onNotify(data);
        }
    }

    public void newsComing(News news) {
        notify(news);
    }

}
