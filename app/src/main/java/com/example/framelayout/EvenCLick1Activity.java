package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EvenCLick1Activity extends AppCompatActivity implements View.OnClickListener  {
    LinearLayout layoutbmi;
    TextView layoutlight;
    TextView layoutquota;
    TextView layoutmusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_even_click1);
        mapping();

//C1
        layoutquota.setOnClickListener(listener);
// C3
        layoutmusic.setOnClickListener(this);
//C2
        layoutbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FindMeActivity.class);
                startActivity(intent);

            }
        });
    }
    // c3
    public void BMI(View v){
        Intent intent = new Intent(getApplicationContext(), CaculatorActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(), EventClickActivity.class);
        startActivity(intent);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), FindMeActivity.class);
            startActivity(intent);
        }
    };



    private void mapping() {
        layoutbmi = (LinearLayout) findViewById(R.id.bmi);
        layoutlight = (TextView) findViewById(R.id.lightting);
        layoutquota = (TextView) findViewById(R.id.quota);
        layoutmusic = (TextView) findViewById(R.id.music);
    }




}