

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.dataDif; 
/** * * @author mengchen * @version $Id: DataDifRunnable.java, v 0.1 2017年6月26日 下午4:04:35 mengchen Exp $ */
public class DataDifRunnable implements Runnable {
    
    private Integer i=0;
//    private ThreadLocal<Integer> th=new ThreadLocal<Integer>();

    /** * @see java.lang.Runnable#run() */
    @Override
    public void run() {
        increase();
    }
    
    public synchronized void increase(){
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i=i+5;
        System.out.println(Thread.currentThread().getName()+"当前值为=="+i);
        
//         i=th.get();
//        if(i ==null){
//            i=0;
//            th.set(i);
//        }
//        i=th.get();
//        i=i+5;
//        System.out.println(Thread.currentThread().getName()+"当前线程这为=="+i);
    }

}

