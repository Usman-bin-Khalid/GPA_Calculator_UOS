package com.example.gap_uos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class cgpastart extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpastart);
//        Spinner spinner = findViewById(R.id.pass);
//        Button button = findViewById(R.id.two);
//
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
//                this,
//                R.array.CGPA,
//                android.R.layout.simple_spinner_item
//        );
//
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int selectedPosition = spinner.getSelectedItemPosition();
//                openActivity(selectedPosition + 1);
//            }
//        });
        final EditText editTextSearch = findViewById(R.id.pass);
        Button buttonSearch = findViewById(R.id.two);
        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editTextSearch.getText().toString().trim();

                // Check user input and open corresponding activity
                if (!userInput.isEmpty()) {
                    int activityNumber = Integer.parseInt(userInput);
                    openActivity(activityNumber);
                }
            }
        });
    }
    private void openActivity(int activityNumber) {
        Class<?> activityClass;

        switch (activityNumber) {
            case 2:
                activityClass = cgpa2.class;
                break;
            case 3:
                activityClass = cgpa3.class;
                break;
            case 4:
                activityClass = cgpa4.class;
                break;
            case 5:
                activityClass = cgpa5.class;
                break;
            case 6:
                activityClass = cgpa6.class;
                break;
            case 7:
                activityClass = cgpa7.class;
                break;
            case 8:
                activityClass = cgpa.class;
                break;
            default:
                // Handle other cases or show an error message
                return;
        }

        Intent intent = new Intent(cgpastart.this, activityClass);
        startActivity(intent);

    }
//private void openActivity(int activityNumber) {
//    String activityName = "act" + activityNumber;
//    try {
//        Class<?> activityClass = Class.forName(getPackageName() + "." + activityName);
//        Intent intent = new Intent(this, activityClass);
//        startActivity(intent);
//    } catch (ClassNotFoundException e) {
//        e.printStackTrace();
//    }
//}
    }