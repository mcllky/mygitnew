

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.yuanzixing.automic; 

import java.util.concurrent.atomic.AtomicLong;

/** * * @author mengchen * @version $Id: AutomicRunnable.java, v 0.1 2017年6月26日 下午4:23:28 mengchen Exp $ */
public class AutomicRunnable implements Runnable {
    
    private AtomicLong value =new AtomicLong(0l);

    /** * @see java.lang.Runnable#run() */
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(value.incrementAndGet() ==3){
            
            System.out.println(Thread.currentThread().getName()+"达到了3");
        }
    }

}

