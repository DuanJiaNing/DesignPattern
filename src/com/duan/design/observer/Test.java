package com.duan.design.observer;

import com.duan.design.Utils;

/**
 * Created on 2017/11/24.
 *
 * @author DuanJiaNing
 */
public class Test {

    public static void main(String[] args) {
        NewsProvider provider = new NewsProvider();
        Observer<News> ob1 = data -> Utils.p.accept("ob1 " + data);
        Observer<News> ob2 = data -> Utils.p.accept("ob2 " + data);
        Observer<News> ob3 = data -> Utils.p.accept("ob3 " + data);

        provider.addObserver(ob1);
        provider.addObserver(ob2);
        provider.addObserver(ob3);

        provider.newsComing(new News("news1", "content1"));
        provider.newsComing(new News("news2", "content2"));

//        输出
//        ob1 News(title=news1, content=content1)
//        ob2 News(title=news1, content=content1)
//        ob3 News(title=news1, content=content1)
//        ob1 News(title=news2, content=content2)
//        ob2 News(title=news2, content=content2)
//        ob3 News(title=news2, content=content2)
    }
}
