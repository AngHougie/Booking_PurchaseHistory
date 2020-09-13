package com.example.booking_purchasehistory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE =
            "com.example.android.booking_purchasehistory.extra.MESSAGE";
    public static final String EXTRA_LOCATION =
            "com.example.android.booking_purchasehistory.extra.LOCATION";
    public static final String EXTRA_DATE =
            "com.example.android.booking_purchasehistory.extra.DATE";
    public static final String EXTRA_TIME =
            "com.example.android.booking_purchasehistory.extra.TIME";

    private TextView movieName;
    private TextView location1;
    private TextView location2;
    private TextView location3;
    private TextView date1;
    private TextView date2;
    private TextView date3;
    private TextView time1;
    private TextView time2;
    private TextView time3;
    private TextView time4;
    private TextView time5;
    private TextView time6;
    private TextView time7;
    private TextView time8;
    private TextView time9;
    private static CharSequence date = "14 SEP(MON)";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieName = findViewById(R.id.movie_title);
        location1 = findViewById(R.id.location1);
        location2 = findViewById(R.id.location2);
        location3 = findViewById(R.id.location3);
        date1 = findViewById(R.id.day1);
        date2 = findViewById(R.id.day2);
        date3 = findViewById(R.id.day3);
        time1 = findViewById(R.id.location1time1);
        time2 = findViewById(R.id.location1time2);
        time3 = findViewById(R.id.location1time3);
        time4 = findViewById(R.id.location2time1);
        time5 = findViewById(R.id.location2time2);
        time6 = findViewById(R.id.location2time3);
        time7 = findViewById(R.id.location3time1);
        time8 = findViewById(R.id.location3time2);
        time9 = findViewById(R.id.location3time3);

        TabLayout tabLayout = findViewById(R.id.tabDate);
        TabItem day1 = findViewById(R.id.day1);
        TabItem day2 = findViewById(R.id.day2);
        TabItem day3 = findViewById(R.id.day3);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                View view = tab.getCustomView();
                date = tab.getText().toString();
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

    public void launch1SelectSeatActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SelectSeat.class);
        String message = movieName.getText().toString();
        String location = location1.getText().toString();
        String time = time1.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_LOCATION,location);
        intent.putExtra(EXTRA_DATE, date);
        intent.putExtra(EXTRA_TIME,time);
        startActivity(intent);
    }

    public void launch2SelectSeatActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SelectSeat.class);
        String message = movieName.getText().toString();
        String location = location1.getText().toString();
        String time = time2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_LOCATION,location);
        intent.putExtra(EXTRA_DATE, date);
        intent.putExtra(EXTRA_TIME,time);
        startActivity(intent);
    }

    public void launch3SelectSeatActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SelectSeat.class);
        String message = movieName.getText().toString();
        String location = location1.getText().toString();
        String time = time3.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_LOCATION,location);
        intent.putExtra(EXTRA_DATE, date);
        intent.putExtra(EXTRA_TIME,time);
        startActivity(intent);
    }

    public void launch4SelectSeatActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SelectSeat.class);
        String message = movieName.getText().toString();
        String location = location2.getText().toString();
        String time = time4.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_LOCATION,location);
        intent.putExtra(EXTRA_DATE, date);
        intent.putExtra(EXTRA_TIME,time);
        startActivity(intent);
    }

    public void launch5SelectSeatActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SelectSeat.class);
        String message = movieName.getText().toString();
        String location = location2.getText().toString();
        String time = time5.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_LOCATION,location);
        intent.putExtra(EXTRA_DATE, date);
        intent.putExtra(EXTRA_TIME,time);
        startActivity(intent);
    }

    public void launch6SelectSeatActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SelectSeat.class);
        String message = movieName.getText().toString();
        String location = location2.getText().toString();
        String time = time6.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_LOCATION,location);
        intent.putExtra(EXTRA_DATE, date);
        intent.putExtra(EXTRA_TIME,time);
        startActivity(intent);
    }

    public void launch7SelectSeatActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SelectSeat.class);
        String message = movieName.getText().toString();
        String location = location3.getText().toString();
        String time = time7.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_LOCATION,location);
        intent.putExtra(EXTRA_DATE, date);
        intent.putExtra(EXTRA_TIME,time);
        startActivity(intent);
    }

    public void launch8SelectSeatActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SelectSeat.class);
        String message = movieName.getText().toString();
        String location = location3.getText().toString();
        String time = time8.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_LOCATION,location);
        intent.putExtra(EXTRA_DATE, date);
        intent.putExtra(EXTRA_TIME,time);
        startActivity(intent);
    }

    public void launch9SelectSeatActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SelectSeat.class);
        String message = movieName.getText().toString();
        String location = location3.getText().toString();
        String time = time9.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_LOCATION,location);
        intent.putExtra(EXTRA_DATE, date);
        intent.putExtra(EXTRA_TIME,time);
        startActivity(intent);
    }

}

