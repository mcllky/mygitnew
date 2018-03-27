

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.dataShare.share2; 
/** * * @author mengchen * @version $Id: ThreadTest.java, v 0.1 2017年6月26日 下午2:02:23 mengchen Exp $ */
public class ThreadTest {

    /** * * @param args */
    public static void main(String[] args) {
        ShareData shareData = new ShareData();
        shareData.setData(0);
        IncreaseThread increaseThread = new IncreaseThread("递增线程",shareData);
        DecreaseThead decreaseThead = new DecreaseThead("递减线程",shareData);
        
        //三个加
        for(int i=0; i<3; i++){
            new Thread(increaseThread).run();
        }
        
        //两个减
        for(int i=0; i<2; i++){
            new Thread(decreaseThead).run();
        }
        
//        //三个加
//        for(int i=0; i<3; i++){
//            new IncreaseThread("递增线程",shareData).run();
//        }
//        
//        //两个减
//        for(int i=0; i<2; i++){
//            new DecreaseThead("递减线程",shareData).run();
//        }

    }

}

