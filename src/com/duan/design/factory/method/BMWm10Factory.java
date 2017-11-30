package com.duan.design.factory.method;

import com.duan.design.factory.product.BMWm10;

/**
 * Created on 2017/11/30.
 * 宝马 m 系 10 车型工厂
 *
 * @author DuanJiaNing
 */
public class BMWm10Factory extends AbstractBMWmSerialFactory {

    public BMWm10 createBMWm10() {
        return new BMWm10();
    }
}
