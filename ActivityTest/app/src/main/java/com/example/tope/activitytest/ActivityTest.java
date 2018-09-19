package com.example.tope.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityTest extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitytest_layout);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityTest.this,"click button1",
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityTest.this,"退出", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(ActivityTest.this, SecActivity.class);显式*/
                /*Intent intent = new Intent("com.example.activitytest.ACTION_START");
                intent.addCategory("com.example.activitytest.MY_CATEGORY");隐式*/
                 /*   Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://www.baidu.com"));隐式调用外部网页*/
                /*Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));调用外部打电话*/
                /*Intent intent = new Intent("android.intent.action.VIEW");调用弹出选择http*/
                String data = "Hello SecondActivity";
                Intent intent = new Intent(ActivityTest.this, SecActivity.class);
                intent.putExtra("extra_data", data);
                 /*startActivity(intent);不等待返回消息调用*/
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnedData = data.getStringExtra("data_return");
                    Log.w("ActivityTest", returnedData);
                }
                break;
            default:
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"clicked add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"clicked remove",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

}
