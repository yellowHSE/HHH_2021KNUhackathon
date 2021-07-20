package com.example.hhh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {


    private AlertDialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView registerButton = (TextView)findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }


        });


        final EditText idText = (EditText)findViewById(R.id.idText);
        final EditText passwordText = (EditText)findViewById(R.id.passwordText);
        final Button loginButton = (Button)findViewById(R.id.loginButton);


        loginButton.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, ChoosebuildingActivity.class);
                LoginActivity.this.startActivity(intent);
                finish();

            }


        });





    }
}