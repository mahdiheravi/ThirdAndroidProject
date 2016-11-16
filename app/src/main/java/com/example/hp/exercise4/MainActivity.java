package com.example.hp.exercise4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnreg = (Button) findViewById(R.id.btnregister);
        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtname = (EditText) findViewById(R.id.name);
                String name = txtname.getText().toString();

                EditText txtfamily = (EditText) findViewById(R.id.family);
                String family = txtfamily.getText().toString();

                EditText txtemail = (EditText) findViewById(R.id.email);
                String email = txtemail.getText().toString();

                EditText txtage = (EditText) findViewById(R.id.age);
                int age = Integer.parseInt(txtage.getText().toString());

                if (age >= 5 && age <= 100)
                    if (!name.equals("") && !family.equals("") && !email.equals(""))
                    {
                        Intent myintent = new Intent(MainActivity.this,Main2Activity.class);
                        myintent.putExtra("myname",name);
                        myintent.putExtra("myfamily",family);
                        myintent.putExtra("myage",age);
                        myintent.putExtra("myemail",email);
                        startActivity(myintent);

                    }
                    else
                        Toast.makeText(MainActivity.this, "تمام اطلاعات را وارد کنید", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "محدوده سنی بین 5 تا 100 سال می باشد", Toast.LENGTH_LONG).show();

            }
        });
    }
}
