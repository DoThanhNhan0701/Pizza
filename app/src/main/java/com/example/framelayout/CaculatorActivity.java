package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class CaculatorActivity extends AppCompatActivity {
    Button btnchoilai;
    TextView txtResuil;
    TextView txtbanchoicaigi;
    ImageView imageViewbao, imageViewbua, imageViewkeo, imageViewhoi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caculator);
        mapping();
        action();
    }


    private void action() {
        imageViewkeo.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                imageViewkeo.setImageResource(R.drawable.img_1);
                imageViewbua.setImageResource(R.drawable.bua);
                imageViewbao.setImageResource(R.drawable.bao);
                Random random = new Random();
                int ran = random.nextInt(3);
                Log.d("KÉO", "onClick: " + ran);
                txtbanchoicaigi.setText("Bạn đã chọn kéo");

                if(ran == 2){
                    imageViewhoi.setImageResource(R.drawable.bao);
                    txtResuil.setText("Bạn thắng");
                }else if(ran == 1){
                    imageViewhoi.setImageResource(R.drawable.keo);
                    txtResuil.setText("Bạn hòa");
                }else{
                    imageViewhoi.setImageResource(R.drawable.bua);
                    txtResuil.setText("Bạn thua");
                }
            }
        });
        imageViewbua.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                imageViewbua.setImageResource(R.drawable.img_2);
                imageViewkeo.setImageResource(R.drawable.keo);
                imageViewbao.setImageResource(R.drawable.bao);

                Random random = new Random();
                int ran = random.nextInt(3);
                Log.d("BÚA", "onClick: " + ran);
                txtbanchoicaigi.setText("Bạn đã chọn búa");


                if(ran == 2){
                    imageViewhoi.setImageResource(R.drawable.keo);
                    txtResuil.setText("Bạn thắng");
                }else if(ran == 1){
                    imageViewhoi.setImageResource(R.drawable.bua);
                    txtResuil.setText("Bạn hòa");
                }else{
                    imageViewhoi.setImageResource(R.drawable.bao);
                    txtResuil.setText("Bạn thua");
                }
            }
        });
        imageViewbao.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                imageViewbao.setImageResource(R.drawable.img_3);
                imageViewbua.setImageResource(R.drawable.bua);
                imageViewkeo.setImageResource(R.drawable.keo);

                Random random = new Random();
                int ran = random.nextInt(3);
                Log.d("BAO", "onClick: " + ran);
                txtbanchoicaigi.setText("Bạn đã chọn bao");


                if(ran == 2){
                    imageViewhoi.setImageResource(R.drawable.bua);
                    txtResuil.setText("Bạn thắng");
                }else if(ran == 1){
                    imageViewhoi.setImageResource(R.drawable.bao);
                    txtResuil.setText("Bạn hòa");
                }else{
                    imageViewhoi.setImageResource(R.drawable.keo);
                    txtResuil.setText("Bạn thua");
                }
            }
        });
        btnchoilai.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                txtResuil.setText("Xin mời bạn chọn");
                txtbanchoicaigi.setText("Bạn chọn cái gì");
                imageViewhoi.setImageResource(R.drawable.icon2);

                imageViewbua.setImageResource(R.drawable.bua);
                imageViewkeo.setImageResource(R.drawable.keo);
                imageViewbao.setImageResource(R.drawable.bao);

            }
        });


    }

    private void mapping() {
        txtbanchoicaigi = findViewById(R.id.banchoaigi);
        btnchoilai = findViewById(R.id.choilai);
        txtResuil = findViewById(R.id.dangcho);
        imageViewhoi = findViewById(R.id.chonicon);

        imageViewkeo = findViewById(R.id.keo);
        imageViewbao = findViewById(R.id.bao);
        imageViewbua = findViewById(R.id.bua);
    }
}