package com.example.chatapp_resume_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Calendar;

public class Register_page extends AppCompatActivity {

    EditText editTextText2 , editTextTextEmailAddress , editTextPhone , editTextNumberPassword ,editTextcalender;

    RadioButton radioButton , radioButton2 ;

    Button button4 , button5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        editTextText2 = findViewById(R.id.editTextText2);
        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextNumberPassword = findViewById(R.id.editTextNumberPassword);
        editTextcalender = findViewById(R.id.editTextcalender);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        button4 = findViewById(R.id.button4);


        Calendar c  = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        editTextcalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog dpd = new DatePickerDialog(Register_page.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                            editTextcalender.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },year,month,day);
                 dpd.show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Register_page.this, "Registered Successfully", Toast.LENGTH_LONG).show();

                Intent in = new Intent(Register_page.this , MainActivity.class);
                startActivity(in);
            }
        });


    }
}