package com.duan.design.valueobject;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created on 2017/11/25.
 *
 * @author DuanJiaNing
 */
public class OrderManager extends UnicastRemoteObject implements IOrderManager {

    private static final long serialVersionUID = 2801850569780456720L;

    private static final Order singleOrder = new Order(1, "intel", 23, "cpu");

    protected OrderManager() throws RemoteException {
    }

    @Override
    public Order getOrder(int id) throws RemoteException {
        System.out.println("get order");
        return singleOrder;
    }

    @Override
    public String getClientName(int id) throws RemoteException {
        return singleOrder.getClientName();
    }

    @Override
    public String getProductName(int id) throws RemoteException {
        return singleOrder.getProductName();
    }

    @Override
    public int getNUmber(int id) throws RemoteException {
        return singleOrder.getNumber();
    }
}
