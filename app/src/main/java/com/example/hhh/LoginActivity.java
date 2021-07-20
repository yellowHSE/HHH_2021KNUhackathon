package com.example.hhh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView registerButton = (TextView)findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                //intent로 회원가입 버튼을 눌렀을 때 registerActivity로 넘어가게 한다.
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }


        });


        TextView loginButton = (TextView)findViewById(R.id.loginButton);
        registerButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                //intent로 로그인 버튼을 눌렀을 때 ChoosebuildingActivity로 넘어가게 한다.
                Intent loginIntent = new Intent(LoginActivity.this, ChoosebuildingActivity.class);
                LoginActivity.this.startActivity(loginIntent);
            }


        });

    }
}