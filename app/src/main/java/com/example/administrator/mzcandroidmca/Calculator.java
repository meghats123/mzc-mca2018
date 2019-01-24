package com.example.administrator.mzcandroidmca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {
EditText ed1,ed2,ed3;
    String s1,s2,s3;
    Button b;
    int a1,b2,c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        ed1 = (EditText) findViewById(R.id.num1);
        ed2 = (EditText) findViewById(R.id.num2);
        ed3=(EditText)findViewById(R.id.result) ;
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1 = ed1.getText().toString();
                s2 = ed2.getText().toString();
                a1=Integer.parseInt(s1);
                b2=Integer.parseInt(s2);
                c3=a1+b2;
                s3=String.valueOf(c3);

                ed3.setVisibility(View.VISIBLE);
                ed3.setText(s3);
//                Toast.makeText(getApplicationContext(),s3,Toast.LENGTH_LONG).show();
            }
        });
    }}
