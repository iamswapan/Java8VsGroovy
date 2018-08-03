package com.jcod.basic;

import com.sun.xml.internal.org.jvnet.mimepull.MIMEMessage;

import java.util.Properties;

/**
 * Created by ttnd on 9/3/17.
 */
public class SendMailDemo {
    public static void main(String[] args) {
        String from="iamswapan@gmail.com";
        String to="swapan.mishra@tothenew.com";
        String host="localhost";

        Properties properties=System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        try {

        }catch (Exception e){

        }
    }
}
