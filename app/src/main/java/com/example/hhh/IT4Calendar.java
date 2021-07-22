package com.example.hhh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

//IT4 달력
public class IT4Calendar extends AppCompatActivity {

    Chronometer it4chronometer;
    Button it4startButton, it4endButton;
    CalendarView it4calendar;
    int selectYear, selectMonth, selectDay;


    Calendar cal = Calendar.getInstance();
    int todayYear = cal.get(Calendar.YEAR);
    int todayMonth = cal.get(Calendar.MONTH) + 1;
    int todayDate = cal.get(Calendar.DATE);


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it4calendar);

        it4endButton = (Button)findViewById(R.id.it4endButton);
        it4calendar = (CalendarView)findViewById(R.id.it4calendar);
        it4calendar.setVisibility(View.VISIBLE);

        it4endButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                //Toast 메세지
                if (selectYear == 0 && selectMonth == 0 && selectDay == 0)
                {
                    Toast.makeText(getApplicationContext(),
                             todayYear+"년 " +todayMonth+
                                  "월 " + todayDate+ "일을 선택했습니다.", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),
                            selectYear + "년 " +
                                    selectMonth + "월 " + selectDay + "일을 선택했습니다.", Toast.LENGTH_LONG).show();
                }

                Intent IT4CalendarIntent = new Intent(IT4Calendar.this, IT4chooseclass_empty.class);
                IT4Calendar.this.startActivity(IT4CalendarIntent);


            }
        });

        it4calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                selectYear = year;
                selectMonth = month + 1;
                selectDay = dayOfMonth;

            }
        });
    }
}
