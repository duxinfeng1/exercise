package com.dfz.config;

import org.apache.commons.mail.HtmlEmail;

/**
 * 邮件工具类
 */
public class MailUtil {
    /**
     * 发送邮件
     * @param emailaddress 给谁发
     */
    //邮箱验证码
    public static boolean sendEmail(String emailaddress,String code){
        try {
            HtmlEmail email = new HtmlEmail();//不用更改
            email.setHostName("smtp.qq.com");//需要修改，126邮箱为smtp.126.com,163邮箱为163.smtp.com，QQ为smtp.qq.com
            email.setCharset("UTF-8");
            email.addTo(emailaddress);// 收件地址

            email.setFrom("2587538782@qq.com", "aa");//此处填邮箱地址和用户名,用户名可以任意填写

            email.setAuthentication("2587538782@qq.com", "ppblictendloddcg");//此处填写邮箱地址和客户端授权码

            email.setSubject("运动宝");//此处填写邮件名，邮件名可任意填写
            email.setMsg("尊敬的用户您好,您本次注册的验证码是:" + code);//此处填写邮件内容

            email.send();
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

}