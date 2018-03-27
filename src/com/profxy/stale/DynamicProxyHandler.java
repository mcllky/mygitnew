

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.profxy.stale; 

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/** * * @author mengchen * @version $Id: DynamicProxyHandler.java, v 0.1 2017年6月27日 下午4:25:43 mengchen Exp $ */
public class DynamicProxyHandler implements InvocationHandler {
    
    private Object target;

    public DynamicProxyHandler(Object target) {
        this.target = target;
    }

    /** * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]) */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("do somthing before");
        Object ob =method.invoke(target, args);
        System.out.println("do somting after");
        return ob;
    }

}

