
package com.example.priya.smsreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

// Activity Class

public class MainActivity extends AppCompatActivity {
  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
       // Receive Message and Number in Intent

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            String address = extras.getString("MessageNumber");
            String message = extras.getString("Message");
           
      
            //set number and message in text view
           
            TextView addressField = (TextView) findViewById(R.id.tv1);
            TextView messageField = (TextView) findViewById(R.id.tv2);
           addressField.setText("Message From" + address);
           addressField.setText("Message" + message);

        }

        }
    }

