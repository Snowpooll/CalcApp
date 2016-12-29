package com.example.snowpool.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView result_text = (TextView)findViewById(R.id.result_text);

        Intent intent = getIntent();
        double intent_result = intent.getDoubleExtra("RESULTS",0.0);
        result_text.setText(String.valueOf(intent_result));
    }
}
