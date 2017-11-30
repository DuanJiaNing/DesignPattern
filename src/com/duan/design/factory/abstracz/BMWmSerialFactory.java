package com.duan.design.factory.abstracz;

import com.duan.design.factory.product.BMWm10;
import com.duan.design.factory.product.BMWm20;

/**
 * Created on 2017/11/30.
 * 宝马 m 系工厂
 *
 * @author DuanJiaNing
 */
public class BMWmSerialFactory extends AbstractBMWFactory {

    public BMWm10 createBMWm10() {
        return new BMWm10();
    }

    public BMWm20 createBMWm20() {
        return new BMWm20();
    }
}
