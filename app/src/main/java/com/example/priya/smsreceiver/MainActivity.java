package com.example.priya.smsreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   // Button msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            String address = extras.getString("Message Number");
            String message = extras.getString("Message");
            Toast.makeText(getApplicationContext(),"SMS Received from :"+ address
                            +"\n"+message
                    ,Toast.LENGTH_LONG).show();
            //TextView addressField = (TextView) findViewById(R.id.tv1);
            //TextView messageField = (TextView) findViewById(R.id.tv2);
           // addressField.setText("Message From" + address);
          //  addressField.setText("Message" + message);

        }

      /*  msg = (Button) findViewById(R.id.bt);
        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });*/

        }
    }

