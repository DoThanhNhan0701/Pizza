package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FindMeActivity extends AppCompatActivity {
    int diem = 0;
    int luotchoi = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_me);

        Button b1 = findViewById(R.id.txt1);
        Button b2 = findViewById(R.id.txt2);
        Button b3 = findViewById(R.id.txt3);
        Button b4 = findViewById(R.id.txt4);
        Button b5 = findViewById(R.id.txt5);
        Button b6 = findViewById(R.id.txt6);
        Button b7 = findViewById(R.id.txt7);
        Button b8 = findViewById(R.id.txt8);
        Button b9 = findViewById(R.id.txt9);
        Button b10 = findViewById(R.id.txt10);
        Button b11 = findViewById(R.id.txt11);
        Button b12 = findViewById(R.id.txt12);
        Button b13 = findViewById(R.id.txt13);
        Button b14 = findViewById(R.id.txt14);
        Button b15 = findViewById(R.id.txt15);

        Button newgame = findViewById(R.id.txtStart);

        TextView kq = findViewById(R.id.txtResult);

        int ran = new Random().nextInt(13) + 1;
        Log.d("Random", "onCreate: " + ran);

        Button arr[] = {b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15};


        for(Button btn : arr){
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(luotchoi > 0) {
                        int number = Integer.parseInt(btn.getText().toString());
                        if(number == ran) {
                            diem +=10;
                            luotchoi = 2;
                            kq.setText("Doan dung !! Diem cua ban: " + diem);
                        }
                        else {
                            kq.setText("Luot cua ban: " + luotchoi);
                            luotchoi -= 1;
                        }
                    }
                    else {
                        kq.setText("Game Over !");
                    }
                }
            });
        }

        newgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diem = 0;
                luotchoi = 2;
                kq.setText("Ban co 3 luot doan !");
            }
        });
    }

}