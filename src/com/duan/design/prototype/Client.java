package com.duan.design.prototype;

import com.duan.design.U;

import java.util.Date;

/**
 * Created on 2017/12/4.
 *
 * @author DuanJiaNing
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        String name = "jack";
        int age = 21;
        Date date = new Date();

        UserPrototype prototype = new UserPrototype(name, age, date);
        UserPrototype clone = prototype.clone(false);
        U.p.accept(prototype == clone); // false
        U.p.accept(prototype.equals(clone)); // true
        U.p.accept(prototype.getDate() == clone.getDate()); // true
        U.p.accept("");
        UserPrototype clone1 = prototype.clone(true);
        U.p.accept(prototype == clone1); // false
        U.p.accept(prototype.equals(clone1)); // true
        U.p.accept(prototype.getDate() == clone1.getDate()); // false

    }

}
