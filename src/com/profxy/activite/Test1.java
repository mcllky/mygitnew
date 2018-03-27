

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.profxy.activite; 

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/** * * @author mengchen * @version $Id: Test1.java, v 0.1 2017年7月18日 上午10:27:03 mengchen Exp $ */
public class Test1 {

    /** * * @param args */
    public static void main(String[] args) {
//        String site_mem_id ="00000001";//取主表中的SITE_MEM_ID
//        int last_four_num = 0;
//        if(site_mem_id != null){
//            if(site_mem_id.length() >= 4){
//                String last_four_num_str = site_mem_id.substring(site_mem_id.length() - 4);
//                last_four_num = Integer.parseInt(last_four_num_str);
//            }else if(site_mem_id.length() == 3){
//                String last_four_num_str = site_mem_id.substring(site_mem_id.length() - 3);
//                last_four_num = Integer.parseInt(last_four_num_str);
//            }else if(site_mem_id.length() == 2){
//                String last_four_num_str = site_mem_id.substring(site_mem_id.length() - 2);
//                last_four_num = Integer.parseInt(last_four_num_str);
//            }else if(site_mem_id.length() == 1){
//                String last_four_num_str = site_mem_id.substring(site_mem_id.length() - 1);
//                last_four_num = Integer.parseInt(last_four_num_str);
//            }
//            
//        }
        Date dt = new Date();
      Calendar cd = Calendar.getInstance();
  
       
     System.out.println(cd.getTimeInMillis());
     System.out.println(dt.getTime());
     
        

}
}
