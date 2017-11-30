package com.duan.design.factory.method;

import com.duan.design.factory.product.BMWs10;

/**
 * Created on 2017/11/30.
 * 宝马 s 系 10 车型工厂
 *
 * @author DuanJiaNing
 */
public class BMWs10Factory extends AbstractBMWsSerialFactory {

    public BMWs10 createBMWs10() {
        return new BMWs10();
    }
}
