package com.kdblue.senddataretofit;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //*#*#your_code#*#*
        //put your code in intent filter of callreceiver like android:host="123" and set
        //so if you want to see your activity just dial *#*#123#*#*
    }
}
