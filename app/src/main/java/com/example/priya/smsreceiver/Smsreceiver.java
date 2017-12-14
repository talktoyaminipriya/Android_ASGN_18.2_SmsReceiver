package com.example.priya.smsreceiver;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

/**
 * Created by Priya on 12/14/2017.
 */

// sms receiver class

public class Smsreceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle pudsbundle = intent.getExtras();
        Object[] puds = (Object[]) pudsbundle.get("puds");
        SmsMessage messages = SmsMessage.createFromPdu((byte[])puds[0]);

        
        // start application main activity

        Intent smsIntent = new Intent (context, MainActivity.class);
        
        // send message and number in action
        
        smsIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        smsIntent.putExtra("MessageNumber", messages.getOriginatingAddress());
        smsIntent.putExtra("Message",messages.getMessageBody());
        context.startActivity(smsIntent);
        
         // show message in toast
        Toast.makeText(context,"SMS Received from :"+ messages.getOriginatingAddress()
                        +"\n"+messages.getMessageBody()
        ,Toast.LENGTH_LONG).show();
    }
}
