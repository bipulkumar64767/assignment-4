package com.bipul;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService
{
    String sms;
    @Override
    public void sendMessage(String s)
    {
        this.sms =s;
        System.out.println("This is a EmailService(method injection). Your mail is:{"+sms+"}");
    }
}
