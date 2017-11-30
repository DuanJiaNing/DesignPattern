package com.duan.design.factory.abstracz;

import com.duan.design.factory.product.BMWs10;
import com.duan.design.factory.product.BMWs20;

/**
 * Created on 2017/11/30.
 * 宝马 s 系工厂
 *
 * @author DuanJiaNing
 */
public class BMWsSerialFactory extends AbstractBMWFactory {

    public BMWs20 createBMWs20() {
        return new BMWs20();
    }

    public BMWs10 createBMWs10() {
        return new BMWs10();
    }
}
