package com.duan.design.singleton;

/**
 * Created on 2017/11/23.
 *
 * @author DuanJiaNing
 */
public class DCL {

    private static volatile DCL instance;

    public static DCL getInstance() {
        if (instance == null) {
            synchronized (DCL.class) {
                if (instance == null) {
                    instance = new DCL();
                }
            }
        }

        return instance;
    }

    private DCL() {

    }
}
