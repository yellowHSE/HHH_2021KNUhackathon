package com.example.hhh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChoosebuildingActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosebuidling);


        //IT4호관 버튼을 누르면 IT4호관 자바 클래스가 실행되도록
        TextView IT4Button = (TextView)findViewById(R.id.IT4Button);
        IT4Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent It4Intent = new Intent(ChoosebuildingActivity.this, IT4Calendar.class);
                ChoosebuildingActivity.this.startActivity(It4Intent);
            }
        });

        //IT5호관 버튼을 누르면 IT5호관 자바 클래스가 실행되도록
        TextView IT5Button = (TextView)findViewById(R.id.IT5Button);
        IT5Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent It5Intent = new Intent(ChoosebuildingActivity.this, IT5Calendar.class);
                ChoosebuildingActivity.this.startActivity(It5Intent);
            }
        });
    }
}
