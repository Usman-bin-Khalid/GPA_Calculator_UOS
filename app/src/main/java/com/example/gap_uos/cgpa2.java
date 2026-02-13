package com.example.gap_uos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class cgpa2 extends AppCompatActivity {
    private EditText[] semesterGPAs;
    private TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa2);
        semesterGPAs = new EditText[]{
                findViewById(R.id.e1),
                findViewById(R.id.e2),
        };
        Button calculateButton = findViewById(R.id.b1);
        resultTextView = findViewById(R.id.t1);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateCGPA();
            }
        });
    }
    private void calculateCGPA() {
        int totalSemesters = semesterGPAs.length;
        double totalGPA = 0;

        for (int i = 0; i < totalSemesters; i++) {
            String semesterGPAString = semesterGPAs[i].getText().toString().trim();

            if (!semesterGPAString.isEmpty()) {
                double semesterGPA = Double.parseDouble(semesterGPAString);
                totalGPA += semesterGPA;
            } else {
                // Handle empty input or invalid GPA
                resultTextView.setText("Please enter valid GPAs for all semesters.");
                return;
            }
        }

        double cgpa = totalGPA / totalSemesters;
        resultTextView.setText(String.format("CGPA : %.2f", cgpa));
    }
}