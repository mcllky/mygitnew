

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.readWrite.thread; 

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicLong;

/** * * @author mengchen * @version $Id: Ticket1Test.java, v 0.1 2017年6月19日 下午4:08:25 mengchen Exp $ */
public class Ticket1Test {

    /** * * @param args */
    public static void main(String[] args) {
        
//         AtomicLong value = new AtomicLong(0L);
//       
//        for(int i=0;i<100;i++){
//            new Thread(){
//                public void run(){
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    
//                    if(value.incrementAndGet() == 100){
//                        System.out.println("counter="+100);
//                    }
//                   
//                }
//                
//                
//            }.start();
//        }
        //yyyymmddhhmiss
        Calendar segment_date=Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateStr = sdf.format(segment_date.getTime());
        System.out.println(dateStr);
        

    }

}

