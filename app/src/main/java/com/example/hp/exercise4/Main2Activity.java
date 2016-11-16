package com.example.hp.exercise4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

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

        EditText myname = (EditText) findViewById(R.id.name);
        myname.setText(name);

        EditText myemail = (EditText) findViewById(R.id.email);
        myemail.setText(name);

        EditText myfamily = (EditText) findViewById(R.id.family);
        myfamily.setText(name);

        EditText myage = (EditText) findViewById(R.id.age);
        myage.setText(String.valueOf(age));


    }
}
