package com.example.gap_uos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
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
            case 1:
                activityClass = subject1.class;
                break;
            case 2:
                activityClass = subjects2.class;
                break;
            case 3:
                activityClass = subjects3.class;
                break;
            case 4:
                activityClass = subjects4.class;
                break;
            case 5:
                activityClass = subjects5.class;
                break;
            case 6:
                activityClass = MainActivity.class;
                break;
            case 7:
                activityClass = subjects7.class;
                break;
            default:
                // Handle other cases or show an error message
                return;
        }

        Intent intent = new Intent(Start.this, activityClass);
        startActivity(intent);
    }

}