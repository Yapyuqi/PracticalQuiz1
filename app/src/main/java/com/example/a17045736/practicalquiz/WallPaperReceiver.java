package com.example.a17045736.practicalquiz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

public class WallPaperReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"You have changed the wallpaper.", Toast.LENGTH_LONG).show();
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        int id = preferences.getInt("id", R.id.radioButton1);
        if(id == R.id.radioGroup1){
            Toast.makeText(context, "You have a good taste", Toast.LENGTH_LONG).show();
        } else{
            Toast.makeText(context, "Bro,think twice about it", Toast.LENGTH_LONG).show();
        }



    }
}
