package com.duan.design.valueobject;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * Created on 2017/11/25.
 * 实体类
 * @author DuanJiaNing
 */
@Data
@AllArgsConstructor
public class Order implements Serializable {

    private static final long serialVersionUID = -9218366949540249297L;
    private long id;
    private String clientName;
    private int number;
    private String productName;

}
