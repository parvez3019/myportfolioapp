package com.example.parvez.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button streamer_btn = (Button) findViewById(R.id.button1);
        Button score_btn = (Button) findViewById(R.id.button2);
        Button library_btn = (Button) findViewById(R.id.button3);
        Button buildbigger_btn = (Button) findViewById(R.id.button4);
        Button bacon_btn = (Button) findViewById(R.id.button5);
        Button capstone_btn = (Button) findViewById(R.id.button6);


        streamer_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button
                Toast toast = Toast.makeText(getApplicationContext(), "This Button will launch my Spotify Streamer App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        score_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast toast = Toast.makeText(getApplicationContext(), "This Button will launch my Score App", Toast.LENGTH_SHORT);
                toast.show();

            }
        });

        library_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast toast = Toast.makeText(getApplicationContext(), "This Button will launch my Library App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        buildbigger_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast toast = Toast.makeText(getApplicationContext(), "This Button will launch my Build it Bigger App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        bacon_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast toast = Toast.makeText(getApplicationContext(), "This Button will launch my Bacon Reader App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        capstone_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast toast = Toast.makeText(getApplicationContext(), "This Button will launch my Capstone App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}
