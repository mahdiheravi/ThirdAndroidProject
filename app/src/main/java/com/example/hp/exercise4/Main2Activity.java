package com.example.hp.exercise4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent myintent = getIntent();
        String name =   myintent.getStringExtra("myname");
        String family = myintent.getStringExtra("myfamily");
        String email = myintent.getStringExtra("myemail");
        int age = myintent.getIntExtra("myage",0);

        TextView myname = (TextView) findViewById(R.id.name);
        myname.setText(name);

        TextView myemail = (TextView) findViewById(R.id.email);
        myemail.setText(email);

        TextView myfamily = (TextView) findViewById(R.id.family);
        myfamily.setText(family);

        TextView myage = (TextView) findViewById(R.id.age);
        myage.setText(String.valueOf(age));


    }
}
