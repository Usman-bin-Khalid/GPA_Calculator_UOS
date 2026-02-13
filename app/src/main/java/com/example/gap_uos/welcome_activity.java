package com.example.gap_uos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class welcome_activity extends AppCompatActivity {
    Button logout3;
    Button start;
    Button gptu;
    Button CGPA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        logout3 = findViewById(R.id.itfive);
        start = findViewById(R.id.str);
        gptu = findViewById(R.id.gpt);
        CGPA = findViewById(R.id.cgpa);
        CGPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(welcome_activity.this, cgpastart.class));
                Toast.makeText(welcome_activity.this, "CGPA Calculator Of UOS", Toast.LENGTH_SHORT).show();

            }
        });
        gptu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(welcome_activity.this, Start.class));
                Toast.makeText(welcome_activity.this, "GPA Calculator of UOS", Toast.LENGTH_SHORT).show();
            }
        });
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(welcome_activity.this, grade.class));
                Toast.makeText(welcome_activity.this, "Grade Points Table of UOS", Toast.LENGTH_SHORT).show();
            }
        });
        logout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Frequently Asked Questions", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(welcome_activity.this, faqs.class));
            }
        });
    }
}