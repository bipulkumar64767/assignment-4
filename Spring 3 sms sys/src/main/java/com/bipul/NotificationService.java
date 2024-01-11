package com.bipul;

import org.springframework.stereotype.Service;

@Service
public class NotificationService implements MessageService
{
    String sms;
    NotificationService(String s)
    {
        this.sms = s ;
    }

    @Override
    public void sendMessage(String s)
    {

    }

}
