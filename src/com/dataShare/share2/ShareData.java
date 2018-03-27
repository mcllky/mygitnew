

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.dataShare.share2; 
/** * * @author mengchen * @version $Id: ShareData.java, v 0.1 2017年6月26日 下午1:45:28 mengchen Exp $ */
//共享数据对象
 public class ShareData {
     
     private static ThreadLocal<ShareData> shareDataInstance=new ThreadLocal<ShareData>();
    
    private int  data;

    /** * Getter method for property . * * @return property value of data */
    
    public int getData() {
        return data;
    }
    
    public static ShareData getInstance(){
        ShareData shareData=shareDataInstance.get();
        if(shareData == null){
            shareData = new ShareData();
            shareData.setData(0);
            shareDataInstance.set(shareData);
        }
        return shareData;
    }

    /** * Setter method for property . * * @param data value to be assigned to property data */
    
    public void setData(int data) {
        this.data = data;
    }
    //递减
   public synchronized void decrease(){
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        
        data=data-5;
        System.out.println("减少后当前操作值为=="+data);
    }
   
 //递增
   public synchronized void increase(){
       try {
        Thread.sleep(100);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
       
       data=data+10;
       System.out.println("增加后当前操作值为"+data);
   }
    

}

