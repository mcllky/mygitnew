

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.SaleTicket; 

import java.util.concurrent.atomic.AtomicInteger;

/** * * @author mengchen * @version $Id: SaleTicke.java, v 0.1 2017年6月23日 上午9:34:00 mengchen Exp $ */
public class SaleTicke implements Runnable {
    private AtomicInteger total=new AtomicInteger(10);

    /** * @see java.lang.Runnable#run() */
    @Override
    public void run() {
       
//        sale();
//        while(total.decrementAndGet()>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        
            System.out.println(Thread.currentThread().getName()+"当前剩余票数为"+total.decrementAndGet());
//        }
    }
    
    public synchronized void sale(){
//        while(total.decrementAndGet()>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        
            System.out.println(Thread.currentThread().getName()+"当前剩余票数为"+total.decrementAndGet());
        }
//    }

}

