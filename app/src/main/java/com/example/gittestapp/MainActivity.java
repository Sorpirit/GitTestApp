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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setOnClickListener();
    }

    private void initView(){
        textView = findViewById(R.id.textView);
        red = findViewById(R.id.btRed);
        green = findViewById(R.id.btGreen);
        blue = findViewById(R.id.btBlue);
    }

    private void setOnClickListener(){
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btRed:
                        textView.setText("Red text.");
                        textView.setTextColor(Color.RED);
                        break;
                    case R.id.btGreen:
                        textView.setText("Green text.");
                        textView.setTextColor(Color.GREEN);
                        break;
                    case  R.id.btBlue:
                        textView.setText("Blue text.");
                        textView.setTextColor(Color.BLUE);
                        break;
                }
            }
        };

        red.setOnClickListener(clickListener);
        green.setOnClickListener(clickListener);
        blue.setOnClickListener(clickListener);
    }
}
