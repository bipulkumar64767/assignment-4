package com.bipul;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class AppConfig
{
    public static void main(String[] args)
    {
        //Notificaiton Services(Constructor Injection)
        NotificationService notificationService = new NotificationService("This notification sms...");
        String sms = notificationService.sms;
        System.out.println("This is a notification:{"+sms+"}");

        //Sms Services(SetterInjection)
        SmsService smsService = new SmsService();
        smsService.setSms("This is a sms service message...");
        String sms1 = smsService.sms;
        System.out.println("This is a Sms message:{"+sms1+"}");

        //EmailService(FieldInjection)
        EmailService emailService = new EmailService();
        emailService.sms = "This is a Email message...";
        String sms3 = emailService.sms;
        System.out.println("This is a EmailService:{"+sms3+"}");

        //EmailService(Method injection)
        emailService.sendMessage("This is a Email message(M.I)");




    }
}
