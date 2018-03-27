

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.test; 

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/** * * @author mengchen * @version $Id: ArrayList.java, v 0.1 2017年6月14日 下午4:28:08 mengchen Exp $ */
public class ArrayList<E> {
    
    private  List<E> list;
    
    public ArrayList(List lst){
        this.list=lst;
    }
    
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    
    public synchronized E get(int index) {

//        Lock readLock = readWriteLock.readLock();
//        readLock.lock();
//        try {
            return list.get(index);
//        } finally {
//            readLock.unlock();
//        }
    }

    public synchronized E set(int index, E element) {

//        Lock wirteLock = readWriteLock.writeLock();
//        wirteLock.lock();
       
        try {
            return list.set(index, element);
        } finally {
//            wirteLock.unlock();
        }
    }

}

