

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.dataShare.share3; 

import com.dataShare.share2.ShareData;

/** * * @author mengchen * @version $Id: ShareDateThreadTest.java, v 0.1 2017年6月26日 下午2:37:59 mengchen Exp $ */
public class ShareDateThreadTest {

    /** * * @param args */
    public static void main(String[] args) {
        
     ShareData shareData=new ShareData();
    shareData.setData(0);
    
    new Thread(new Runnable(){

        @Override
        public void run() {
            shareData.increase();
        }
        
    }).start();
    
    new Thread(new Runnable(){

        @Override
        public void run() {
            shareData.decrease();
        }
        
    }).start();
    }
    
   

}

