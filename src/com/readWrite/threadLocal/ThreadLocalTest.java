

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.readWrite.threadLocal; 

import java.util.Random;

/** * * @author mengchen * @version $Id: ThreadLocalTest.java, v 0.1 2017年6月20日 上午10:20:27 mengchen Exp $ */
public class ThreadLocalTest {
    private static ThreadLocal<Integer> shareDate =new ThreadLocal<Integer>();
    private static ThreadLocal<LoacalData> localOb=new ThreadLocal<LoacalData>();
    /** * * @param args */
    public static void main(String[] args) {
        
        
//        for(int i=0;i<2;i++){
//            new Thread(){
//                public void run(){
//                    LoacalData loacalData=localOb.get();
//                    if(loacalData==null){
//                        loacalData=new LoacalData();
//                    }
//                    loacalData.setResMsg(Thread.currentThread().getName());
//                    System.out.println("线程"+Thread.currentThread().getName()+"返回数据为:"+loacalData.getResMsg());
//                }
//            }.start();
//        }
        
        for(int i=0;i<2;i++){
            new Thread(){
                public void run(){
                    Integer s=shareDate.get();
                    if(s==null){
                        s=0;
                    }
                    s=new Random().nextInt(100);
                    System.out.println("线程"+Thread.currentThread().getName()+":"+s);
                }
            }.start();
        }

    }
    
   

}

