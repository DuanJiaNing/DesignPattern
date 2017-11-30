package com.duan.design.factory.method;

import com.duan.design.factory.product.BMWm10;
import com.duan.design.factory.serial.BMWmSerial;

/**
 * Created on 2017/11/30.
 * 宝马 m 系 10 车型工厂
 *
 * @author DuanJiaNing
 */
public class BMWm10Factory extends AbstractBMWmSerialFactory {
    @Override
    public BMWmSerial createBMWm() {
        return new BMWm10();
    }
}
