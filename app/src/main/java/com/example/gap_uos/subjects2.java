package com.example.gap_uos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class subjects2 extends AppCompatActivity {
    EditText mark1, mark2;
    EditText credit1, credit2;
    Button Calculate;
    TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects2);
        mark1 = findViewById(R.id.m1);
        mark2 = findViewById(R.id.m2);
        credit1 = findViewById(R.id.c1);
        credit2 = findViewById(R.id.c2);
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
        int creditHours1 = Integer.parseInt(credit1.getText().toString());
        int creditHours2 = Integer.parseInt(credit2.getText().toString());
        double gpa1 = calculateGradePoint1(marks1) * creditHours1;
        double gpa2 = calculateGradePoint2(marks2) * creditHours2;
        double gpa = gpa1 + gpa2;
        double cc = creditHours1 + creditHours2;
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
}