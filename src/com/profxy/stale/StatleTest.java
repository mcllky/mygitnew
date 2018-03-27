

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.profxy.stale; 

import java.lang.reflect.Proxy;

/** * * @author mengchen * @version $Id: StatleTest.java, v 0.1 2017年6月27日 下午4:13:11 mengchen Exp $ */
public class StatleTest {

    /** * * @param args */
    public static void main(String[] args) {
        RealObject target = new RealObject();
        Action profxy = (Action) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new DynamicProxyHandler(target));
     
        profxy.dosometing();
     
        GetRealObjet taget1 =new GetRealObjet();
        
        Action2 proxy2=(Action2) Proxy.newProxyInstance(taget1.getClass().getClassLoader(), taget1.getClass().getInterfaces(), new DynamicProxyHandler(taget1)) ;
        
        proxy2.getSomting();

    }

}

