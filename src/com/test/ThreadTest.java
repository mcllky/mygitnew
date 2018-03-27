

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.test; 

import java.text.ParseException;
import java.util.List;

/** * * @author mengchen * @version $Id: ThreadTest.java, v 0.1 2017年6月15日 上午9:50:40 mengchen Exp $ */
public class ThreadTest {
    
    public static void main(String[] args) throws ParseException {

        ThreadB B=new ThreadB();
//        for (int i=1;i<4;i++){
//            new Thread(B).start();
//        }
        Thread t1=new Thread(B);
        t1.setName("T1");
        Thread t2=new Thread(B);
        t2.setName("T2");
        Thread t3=new Thread(B);
        t3.setName("3");
        Thread t4=new Thread(B);
        t4.setName("T4");
        t2.start();
        t1.start();
       
        t3.start();
        t4.start();
       
        
        
        
        
      
    }
    
    
    
    
    
    
}

