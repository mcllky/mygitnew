

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.yuanzixing.automic; 

import java.util.concurrent.atomic.AtomicLong;

/** * * @author mengchen * @version $Id: AutomicTest.java, v 0.1 2017年6月26日 下午4:26:18 mengchen Exp $ */
public class AutomicTest {

    /** * * @param args */
    public static void main(String[] args) {
        AutomicRunnable ruanble=new AutomicRunnable();
        
        for(int i=0;i<3;i++){
            new Thread(ruanble).start();
        }
//        AtomicLong value =new AtomicLong(0l);
//        value.incrementAndGet();
//        System.out.println(Thread.currentThread().getName()+"当前值为:"+value.get());

    }

}

