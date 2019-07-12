package com.example.gittestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DataIn extends AppCompatActivity {

    private Button ok;
    private EditText name;
    private EditText lastName;
    private EditText age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_in);

        initInterface();
    }

    @Override
    protected void onStart() {
        super.onStart();
        intiListeners();
    }

    private void initInterface(){
        ok = findViewById(R.id.bt_ok);
        name = findViewById(R.id.et_firstName);
        lastName = findViewById(R.id.et_lastName);
        age = findViewById(R.id.et_age);
    }

    private void intiListeners(){
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.bt_ok:

                        break;
                }
            }
        };

        ok.setOnClickListener(listener);
    }


}
