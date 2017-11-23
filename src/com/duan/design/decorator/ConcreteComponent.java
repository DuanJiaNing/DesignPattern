package com.duan.design.decorator;

/**
 * Created on 2017/11/22.
 *
 * @author DuanJiaNing
 */
public class ConcreteComponent  implements Component{

    @Override
    public void sameOperation() {
        System.out.println("实际功能");
    }

}
