package com.example.hhh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

//IT5 달력
public class IT5Calendar extends AppCompatActivity {
    Button it5endButton;
    CalendarView it5calendar;
    int selectYear, selectMonth, selectDay;

    int presentYear, presentMonth, presentDay;
    


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it5calendar);

        it5endButton = (Button)findViewById(R.id.it5endButton);

        it5calendar = (CalendarView)findViewById(R.id.it5calendar);

        it5calendar.setVisibility(View.VISIBLE);





        it5endButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {


                //Toast 메세지
                Toast.makeText(getApplicationContext(),
                        selectYear+"년 "+
                                selectMonth +"월 "+ selectDay+"일을 선택했습니다.",Toast.LENGTH_LONG).show();


                Intent IT5CalendarIntent = new Intent(IT5Calendar.this, IT5chooseclass_empty.class);
                IT5Calendar.this.startActivity(IT5CalendarIntent);


            }
        });

        it5calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                selectYear = year;
                selectMonth = month + 1;
                selectDay = dayOfMonth;

            }
        });





    }
}
