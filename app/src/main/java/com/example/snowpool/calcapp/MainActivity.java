package com.example.snowpool.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText num1;
    EditText num2;

    Button plus;
    Button minas;
    Button multi;
    Button div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 =(EditText)findViewById(R.id.num1);
        num2 =(EditText)findViewById(R.id.num2);

        plus =(Button)findViewById(R.id.plus);
        plus.setOnClickListener(this);
        minas =(Button)findViewById(R.id.minas);
        minas.setOnClickListener(this);
        multi =(Button)findViewById(R.id.multi);
        multi.setOnClickListener(this);
        div =(Button)findViewById(R.id.div);
        div.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {




        if(num1.length() !=0 && num2.length() != 0){

            double arg1 = Double.parseDouble(num1.getText().toString());
            double arg2 = Double.parseDouble(num2.getText().toString());
            double result;

            Intent intent = new Intent(this,Result.class);


            switch (view.getId()){
                case R.id.plus:
                    result = arg1 + arg2;
                    intent.putExtra("RESULTS",result);
                    startActivity(intent);
                    break;

                case R.id.minas:
                    result = arg1 - arg2;
                    intent.putExtra("RESULTS",result);
                    startActivity(intent);
                    break;

                case  R.id.multi:
                    result = arg1 * arg2;
                    intent.putExtra("RESULTS",result);
                    startActivity(intent);
                    break;

                case R.id.div:
                    result = arg1 / arg2;
                    intent.putExtra("RESULTS",result);
                    startActivity(intent);
                    break;
            }

        }else{
            Toast.makeText(this,"両方の数値をいれてからボタンをおしてください",Toast.LENGTH_SHORT).show();
        }


    }
}
