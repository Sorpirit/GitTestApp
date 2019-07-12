package com.example.gittestapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView clicks;
    private Button red;
    private Button green;
    private Button blue;
    private Button black;
    private Button goToNextScreen;
    private Stats stats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stats = new Stats();

        initView();

    }

    @Override
    protected void onStart() {
        super.onStart();
        setOnClickListener();

    }

    private void initView(){
        textView = findViewById(R.id.textView);
        clicks = findViewById(R.id.clikcksC);
        red = findViewById(R.id.btRed);
        green = findViewById(R.id.btGreen);
        blue = findViewById(R.id.btBlue);
        black = findViewById(R.id.btBlack);
        goToNextScreen = findViewById(R.id.bt_chengAct);
    }

    private void setOnClickListener(){
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btRed:
                        textView.setText(R.string.red_txt);
                        textView.setTextColor(Color.RED);
                        Intent intent = new Intent(MainActivity.this,DataIn.class);
                        startActivity(intent);
                        break;
                    case R.id.btGreen:
                        textView.setText(R.string.green_txt);
                        textView.setTextColor(Color.GREEN);
                        break;
                    case  R.id.btBlue:
                        textView.setText(R.string.blue_txt);
                        textView.setTextColor(Color.BLUE);
                        break;
                    case R.id.btBlack:
                        textView.setText(R.string.black_txt);
                        textView.setTextColor(Color.BLACK);
                        break;
                    case R.id.bt_chengAct:
                        Intent intent2 = new Intent("com.main2Activity");
                        startActivity(intent2);
                        break;
                }
                stats.btn_click(v.getId());

                clicks.setText("Total clicks:" + stats.getTotal());
            }
        };

        red.setOnClickListener(clickListener);
        green.setOnClickListener(clickListener);
        blue.setOnClickListener(clickListener);
        black.setOnClickListener(clickListener);
        goToNextScreen.setOnClickListener(clickListener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        red.setOnClickListener(null);
        green.setOnClickListener(null);
        blue.setOnClickListener(null);
        black.setOnClickListener(null);
        goToNextScreen.setOnClickListener(null);
    }
}
