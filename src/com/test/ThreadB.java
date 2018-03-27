

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.test; 
/** * * @author mengchen * @version $Id: ThreadB.java, v 0.1 2017年6月15日 上午9:48:36 mengchen Exp $ */
public class ThreadB implements Runnable {
//    private ArrayList<Integer> lst;
    private int ticket=100;
   


    /** * @see java.lang.Runnable#run() */
    @Override
    public void run() {
       
        sale(ticket);
    }
    public synchronized void sale(int ticket){
        while(ticket>0){
            System.out.println("线程"+Thread.currentThread().getName()+"当前剩余票数=="+ticket);
            ticket--;  
        }
    }
    
  

}

