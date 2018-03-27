

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.test; 

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/** * * @author mengchen * @version $Id: Mytest1.java, v 0.1 2017年6月2日 下午2:13:00 mengchen Exp $ */
public class Mytest1 {

    /** * * @param args 
     * @throws ParseException */
    public static void main(String[] args) throws ParseException {
        List<String> credit_adm_reasons = new ArrayList<String>();
        credit_adm_reasons.add("R101");
//        credit_adm_reasons.add("R1011");
        boolean isR101=false;//判断不准入原因是否只有"R101"
        if(credit_adm_reasons.size() == 1 && "R101".equals(credit_adm_reasons.get(0))){
            isR101=true;
        }
        if(isR101 ){
            System.out.println(1111);
        }
        

        
        
        
            
        
    }
       


}

