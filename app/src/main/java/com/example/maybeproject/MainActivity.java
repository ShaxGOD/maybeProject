package com.example.maybeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText getUsername;
    EditText getPassword;
    String username;
    String password;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
    }
    public void onSendLoginInfo (View view) {
         intent = new Intent(this, SecondActivity.class);
        getUsername = (EditText) findViewById(R.id.editTextTextPersonName);
        getPassword = (EditText) findViewById(R.id.editTextTextPassword);
        username = getUsername.getText().toString();
        password = getPassword.getText().toString();
        intent.putExtra("Username",username);
        intent.putExtra("Password",password);
        startActivity(intent);
        finish();
    }
}
