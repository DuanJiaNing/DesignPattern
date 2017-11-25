package com.duan.design.valueobject;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created on 2017/11/25.
 *
 * @author DuanJiaNing
 */
public class OrderClient {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1098);
            IOrderManager manager = new OrderManager();
            Naming.bind("userManager", manager);
            System.out.println("client bind success");
        } catch (RemoteException | MalformedURLException | AlreadyBoundException e) {
            System.out.println("bind exception");
            e.printStackTrace();
        }

    }

}
