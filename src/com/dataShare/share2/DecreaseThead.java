

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.dataShare.share2; 
/** * * @author mengchen * @version $Id: DecreaseThead.java, v 0.1 2017年6月26日 下午1:55:30 mengchen Exp $ */
//递减线程
public class DecreaseThead extends Thread {
    private ThreadLocal<ShareData> th=new ThreadLocal<ShareData>();
//    private ShareData shareData;//数据共享对象
    private String threadName;//线程名 
    
    
    //构造函数
    public DecreaseThead(String threadName,ShareData shareData){
      
        this.threadName=threadName;
        if(shareData == null){
            
            shareData=new ShareData();
            shareData.setData(0);
        }
        this.th.set(shareData);
//        this.shareData=shareData;
    }
    
  
    
    



    /** * @see java.lang.Runnable#run() */
    @Override
    public void run() {
        this.th.get().decrease();
    }
    
  
}

