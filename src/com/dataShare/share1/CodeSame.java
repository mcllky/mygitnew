

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.dataShare.share1; 

import java.util.concurrent.atomic.AtomicLong;

/** * * @author mengchen * @version $Id: CodeSame.java, v 0.1 2017年6月20日 上午11:11:00 mengchen Exp $ */
//多线程数据共享：代码相同，将共享数据放入ranbale
public class CodeSame implements Runnable {
    private AtomicLong shareDate=new AtomicLong(0l);
//    private int shareDate=0;

    /** * @see java.lang.Runnable#run() */
    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName()+":"+shareDate.incrementAndGet());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        ++shareDate;
//        shareDate.incrementAndGet();
//        System.out.println(Thread.currentThread().getName()+":"+shareDate.incrementAndGet());
        if(shareDate.incrementAndGet()==10){
            System.out.println(Thread.currentThread().getName()+":"+shareDate); 
        }
        
    }

}

