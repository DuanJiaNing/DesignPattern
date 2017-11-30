package com.duan.design.factory.simple;

import com.duan.design.factory.product.BMWm20;

/**
 * Created on 2017/11/30.
 * 宝马 m 系 20 车型工厂
 *
 * @author DuanJiaNing
 */
public class BMWm20Factory {

    public BMWm20 createBMWm20() {
        return new BMWm20();
    }

    // 当需要增加一种车型时需要直接修改代码（违背开闭原则）
    //public BMWm10 createBMW10(){}
}
