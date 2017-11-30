package com.duan.design.factory.abstracz;

import com.duan.design.factory.product.BMWm10;
import com.duan.design.factory.product.BMWs10;
import com.duan.design.factory.serial.BMWmSerial;
import com.duan.design.factory.serial.BMWsSerial;

/**
 * Created on 2017/11/30.
 * 生产型号为 10 的各系列车型
 *
 * @author DuanJiaNing
 */
public class BMW10Factory extends AbstractBMWFactory {

    @Override
    public BMWmSerial createBMWmSerial() {
        return new BMWm10();
    }

    @Override
    public BMWsSerial createBMWsSerial() {
        return new BMWs10();
    }
}
