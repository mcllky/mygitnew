

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.SaleTicket; 
/** * * @author mengchen * @version $Id: TicketSaleMain.java, v 0.1 2017年6月23日 上午9:37:34 mengchen Exp $ */
public class TicketSaleMain {

    /** * * @param args */
    public static void main(String[] args) {
        SaleTicke saleTicke = new SaleTicke();
        for(int i=0; i<3; i++){
            new Thread(saleTicke).start();
        }

    }

}

