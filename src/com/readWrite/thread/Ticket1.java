

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.readWrite.thread; 

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/** * * @author mengchen * @version $Id: Ticket.java, v 0.1 2017年6月16日 上午10:14:32 mengchen Exp $ */
public class Ticket1  {


    private static  AtomicLong value = new AtomicLong(0L);
//      private static int value=0;

    public static long addone(){
        return value.incrementAndGet();
//        return ++value;
    }
    

}

