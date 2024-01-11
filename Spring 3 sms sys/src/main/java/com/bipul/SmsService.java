package com.bipul;

import org.springframework.stereotype.Service;

@Service
public class SmsService implements MessageService
{
   String sms;

    @Override
    public void sendMessage(String s) {

    }
    public void setSms(String sm)
    {
        this.sms =sm;
    }

}
