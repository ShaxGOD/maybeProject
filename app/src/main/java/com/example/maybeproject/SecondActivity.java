package com.example.maybeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView usernameTextView;
String gotUsername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        usernameTextView = findViewById(R.id.gotUsername);
        gotUsername = getIntent().getExtras().getString("Username");
        usernameTextView.setText("Welcome, "+gotUsername + " :)");
    }
    public void returnToLoginPage(View view) {
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(intent);
    }
public void onDirectToAboutCafe(View view) {
    Intent toAboutCafeIntent = new Intent(SecondActivity.this, AboutCafe.class);
    startActivity(toAboutCafeIntent);
}
}