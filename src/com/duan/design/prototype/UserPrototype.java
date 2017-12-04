package com.duan.design.prototype;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

/**
 * Created on 2017/12/4.
 *
 * @author DuanJiaNing
 */
@ToString
@EqualsAndHashCode
@Getter
public class UserPrototype implements Prototype<UserPrototype> {

    private String name;
    private int age;
    private Date date;

    public UserPrototype(String name, int age, Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    @Override
    public UserPrototype clone(boolean deepCopy) throws CloneNotSupportedException {
        return deepCopy ? new UserPrototype(name, age, (Date) date.clone()) : // 深拷贝
                (UserPrototype) super.clone(); // 浅拷贝
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return clone(false);
    }
}
