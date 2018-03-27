

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.dataShare.share4; 
/** * * @author mengchen * @version $Id: ListRunTest.java, v 0.1 2017年6月26日 下午4:48:13 mengchen Exp $ */
public class ListRunTest {

    /** * * @param args */
    public static void main(String[] args) {
        ListRunable lstrun=new ListRunable();
        
        for(int i=0; i<10; i++){
            new Thread(lstrun).start();
        }

    }

}

