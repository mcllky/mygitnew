

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.dataDif; 
/** * * @author mengchen * @version $Id: DataDifTest.java, v 0.1 2017年6月26日 下午4:07:40 mengchen Exp $ */
public class DataDifTest {

    /** * * @param args */
    public static void main(String[] args) {
        
        DataDifRunnable dataDifRunnable = new DataDifRunnable();
        for(int i=0;i<3; i++){
            
            new Thread(dataDifRunnable).run();
        }

    }

}

