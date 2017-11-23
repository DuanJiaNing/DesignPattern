package com.duan.design.decorator;

/**
 * Created on 2017/11/22.
 *
 * @author DuanJiaNing
 */
public class Decorator implements Component {

    private final Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void sameOperation() {
        component.sameOperation();
        System.out.println("抽象装饰");
    }
}
