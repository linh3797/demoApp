package com.vccorp.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
 //   NetworkChangeReciever reciever = new NetworkChangeReciever();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        IntentFilter filter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
//        registerReceiver(reciever, filter);
    }

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        unregisterReceiver(reciever);
//    }
}
