

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.dataShare.share2; 
/** * * @author mengchen * @version $Id: IncreaseThread.java, v 0.1 2017年6月26日 下午1:48:29 mengchen Exp $ */
//递增线程
public class IncreaseThread extends Thread {
    //ThreadLocal数据隔离
    private ThreadLocal<ShareData> th=new ThreadLocal<ShareData>();
//   private ShareData shareData;
   private String threadName;
   //构造函数
   public IncreaseThread(String threadName,ShareData shareData){
      
       if(shareData == null){
           shareData=new ShareData();
           shareData.setData(0);
       }
       this.threadName=threadName;
       this.th.set(shareData);
       
   }
 
   

/** * @see java.lang.Runnable#run() */
@Override
public void run() {
    this.th.get().increase();
}

}

