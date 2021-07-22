package com.example.hackathon2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectmenu);

        Button selfStudyBtn = (Button) findViewById(R.id.button_std);
        selfStudyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuSelectActivity.this, classSelectActivity.class);
                menuSelectActivity.this.startActivity(intent);
            }
        });
    }
}