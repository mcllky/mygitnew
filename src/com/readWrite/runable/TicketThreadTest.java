

/** * Alipay.com Inc. * Copyright (c) 2004-2017 All Rights Reserved. */
 package com.readWrite.runable; 

import java.util.Random;

/** * * @author mengchen * @version $Id: TicketThreadTest.java, v 0.1 2017年6月16日 上午10:31:32 mengchen Exp $ */
public class TicketThreadTest {

    /** * * @param args */
    public static void main(String[] args) {
        final Ticket ticket=new Ticket();
        
        
        //读
        for (int i=0;i<=8; i++){
            
            switch (i) {
                case 0://读
                    new Thread() {
                        public void run() {
                            ticket.get();
                        }
                    }.start();
                    break;
                case 1://写
                    new Thread() {
                        public void run() {
                            ticket.put(new Random().nextInt(10000));
                        }
                    }.start();
                    break;
                case 2:
                    new Thread() {
                        public void run() {
                            ticket.get();
                        }
                    }.start();
                    break;
                case 3:
                    new Thread() {
                        public void run() {
                            ticket.put(new Random().nextInt(10000));
                        }
                    }.start();
                    break;
                case 4:
                    new Thread() {
                        public void run() {
                            ticket.get();
                        }
                    }.start();
                    break;
                case 5:
                    new Thread() {
                        public void run() {
                            ticket.put(new Random().nextInt(10000));
                        }
                    }.start();
                    break;
                case 6:
                    new Thread() {
                        public void run() {
                            ticket.get();
                        }
                    }.start();
                    break;
                case 7:
                    new Thread() {
                        public void run() {
                            ticket.put(new Random().nextInt(10000));
                        }
                    }.start();
                    break;

                case 8:
                    new Thread() {
                        public void run() {
                            ticket.get();
                        }
                    }.start();
                    break;
            }
            
            
            
        }
        //写
//        for (int i = 0; i <= 3; i++) {
//
//            new Thread() {
//                public void run() {
//                    ticket.put(new Random().nextInt(10000));
//                }
//            }.start();
//        }
        

    }

}

