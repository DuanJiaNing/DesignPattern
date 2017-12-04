package com.duan.design.prototype;

/**
 * Created on 2017/12/4.
 *
 * @author DuanJiaNing
 */
public interface Prototype<T> extends Cloneable {

    /**
     * 克隆一个“自己”
     *
     * @param deepCopy 深拷贝，为 true 时实现类需要依次调用子类的 clone 方法完成拷贝
     * @return
     */
    T clone(boolean deepCopy) throws CloneNotSupportedException;

}
