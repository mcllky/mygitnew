

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.profxy.activite; 

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/** * * @author mengchen * @version $Id: Test2.java, v 0.1 2017年9月6日 上午10:44:50 mengchen Exp $ */
public class Test2 {

    /** * * @param args */
    public static void main(String[] args) {
     // add start by mengchen 20170908 大家电类目治理准入规则
        List list = new ArrayList<String>();
        Double exlov_fns_amt_50022703_l6m = 357639.69;//过去6个月_大家电类目(50022703)_完成交易金额
        Double finished_valid_exlov_amt_rm6 = 357749.69;//最近6个月完成的交易金额（淘宝）
        Double finished_valid_exlov_amt_rm6_avg = finished_valid_exlov_amt_rm6/6;
        Double exlov_fns_amt_50022703_l3m = 72099.38;//过去3个月_大家电类目(50022703)_完成交易金额
        Double finished_valid_exlov_amt_rm3 = 72129.38;//最近3个月完成的交易金额
        Double finished_valid_exlov_amt_rm3_avg = finished_valid_exlov_amt_rm3/3;
        //过去6个月大家电类目月均完成交易金额
        Double exlov_fns_amt_50022703_l6m_avg = exlov_fns_amt_50022703_l6m/6;
        //过去3个月大家电类目月均完成交易金额
        Double exlov_fns_amt_50022703_l3m_avg = exlov_fns_amt_50022703_l3m/3;
        //过去3个月大家电类目月均完成交易金额占比
        Double exlov_fns_amt_50022703_l3m_avg_per = 0D;
        if(finished_valid_exlov_amt_rm3_avg > 0){
            exlov_fns_amt_50022703_l3m_avg_per = exlov_fns_amt_50022703_l3m_avg/finished_valid_exlov_amt_rm3_avg;
        }
        //过去6个月大家电类目月均完成交易金额占比
        Double exlov_fns_amt_50022703_l6m_avg_per = 0D;
        if(finished_valid_exlov_amt_rm6_avg > 0){
            exlov_fns_amt_50022703_l6m_avg_per = exlov_fns_amt_50022703_l6m_avg/finished_valid_exlov_amt_rm6_avg;
        }
        //过去6个月大家电类目月均完成交易金额>30000 and （过去3个月大家电类目完成交易金额占比>0.4 or 过去6个月大家电类目完成交易金额占比>0.4)不准入
        if(exlov_fns_amt_50022703_l6m_avg > 30000 && (exlov_fns_amt_50022703_l3m_avg_per > 0.4 || exlov_fns_amt_50022703_l6m_avg_per > 0.4 ) ){
            list.add("R_FNS_AVG");
        }
        Long user_type_id = 2l;//会员类型:1=公司,2=个人，其他都是历史脏数据,V2是和之前相同的path做区分
        //过去6个月大家电类目月均完成交易金额>10000 and 支付宝账户类型不为公司不准入
        if(exlov_fns_amt_50022703_l6m_avg > 10000 && user_type_id != 1){
            list.add("R_FNS_USER_TYPE");
        }
        System.out.println(list);
        // add end by mengchen

    }

}

