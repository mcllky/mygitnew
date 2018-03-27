

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.readWrite.runable; 

import java.util.concurrent.locks.ReentrantReadWriteLock;

/** * * @author mengchen * @version $Id: Ticket.java, v 0.1 2017年6月16日 上午10:14:32 mengchen Exp $ */
public class Ticket  {

    private Integer data=null;
    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    
    /** * 
     * 读
     * *  */
    public void get() {
        System.out.println(Thread.currentThread().getName()+" ready to read!");
        rwl.readLock().lock();//加读锁
        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " get data" + data);
        rwl.readLock().unlock();//解读锁
    }
    
    

    /** *
     * 写
     *  * @param data */
    public  void put(Integer data){
        System.out.println(Thread.currentThread().getName()+" ready to write!");
        rwl.writeLock().lock();//加写锁
        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.data=data;
        System.out.println(Thread.currentThread().getName()+" put data:"+data);
        rwl.writeLock().unlock();//解锁写锁
        
    }

}

