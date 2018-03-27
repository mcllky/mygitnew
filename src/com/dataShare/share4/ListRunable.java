

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.dataShare.share4; 

import java.util.ArrayList;
import java.util.List;

/** * * @author mengchen * @version $Id: ListRunable.java, v 0.1 2017年6月26日 下午4:43:48 mengchen Exp $ */
public class ListRunable implements Runnable {
    
    private List<Integer> lst=new ArrayList<Integer>();

    /** * @see java.lang.Runnable#run() */
    @Override
    public void run() {
        addList();
    }
    public void addList(){
        
        
        for(int i=0;i<2;i++){
            lst.add(i);
        }
       if(lst.size()==6){
           System.out.println(Thread.currentThread().getName()+"=="+lst.get(5));
       }
    }
    
    

}

