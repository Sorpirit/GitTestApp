package com.example.gittestapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DataIn extends AppCompatActivity {

    private Button ok;
    private EditText name;
    private EditText lastName;
    private EditText age;


    static final String KEY_NAME = "FirstName";
    static final String KEY_LAST_NAME = "LastName";
    static final String KEY_AGE = "Age";

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

                        if(checkData())readData();
                        break;
                }
            }
        };

        ok.setOnClickListener(listener);
    }

    private void readData(){

        Intent intent = new Intent(this,DataOut.class);
        intent.putExtra(KEY_NAME,name.getText().toString());
        intent.putExtra(KEY_LAST_NAME,lastName.getText().toString());
        intent.putExtra(KEY_AGE,age.getText().toString());
        startActivity(intent);

    }

    private boolean checkData(){
        String toast = "";

        if(name.getText().toString().trim().isEmpty()){
            toast += "Field [FirstName] shouldn't be empty.\n";
        }
        if(lastName.getText().toString().trim().isEmpty()){
            toast += "Field [LastName] shouldn't be empty.\n";
        }
        if(age.getText().toString().trim().isEmpty()){
            toast += "Field [Age] shouldn't be empty.\n";
        }

        if(!toast.isEmpty()){
            Toast.makeText(getApplicationContext(), toast,Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }


}
