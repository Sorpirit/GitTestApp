package com.example.gittestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tv_coins;
    private Button btn_clicks;

    private int coins=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initInterface();

    }

    @Override
    protected void onStart() {
        super.onStart();
        initListeners();
    }

    private void initInterface(){
        tv_coins = findViewById(R.id.tv_coins);
        btn_clicks = findViewById(R.id.btn_mine);
    }
    private void initListeners(){
        initOnClickListener();
    }
    private void initOnClickListener(){
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btn_mine:
                        mine();
                        break;
                }
            }
        };

        btn_clicks.setOnClickListener(listener);
    }

    private void mine(){
        coins++;
        tv_coins.setText("Coins: "+coins);
    }

}
