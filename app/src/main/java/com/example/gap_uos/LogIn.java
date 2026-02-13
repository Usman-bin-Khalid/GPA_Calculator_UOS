package com.example.gap_uos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class LogIn extends AppCompatActivity {
 private Button signupButton;
    private EditText signupUsernameEditText, signupPasswordEditText, phone, email;
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        sharedPreferences = getPreferences(MODE_PRIVATE);
        if (shouldShowLogin()) {
            // Reset the last login timestamp
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putLong("lastLoginTimestamp", System.currentTimeMillis());
            editor.apply();
            phone = findViewById(R.id.phone);
            email = findViewById(R.id.email);
            signupUsernameEditText = findViewById(R.id.email);
            signupPasswordEditText = findViewById(R.id.password);
            signupButton = findViewById(R.id.b1);
            signupButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String username = signupUsernameEditText.getText().toString();
                    String password = signupPasswordEditText.getText().toString();
                    String phone2 = phone.getText().toString();
                    String email2 = email.getText().toString();
                    if (username.isEmpty()){
                        signupUsernameEditText.setError("Please Enter Name");
                    }  else if (phone2.isEmpty()) {
                        phone.setError("Please Enter Phone No");
                    }
                    else if (password.isEmpty()) {
                        signupPasswordEditText.setError("Please Enter Password");
                    }
                    else if (email2.isEmpty()) {
                        email.setError("Please Enter Email");
                    }
                   else {
                        // Save user credentials in shared preferences
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("username", username);
                        editor.putString("password", password);
                        editor.putBoolean("isLoggedIn", true); // Set the flag indicating the user is logged in
                        editor.apply();
                        Toast.makeText(LogIn.this, "Sign up successfully!", Toast.LENGTH_SHORT).show();
                        // Launch the home activity
                        launchHomeActivity();
                        finish(); // Finish the current activity to prevent going back to the login screen
                    }
                }
            });
        } else {
            // It's within the 10-day period, so launch the home activity directly
            launchHomeActivity();
            finish(); // Finish the current activity to prevent going back to the login screen
        }
        }

    private boolean shouldShowLogin() {
        // Check if it's been more than 10 days since the last login
        long lastLoginTimestamp = sharedPreferences.getLong("lastLoginTimestamp", 0);
        long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime - lastLoginTimestamp;
        long tenDaysInMillis = TimeUnit.DAYS.toMillis(10);

        return elapsedTime >= tenDaysInMillis;
    }
    private void launchHomeActivity() {
        // Replace HomeActivity.class with the actual class of your main content or home activity
        Intent intent = new Intent(this, welcome_activity.class);
        startActivity(intent);
    }
}