

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.readWrite.threadLocal; 
/** * * @author mengchen * @version $Id: LoacalData.java, v 0.1 2017年6月20日 上午10:18:19 mengchen Exp $ */
public class LoacalData {

    private String resMsg;//请求信息
    private String respMsg;//返回信息
    /** * Getter method for property . * * @return property value of resMsg */
    
    public String getResMsg() {
        return resMsg;
    }
    /** * Setter method for property . * * @param resMsg value to be assigned to property resMsg */
    
    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }
    /** * Getter method for property . * * @return property value of respMsg */
    
    public String getRespMsg() {
        return respMsg;
    }
    /** * Setter method for property . * * @param respMsg value to be assigned to property respMsg */
    
    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }
}

