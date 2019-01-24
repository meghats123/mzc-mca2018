package com.example.administrator.mzcandroidmca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    Button b1,b2;
    String getname,getadmissionno,getmobileno,getemailid,getusername,getpassword,getconformpassword,getregister,getalreadyregistered;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1 = (EditText) findViewById(R.id.name);
        ed2 = (EditText) findViewById(R.id.admissiono);
        ed3 = (EditText) findViewById(R.id.mobileno);
        ed4 = (EditText) findViewById(R.id.emailid);
        ed5 = (EditText) findViewById(R.id.username);
        ed6 = (EditText) findViewById(R.id.pass);
        ed7 = (EditText) findViewById(R.id.conformpassword);
        b1 = (Button) findViewById(R.id.register);
        b2 = (Button) findViewById(R.id.alreadyregistered);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                getname = ed1.getText().toString();
                getadmissionno = ed2.getText().toString();
                getmobileno = ed3.getText().toString();
                getemailid = ed4.getText().toString();
                getusername = ed5.getText().toString();
                getpassword = ed6.getText().toString();
                getconformpassword = ed7.getText().toString();

                if (getpassword.equals(getconformpassword)) {
                    Toast.makeText(getApplicationContext(), getpassword, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "incorrect password", Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent i =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }}
