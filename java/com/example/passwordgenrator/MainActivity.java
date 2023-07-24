package com.example.passwordgenrator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private TextView passwordTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.BPassword);
        passwordTextView = findViewById(R.id.TvPassword);
        btn.setOnClickListener(v -> {

            // For Generating a random password
            String password = PasswordG.genrate();

            // Display the password on the screen
            passwordTextView.setText(password);
        });

    }


}
