package com.example.chatapp_resume_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextText , editTextTextPassword;

    TextView textViewforgotpassword , textViewregister;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextText = findViewById(R.id.editTextText);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
        textViewforgotpassword = findViewById(R.id.textViewforgotpassword);
        textViewregister = findViewById(R.id.textViewregister);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = editTextText.getText().toString();
                String password = editTextTextPassword.getText().toString();

                if((username.equals("")) || (password.equals("")))
                {
                    Toast.makeText(MainActivity.this, "Enter the Username or Password", Toast.LENGTH_SHORT).show();
                } else if ((username.equalsIgnoreCase("Rahul")) && (password.equalsIgnoreCase("1935") ) ){

                    Intent intent = new Intent(MainActivity.this , Homepage.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    Toast.makeText(MainActivity.this, "Enter valid Username and Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        textViewforgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(MainActivity.this , forgot_password_page.class);
                startActivity(it);

            }
        });

        textViewregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent itt = new Intent(MainActivity.this , Register_page.class);
            startActivity(itt);
            }
        });

    }
}