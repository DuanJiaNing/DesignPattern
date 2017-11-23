package com.duan.design.decorator;

/**
 * Created on 2017/11/22.
 *
 * @author DuanJiaNing
 */
public class DecoratorA extends Decorator {

    public DecoratorA(Component component) {
        super(component);
    }

    @Override
    public void sameOperation() {
        super.sameOperation();
        System.out.println("具体装饰");
    }

    public void a() {

    }
}
