package com.example.tope.lifecycleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w(TAG,"onCreate");
        Button startNormalActivity = (Button) findViewById(R.id.start_normal_activity);
        Button startDialogActivity = (Button) findViewById(R.id.start_dialog_activity);
        startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NormalActivity.class);
                        startActivity(intent);
            }
        });
        startDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, dialogActivity.class);
                        startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w(TAG, "onRestart");
    }
}
