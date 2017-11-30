package com.duan.design.factory.method;

import com.duan.design.factory.serial.BMWmSerial;

/**
 * Created on 2017/11/30.
 * 宝马 m 系抽象工厂
 *
 * @author DuanJiaNing
 */
public abstract class AbstractBMWmSerialFactory {

    public abstract BMWmSerial createBMWm();

    // 将工厂抽象，有新的车型加入时只需创建新的子类，无需在源代码中修改

}
