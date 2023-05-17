package com.example.radiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    RadioButton radiobtn;
    RadioGroup radiogrp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclickmethod(View v){

        int selectedid = radiogrp.getCheckedRadioButtonId();
        radiobtn = (RadioButton)findViewById(selectedid);
        if(selectedid == -1){
            Toast.makeText(MainActivity.this, "nothing picked", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(MainActivity.this, radiobtn.getText(), Toast.LENGTH_LONG).show();
        }

        Intent i = new Intent(MainActivity.this , radiobtn2.class);
        startActivity(i);

    }
}