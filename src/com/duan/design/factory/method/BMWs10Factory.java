package com.duan.design.factory.method;

import com.duan.design.factory.product.BMWs10;
import com.duan.design.factory.serial.BMWsSerial;

/**
 * Created on 2017/11/30.
 * 宝马 s 系 10 车型工厂
 *
 * @author DuanJiaNing
 */
public class BMWs10Factory extends AbstractBMWsSerialFactory {
    @Override
    public BMWsSerial createBMWs() {
        return new BMWs10();
    }
}
