package com.example.gittestapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DataOut extends AppCompatActivity {

    private Button back;
    private TextView out_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_out);

        initIntarface();
        getData();

    }

    private void initIntarface(){
        back = findViewById(R.id.bt_back);
        out_text = findViewById(R.id.tv_dataOut);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DataOut.this,DataIn.class));
            }
        });
    }

    private void getData(){
        Intent intent = this.getIntent();
        out_text.append("First Name: " + intent.getStringExtra(DataIn.KEY_NAME) + ".\n");
        out_text.append("Last Name: " + intent.getStringExtra(DataIn.KEY_LAST_NAME) + ".\n");
        out_text.append("Age: " + intent.getStringExtra(DataIn.KEY_AGE) + ".\n");

    }


}
