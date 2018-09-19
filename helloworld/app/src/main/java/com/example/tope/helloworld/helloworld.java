package com.example.tope.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class helloworld extends AppCompatActivity {
    private static final String TAG = "helloworld";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloworld);
        Log.w(TAG, "onCreate: ");
    }
}
