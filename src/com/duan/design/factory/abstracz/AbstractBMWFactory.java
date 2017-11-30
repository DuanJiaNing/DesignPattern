package com.duan.design.factory.abstracz;

import com.duan.design.factory.serial.BMWmSerial;
import com.duan.design.factory.serial.BMWsSerial;

/**
 * Created on 2017/11/30.
 * 宝马抽象工厂
 *
 * @author DuanJiaNing
 */
public abstract class AbstractBMWFactory {

    public abstract BMWmSerial createBMWmSerial();

    public abstract BMWsSerial createBMWsSerial();

    // 导出类可以创建多种车型
}
