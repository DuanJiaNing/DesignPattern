package com.duan.design.prototype;

import com.duan.design.P;

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
        P.p.accept(prototype == clone); // false
        P.p.accept(prototype.equals(clone)); // true
        P.p.accept(prototype.getDate() == clone.getDate()); // true
        P.p.accept("");
        UserPrototype clone1 = prototype.clone(true);
        P.p.accept(prototype == clone1); // false
        P.p.accept(prototype.equals(clone1)); // true
        P.p.accept(prototype.getDate() == clone1.getDate()); // false

    }

}
