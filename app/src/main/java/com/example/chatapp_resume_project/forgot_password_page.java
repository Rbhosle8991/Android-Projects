package com.example.chatapp_resume_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class forgot_password_page extends AppCompatActivity {

    EditText editTextTextPassword2 , editTextTextPassword3;

    Button button2 , button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_page);

        editTextTextPassword2 = findViewById(R.id.editTextTextPassword2);
        editTextTextPassword3 = findViewById(R.id.editTextTextPassword3);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String txt1 = editTextTextPassword2.getText().toString();
                String txt2 = editTextTextPassword3.getText().toString();

                if((txt1.equals("")) || (txt2.equals("")))
                {
                    Toast.makeText(forgot_password_page.this, "Enter new Password", Toast.LENGTH_SHORT).show();
                }

                else if(!txt1.equals(txt2))
                {
                    Toast.makeText(forgot_password_page.this, "Passwords are different", Toast.LENGTH_SHORT).show();
                }

                else {

                    Toast.makeText(forgot_password_page.this, "Password is set", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itn = new Intent(forgot_password_page.this , MainActivity.class);
                startActivity(itn);
            }
        });
    }
}