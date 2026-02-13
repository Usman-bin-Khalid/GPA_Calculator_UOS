package com.example.gap_uos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
     EditText mark1, mark2, mark3, mark4, mark5, mark6;
     EditText credit1, credit2, credit3, credit4, credit5, credit6;
     Button Calculate;
     TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mark1 = findViewById(R.id.m1);
        mark2 = findViewById(R.id.m2);
        mark3 = findViewById(R.id.m3);
        mark4 = findViewById(R.id.m4);
        mark5 = findViewById(R.id.m5);
        mark6 = findViewById(R.id.m6);
        credit1 = findViewById(R.id.c1);
        credit2 = findViewById(R.id.c2);
        credit3 = findViewById(R.id.c3);
        credit4 = findViewById(R.id.c4);
        credit5 = findViewById(R.id.c5);
        credit6 = findViewById(R.id.c6);
        Calculate = findViewById(R.id.gpa);
        Result = findViewById(R.id.show);
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateGPA();
            }
        });
    }
    private void calculateGPA() {
        // Retrieve marks and credit hours from EditText fields
        int marks1 = Integer.parseInt(mark1.getText().toString());
        int marks2 = Integer.parseInt(mark2.getText().toString());
        int marks3 = Integer.parseInt(mark3.getText().toString());
        int marks4 = Integer.parseInt(mark4.getText().toString());
        int marks5 = Integer.parseInt(mark5.getText().toString());
        int marks6 = Integer.parseInt(mark6.getText().toString());
        int creditHours1 = Integer.parseInt(credit1.getText().toString());
        int creditHours2 = Integer.parseInt(credit2.getText().toString());
        int creditHours3 = Integer.parseInt(credit3.getText().toString());
        int creditHours4 = Integer.parseInt(credit4.getText().toString());
        int creditHours5 = Integer.parseInt(credit5.getText().toString());
        int creditHours6 = Integer.parseInt(credit6.getText().toString());
        // Calculate GPA based on your logic
        double gpa1 = calculateGradePoint1(marks1) * creditHours1;
        double gpa2 = calculateGradePoint2(marks2) * creditHours2;
        double gpa3 = calculateGradePoint3(marks3) * creditHours3;
        double gpa4 = calculateGradePoint4(marks4) * creditHours4;
        double gpa5 = calculateGradePoint5(marks5) * creditHours5;
        double gpa6 = calculateGradePoint6(marks6) * creditHours6;
        double gpa = gpa1 + gpa2 + gpa3 + gpa4 + gpa5 + gpa6;
        double cc = creditHours1 + creditHours2 + creditHours3 + creditHours4 + creditHours5 + creditHours6;
        double chatgpt = gpa / cc;
        // Display the result
        Result.setText("Your GPA is : " + chatgpt);
    }
    private double calculateGradePoint1(int marks1) {
        // Implement your own logic to map marks to grade points
        // This is just a simple example, you may need to adjust it based on your grading system
        if (marks1 >= 80) {
            return 4.0;
        }
        else if (marks1 == 79) {
            return 3.94;
        } else if (marks1 == 78) {
            return 3.87;
        } else if (marks1 == 77) {
            return 3.80;
        } else if (marks1  == 76) {
             return 3.74;
        } else if (marks1 == 75) {
            return 3.67;
        } else if (marks1 == 74) {
             return 3.60;
        } else if (marks1 == 73) {
             return 3.54;
        }else if (marks1 == 72) {
            return 3.47;
        }
        else if (marks1 == 71) {
            return 3.40;
        }
        else if (marks1 == 70) {
            return 3.34;
        }
        else if (marks1 == 69) {
            return 3.27;
        }
        else if (marks1 == 68) {
            return 3.20;
        }
        else if (marks1 == 67) {
            return 3.14;
        }
        else if (marks1 == 66) {
            return 3.07;
        }
        else if (marks1 == 65) {
            return 3.00;
        }
        else if (marks1 == 64) {
            return 2.92;
        }
        else if (marks1 == 63) {
            return 2.85;
        }
        else if (marks1 == 62) {
            return 2.78;
        }
        else if (marks1 == 61) {
            return 2.70;
        }
        else if (marks1 == 60) {
            return 2.64;
        }
        else if (marks1 == 59) {
            return 2.57;
        }
        else if (marks1 == 58) {
            return 2.50;
        }
        else if (marks1 == 57) {
            return 2.43;
        }
        else if (marks1 == 56) {
            return 2.36;
        }
        else if (marks1 == 55) {
            return 2.30;
        }
        else if (marks1 == 54) {
            return 2.24;
        }
        else if (marks1 == 53) {
            return 2.18;
        }
        else if (marks1 == 52) {
            return 2.12;
        }
        else if (marks1 == 51) {
            return 2.06;
        }
        else if (marks1 == 50) {
            return 2.00;
        }
        else if (marks1 == 49) {
            return 1.90;
        }
        else if (marks1 == 48) {
            return 1.80;
        }
        else if (marks1 == 47) {
            return 1.70;
        }
        else if (marks1 == 46) {
            return 1.60;
        }
        else if (marks1 == 45) {
            return 1.50;
        }
        else if (marks1 == 44) {
            return 1.40;
        }
        else if (marks1 == 43) {
            return 1.30;
        }
        else if (marks1 == 42) {
            return 1.20;
        }
        else if (marks1 == 41) {
            return 1.10;
        }
        else if (marks1 == 40) {
            return 1.00;
        } else if (marks1 <= 39) {
            return 0.0;
        } else {
            return 0.0;
        }
    }
    private double calculateGradePoint2(int marks2) {
        // Implement your own logic to map marks to grade points
        // This is just a simple example, you may need to adjust it based on your grading system
        if (marks2 >= 80) {
            return 4.0;
        } else if (marks2 == 79) {
            return 3.94;
        } else if (marks2 == 78) {
            return 3.87;
        } else if (marks2 == 77) {
            return 3.80;
        } else if (marks2  == 76) {
            return 3.74;
        } else if (marks2 == 75) {
             return 3.67;
        } else if (marks2 == 74) {
            return 3.60;

        } else if (marks2 == 73) {
             return 3.54;
        } else if (marks2 == 72) {
            return 3.47;
        }else if (marks2 == 71) {
            return 3.40;
        }
        else if (marks2 == 70) {
            return 3.34;
        }
        else if (marks2 == 69) {
            return 3.27;
        }
        else if (marks2 == 68) {
            return 3.20;
        }
        else if (marks2 == 67) {
            return 3.14;
        }
        else if (marks2 == 66) {
            return 3.07;
        }
        else if (marks2 == 65) {
            return 3.00;
        }
        else if (marks2 == 64) {
            return 2.92;
        }
        else if (marks2 == 63) {
            return 2.85;
        }
        else if (marks2 == 62) {
            return 2.78;
        }
        else if (marks2 == 61) {
            return 2.70;
        }
        else if (marks2 == 60) {
            return 2.64;
        }
        else if (marks2 == 59) {
            return 2.57;
        }
        else if (marks2 == 58) {
            return 2.50;
        }
        else if (marks2 == 57) {
            return 2.43;
        }
        else if (marks2 == 56) {
            return 2.36;
        }
        else if (marks2 == 55) {
            return 2.30;
        }
        else if (marks2 == 54) {
            return 2.24;
        }
        else if (marks2 == 53) {
            return 2.18;
        }
        else if (marks2 == 52) {
            return 2.12;
        }
        else if (marks2 == 51) {
            return 2.06;
        }
        else if (marks2 == 50) {
            return 2.00;
        }
        else if (marks2 == 49) {
            return 1.90;
        }
        else if (marks2 == 48) {
            return 1.80;
        }
        else if (marks2 == 47) {
            return 1.70;
        }
        else if (marks2 == 46) {
            return 1.60;
        }
        else if (marks2 == 45) {
            return 1.50;
        }
        else if (marks2 == 44) {
            return 1.40;
        }
        else if (marks2 == 43) {
            return 1.30;
        }
        else if (marks2 == 42) {
            return 1.20;
        }
        else if (marks2 == 41) {
            return 1.10;
        }
        else if (marks2 == 40) {
            return 1.00;
        } else if (marks2 <= 39) {
            return 0.0;
        } else {
            return 0.0;
        }
    }
    private double calculateGradePoint3(int marks3) {
        // Implement your own logic to map marks to grade points
        // This is just a simple example, you may need to adjust it based on your grading system
        if (marks3 >= 80) {
            return 4.0;
        } else if (marks3 == 79) {
            return 3.94;
        } else if (marks3 == 78) {
            return 3.87;
        } else if (marks3 == 77) {
            return 3.80;
        } else if (marks3  == 76) {
            return 3.74;
        } else if (marks3 == 75) {
            return 3.67;
        } else if (marks3 == 74) {
            return 3.60;
        } else if (marks3 == 73) {
            return 3.54;
        } else if (marks3 == 72) {
            return 3.47;
        }else if (marks3 == 71) {
            return 3.40;
        }
        else if (marks3 == 70) {
            return 3.34;
        }
        else if (marks3 == 69) {
            return 3.27;
        }
        else if (marks3 == 68) {
            return 3.20;
        }
        else if (marks3 == 67) {
            return 3.14;
        }
        else if (marks3 == 66) {
            return 3.07;
        }
        else if (marks3 == 65) {
            return 3.00;
        }
        else if (marks3 == 64) {
            return 2.92;
        }
        else if (marks3 == 63) {
            return 2.85;
        }
        else if (marks3 == 62) {
            return 2.78;
        }
        else if (marks3 == 61) {
            return 2.70;
        }
        else if (marks3 == 60) {
            return 2.64;
        }
        else if (marks3 == 59) {
            return 2.57;
        }
        else if (marks3 == 58) {
            return 2.50;
        }
        else if (marks3 == 57) {
            return 2.43;
        }
        else if (marks3 == 56) {
            return 2.36;
        }
        else if (marks3 == 55) {
            return 2.30;
        }
        else if (marks3 == 54) {
            return 2.24;
        }
        else if (marks3 == 53) {
            return 2.18;
        }
        else if (marks3 == 52) {
            return 2.12;
        }
        else if (marks3 == 51) {
            return 2.06;
        }
        else if (marks3 == 50) {
            return 2.00;
        }
        else if (marks3 == 49) {
            return 1.90;
        }
        else if (marks3 == 48) {
            return 1.80;
        }
        else if (marks3 == 47) {
            return 1.70;
        }
        else if (marks3 == 46) {
            return 1.60;
        }
        else if (marks3 == 45) {
            return 1.50;
        }
        else if (marks3 == 44) {
            return 1.40;
        }
        else if (marks3 == 43) {
            return 1.30;
        }
        else if (marks3 == 42) {
            return 1.20;
        }
        else if (marks3 == 41) {
            return 1.10;
        }
        else if (marks3 == 40) {
            return 1.00;
        }
        else if (marks3 <= 40) {
            return 0.0;
        }
        else {
            return 0.0;
        }
    }
    private double calculateGradePoint4(int marks4) {
        // Implement your own logic to map marks to grade points
        // This is just a simple example, you may need to adjust it based on your grading system
        if (marks4 >= 80) {
            return 4.0;
        } else if (marks4 == 79) {
            return 3.94;
        } else if (marks4 == 78) {
            return 3.87;
        } else if (marks4 == 77) {
            return 3.80;
        } else if (marks4  == 76) {
            return 3.74;
        } else if (marks4 == 75) {
            return 3.67;
        } else if (marks4 == 74) {
            return 3.60;
        } else if (marks4 == 73) {
            return 3.54;
        } else if (marks4 == 72) {
            return 3.47;
        }else if (marks4 == 71) {
            return 3.40;
        }
        else if (marks4 == 70) {
            return 3.34;
        }
        else if (marks4 == 69) {
            return 3.27;
        }
        else if (marks4 == 68) {
            return 3.20;
        }
        else if (marks4 == 67) {
            return 3.14;
        }
        else if (marks4 == 66) {
            return 3.07;
        }
        else if (marks4 == 65) {
            return 3.00;
        }
        else if (marks4 == 64) {
            return 2.92;
        }
        else if (marks4 == 63) {
            return 2.85;
        }
        else if (marks4 == 62) {
            return 2.78;
        }
        else if (marks4 == 61) {
            return 2.70;
        }
        else if (marks4 == 60) {
            return 2.64;
        }
        else if (marks4 == 59) {
            return 2.57;
        }
        else if (marks4 == 58) {
            return 2.50;
        }
        else if (marks4 == 57) {
            return 2.43;
        }
        else if (marks4 == 56) {
            return 2.36;
        }
        else if (marks4 == 55) {
            return 2.30;
        }
        else if (marks4 == 54) {
            return 2.24;
        }
        else if (marks4 == 53) {
            return 2.18;
        }
        else if (marks4 == 52) {
            return 2.12;
        }
        else if (marks4 == 51) {
            return 2.06;
        }
        else if (marks4 == 50) {
            return 2.00;
        }
        else if (marks4 == 49) {
            return 1.90;
        }
        else if (marks4 == 48) {
            return 1.80;
        }
        else if (marks4 == 47) {
            return 1.70;
        }
        else if (marks4 == 46) {
            return 1.60;
        }
        else if (marks4 == 45) {
            return 1.50;
        }
        else if (marks4 == 44) {
            return 1.40;
        }
        else if (marks4 == 43) {
            return 1.30;
        }
        else if (marks4 == 42) {
            return 1.20;
        }
        else if (marks4 == 41) {
            return 1.10;
        }
        else if (marks4 == 40) {
            return 1.00;
        } else if (marks4 <=39) {
            return 0.0;
        } else {
            return 0.0;
        }
    }
    private double calculateGradePoint5(int marks5) {
        // Implement your own logic to map marks to grade points
        // This is just a simple example, you may need to adjust it based on your grading system
        if (marks5 >= 80) {
            return 4.0;
        } else if (marks5 == 79) {
            return 3.94;
        } else if (marks5 == 78) {
            return 3.87;
        } else if (marks5 == 77) {
            return 3.80;
        } else if (marks5  == 76) {
            return 3.74;
        } else if (marks5 == 75) {
            return 3.67;
        } else if (marks5 == 74) {
            return 3.60;

        } else if (marks5 == 73) {
            return 3.54;
        } else if (marks5 == 72) {
            return 3.47;
        }else if (marks5 == 71) {
            return 3.40;
        }
        else if (marks5 == 70) {
            return 3.34;
        }
        else if (marks5 == 69) {
            return 3.27;
        }
        else if (marks5 == 68) {
            return 3.20;
        }
        else if (marks5 == 67) {
            return 3.14;
        }
        else if (marks5 == 66) {
            return 3.07;
        }
        else if (marks5 == 65) {
            return 3.00;
        }
        else if (marks5 == 64) {
            return 2.92;
        }
        else if (marks5 == 63) {
            return 2.85;
        }
        else if (marks5 == 62) {
            return 2.78;
        }
        else if (marks5 == 61) {
            return 2.70;
        }
        else if (marks5 == 60) {
            return 2.64;
        }
        else if (marks5 == 59) {
            return 2.57;
        }
        else if (marks5 == 58) {
            return 2.50;
        }
        else if (marks5 == 57) {
            return 2.43;
        }
        else if (marks5 == 56) {
            return 2.36;
        }
        else if (marks5 == 55) {
            return 2.30;
        }
        else if (marks5 == 54) {
            return 2.24;
        }
        else if (marks5 == 53) {
            return 2.18;
        }
        else if (marks5 == 52) {
            return 2.12;
        }
        else if (marks5 == 51) {
            return 2.06;
        }
        else if (marks5 == 50) {
            return 2.00;
        }
        else if (marks5 == 49) {
            return 1.90;
        }
        else if (marks5 == 48) {
            return 1.80;
        }
        else if (marks5 == 47) {
            return 1.70;
        }
        else if (marks5 == 46) {
            return 1.60;
        }
        else if (marks5 == 45) {
            return 1.50;
        }
        else if (marks5 == 44) {
            return 1.40;
        }
        else if (marks5 == 43) {
            return 1.30;
        }
        else if (marks5 == 42) {
            return 1.20;
        }
        else if (marks5 == 41) {
            return 1.10;
        }
        else if (marks5 == 40) {
            return 1.00;
        } else if (marks5 <=39) {
            return 0.0;
        } else {
            return 0.0;
        }
    }
    private double calculateGradePoint6(int marks6) {
        // Implement your own logic to map marks to grade points
        // This is just a simple example, you may need to adjust it based on your grading system
        if (marks6 >= 80) {
            return 4.0;
        } else if (marks6 == 79) {
            return 3.94;
        } else if (marks6 == 78) {
            return 3.87;
        } else if (marks6 == 77) {
            return 3.80;
        } else if (marks6  == 76) {
            return 3.74;
        } else if (marks6 == 75) {
            return 3.67;
        } else if (marks6 == 74) {
            return 3.60;

        } else if (marks6 == 73) {
            return 3.54;
        } else if (marks6 == 72) {
            return 3.47;
        }else if (marks6 == 71) {
            return 3.40;
        }
        else if (marks6 == 70) {
            return 3.34;
        }
        else if (marks6 == 69) {
            return 3.27;
        }
        else if (marks6 == 68) {
            return 3.20;
        }
        else if (marks6 == 67) {
            return 3.14;
        }
        else if (marks6 == 66) {
            return 3.07;
        }
        else if (marks6 == 65) {
            return 3.00;
        }
        else if (marks6 == 64) {
            return 2.92;
        }
        else if (marks6 == 63) {
            return 2.85;
        }
        else if (marks6 == 62) {
            return 2.78;
        }
        else if (marks6 == 61) {
            return 2.70;
        }
        else if (marks6 == 60) {
            return 2.64;
        }
        else if (marks6 == 59) {
            return 2.57;
        }
        else if (marks6 == 58) {
            return 2.50;
        }
        else if (marks6 == 57) {
            return 2.43;
        }
        else if (marks6 == 56) {
            return 2.36;
        }
        else if (marks6 == 55) {
            return 2.30;
        }
        else if (marks6 == 54) {
            return 2.24;
        }
        else if (marks6 == 53) {
            return 2.18;
        }
        else if (marks6 == 52) {
            return 2.12;
        }
        else if (marks6 == 51) {
            return 2.06;
        }
        else if (marks6 == 50) {
            return 2.00;
        }
        else if (marks6 == 49) {
            return 1.90;
        }
        else if (marks6 == 48) {
            return 1.80;
        }
        else if (marks6 == 47) {
            return 1.70;
        }
        else if (marks6 == 46) {
            return 1.60;
        }
        else if (marks6 == 45) {
            return 1.50;
        }
        else if (marks6 == 44) {
            return 1.40;
        }
        else if (marks6 == 43) {
            return 1.30;
        }
        else if (marks6 == 42) {
            return 1.20;
        }
        else if (marks6 == 41) {
            return 1.10;
        }
        else if (marks6 == 40) {
            return 1.00;
        } else if (marks6 == 39) {
            return 0.0;
        }
        else if (marks6 == 38) {
            return 0.0;
        }
        else if (marks6 == 37) {
            return 0.0;
        }
        else if (marks6 == 36) {
            return 0.0;
        }
        else if (marks6 <= 35) {
            return 0.0;
        }
        else {
            return 0.0;
        }
    }
}