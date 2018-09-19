package com.example.tope.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_layout);
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Log.w("SecActivity", data);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("data_return", "Hello ActivityTest");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
