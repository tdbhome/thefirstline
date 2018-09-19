package com.example.tope.uiwidgettest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressPrec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.edit_text);
        button.setOnClickListener(new View.OnClickListener(){
              @Override
              public void onClick(View v) {
                  switch (v.getId()) {
                      case R.id.button:
                          String inputText = editText.getText().toString();
                          Toast.makeText(MainActivity.this, inputText,
                                  Toast.LENGTH_SHORT).show();
                          break;
                      default:
                          break;
                  }
              }
        });

        Button buttonImg = (Button) findViewById(R.id.buttonImg);
        imageView  = (ImageView) findViewById(R.id.image_view);
        buttonImg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.buttonImg:
                        imageView.setImageResource(R.drawable.badge_128px);
                        break;
                    default:
                        break;
                }
            }
        });
        Button buttonPrec = (Button) findViewById(R.id.buttonPre);
        progressPrec  = (ProgressBar) findViewById(R.id.progress_bar);
        buttonPrec.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.buttonPre:
                        //progressPrec.incrementProgressBy(10);
                        int process = progressPrec.getProgress();
                        process += 10;
                        progressPrec.setProgress(process);
                        if (progressPrec.getVisibility() == View.GONE) {
                            progressPrec.setVisibility(View.VISIBLE);
                        } else {
                            progressPrec.setVisibility(View.GONE);
                        }
                        break;
                    default:
                        break;
                }
            }
        });

        Button buttonAlert = (Button) findViewById(R.id.buttonAlert);
        //dialog  = (ProgressBar) findViewById(R.id.progress_bar);
        buttonAlert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.buttonAlert:
                        AlertDialog.Builder dialog = new AlertDialog.Builder (MainActivity.this);
                        dialog.setTitle("This is Dialog");
                        dialog.setMessage("Something important.");
                        dialog.setCancelable(false);
                        dialog.setPositiveButton("OK", new DialogInterface.
                                OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                        dialog.setNegativeButton("Cancel", new DialogInterface.
                                OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                        dialog.show();
                        break;
                    default:
                        break;
                }
            }
        });

        Button buttonPD = (Button) findViewById(R.id.buttonPD);
        //progressPrec  = (ProgressBar) findViewById(R.id.progress_bar);
        buttonPD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.buttonPD:
                        ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                        progressDialog.setTitle("This is ProgressDialog");
                        progressDialog.setMessage("Loading...");
                        progressDialog.setCancelable(true);
                        progressDialog.show();
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
