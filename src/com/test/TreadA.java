

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.test; 
/** * * @author mengchen * @version $Id: TreadA.java, v 0.1 2017年6月15日 上午9:41:08 mengchen Exp $ */
public class TreadA implements Runnable {
    private ArrayList<Integer> lst;
    public TreadA(ArrayList<Integer> lst){
        this.lst=lst;
    }
    
    /** * Getter method for property . * * @return property value of lst */
    
    public ArrayList<Integer> getLst() {
        return lst;
    }
    /** * Setter method for property . * * @param lst value to be assigned to property lst */
    
    public void setLst(ArrayList<Integer> lst) {
        this.lst = lst;
    }
    /** * @see java.lang.Runnable#run() */
    @Override
    public void run() {
        lst.set(0, 1);
        System.out.println("TreadA set complent");
    }
    

}

