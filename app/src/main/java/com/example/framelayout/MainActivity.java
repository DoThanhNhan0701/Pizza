package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView den1, den2, den3, den4, den5, den6, den7, den8;
    Button buttonden;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapping();
        setActionData();
        setOnAllDen();

    }

    private void setOnAllDen() {
        buttonden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pos = buttonden.getText().toString();
                if(pos.equals("Turn on")){
                    buttonden.setText("Turn off");
                    den1.setImageResource(R.drawable.lamb_on);
                    den2.setImageResource(R.drawable.lamb_on);
                    den3.setImageResource(R.drawable.lamb_on);
                    den4.setImageResource(R.drawable.lamb_on);
                    den5.setImageResource(R.drawable.lamb_on);
                    den6.setImageResource(R.drawable.lamb_on);
                    den7.setImageResource(R.drawable.lamb_on);
                    den8.setImageResource(R.drawable.lamb_on);
                }
                else if(pos.equals("Turn off")){
                    buttonden.setText("Turn on");
                    den1.setImageResource(R.drawable.img);
                    den2.setImageResource(R.drawable.img);
                    den3.setImageResource(R.drawable.img);
                    den4.setImageResource(R.drawable.img);
                    den5.setImageResource(R.drawable.img);
                    den6.setImageResource(R.drawable.img);
                    den7.setImageResource(R.drawable.img);
                    den8.setImageResource(R.drawable.img);
                }
            }
        });
    }

    private void setActionData() {
        ImageView[] tamp = {den1, den2, den3, den4, den5, den6, den7, den8};
        for(ImageView btn : tamp){
           btn.setOnClickListener(new View.OnClickListener() {
               int s = 1;
               @Override
               public void onClick(View view) {
                   if(s == 0){
                       s = 1;
                       btn.setImageResource(R.drawable.lamb_on);
                   }
                   else{
                       s = 0;
                       btn.setImageResource(R.drawable.img);
                   }
               }
           });
        }

    }

    private void mapping() {
        den1 = findViewById(R.id.den1);
        den2 = findViewById(R.id.den2);
        den3 = findViewById(R.id.den3);
        den4 = findViewById(R.id.den4);
        den5 = findViewById(R.id.den5);
        den6 = findViewById(R.id.den6);
        den7 = findViewById(R.id.den7);
        den8 = findViewById(R.id.den8);
        buttonden = findViewById(R.id.buttonden);

    }
}