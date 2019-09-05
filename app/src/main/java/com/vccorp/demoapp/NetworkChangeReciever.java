package com.vccorp.demoapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class NetworkChangeReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Network is TURN ON/OFF", Toast.LENGTH_SHORT).show();
        Log.d("ONCLICK", "onReceive: ");
    }


}
