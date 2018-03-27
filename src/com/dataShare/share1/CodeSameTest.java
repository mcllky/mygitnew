

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.dataShare.share1; 
/** * * @author mengchen * @version $Id: CodeSameTest.java, v 0.1 2017年6月20日 上午11:15:34 mengchen Exp $ */
public class CodeSameTest {

    /** * * @param args */
    public static void main(String[] args) {
        CodeSame codeSame=new CodeSame();
        for(int i=0;i<10;i++){
            new Thread(codeSame).start(); 
        }
     

    }

}

