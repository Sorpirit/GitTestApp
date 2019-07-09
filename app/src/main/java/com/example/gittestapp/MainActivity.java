package com.example.gittestapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button red;
    private Button green;
    private Button blue;
    private Button black;
    private Stats stats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stats = new Stats();

        initView();
        setOnClickListener();
    }

    private void initView(){
        textView = findViewById(R.id.textView);
        red = findViewById(R.id.btRed);
        green = findViewById(R.id.btGreen);
        blue = findViewById(R.id.btBlue);
        black = findViewById(R.id.btBlack);
    }

    private void setOnClickListener(){
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btRed:
                        textView.setText(R.string.red_txt);
                        textView.setTextColor(Color.RED);
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
                }
                stats.btn_click(v.getId());

            }
        };

        red.setOnClickListener(clickListener);
        green.setOnClickListener(clickListener);
        blue.setOnClickListener(clickListener);
        black.setOnClickListener(clickListener);
    }
}
