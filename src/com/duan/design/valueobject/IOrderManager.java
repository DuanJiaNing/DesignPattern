package com.duan.design.valueobject;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created on 2017/11/25.
 * 服务接口
 * @author DuanJiaNing
 */
public interface IOrderManager extends Remote {

    Order getOrder(int id) throws RemoteException;

    String getClientName(int id) throws RemoteException;

    String getProductName(int id) throws RemoteException;

    int getNUmber(int id) throws RemoteException;

}
