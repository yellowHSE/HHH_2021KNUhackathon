package com.example.hackathon2021;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class classSelectActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectclass);

        Button btnCls101 = findViewById(R.id.button101);
        btnCls101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(classSelectActivity.this, selectSeat101Popup.class);
                classSelectActivity.this.startActivity(intent);
            }
        });
    }
}