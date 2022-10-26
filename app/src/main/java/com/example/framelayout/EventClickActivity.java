package com.example.framelayout;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.framelayout.R;

public class EventClickActivity extends AppCompatActivity {
    int total_price = 13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_click);


        EditText name = findViewById(R.id.name);
        EditText phone = findViewById(R.id.phone);

        RadioButton small = findViewById(R.id.small);
        RadioButton medium = findViewById(R.id.medium);
        RadioButton large = findViewById(R.id.large);

        CheckBox meat = findViewById(R.id.meat);
        CheckBox cheese = findViewById(R.id.cheese);
        CheckBox veggies = findViewById(R.id.veggies);

        Switch delivery = findViewById(R.id.delivery);
        TextView yesno = findViewById(R.id.yesno);

        Button order = findViewById(R.id.order);

        TextView price = findViewById(R.id.price);
        TextView total_delivery = findViewById(R.id.total_delivery);

        small.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked) {

                    meat.setChecked(true);
                    cheese.setChecked(false);
                    veggies.setChecked(false);
                    total_price = 11;
                    price.setText("Total Price: " + total_price + "$");

                }
            }
        });
        medium.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked) {

                    meat.setChecked(true);
                    cheese.setChecked(false);
                    veggies.setChecked(false);
                    total_price = 12;
                    price.setText("Total Price: " + total_price + "$");
                }
            }
        });
        large.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked) {
                    meat.setChecked(true);
                    cheese.setChecked(false);
                    veggies.setChecked(false);
                    total_price = 13;

                    price.setText("Total Price: " + total_price + "$");
                }
            }
        });

        meat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked) {
                    total_price +=2;
                    price.setText("Total Price: " + total_price + "$");
                }
                else{
                    total_price -= 2;
                    price.setText("Total Price: " + total_price + "$");
                }
            }
        });
        cheese.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked) {
                    total_price += 2;
                    price.setText("Total Price: " + total_price + "$");
                }
                else{
                    total_price -= 2;
                    price.setText("Total Price: " + total_price + "$");
                }
            }
        });
        veggies.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked) {
                    total_price += 2;
                    price.setText("Total Price: " + total_price + "$");
                }
                else{
                    total_price -= 2;
                    price.setText("Total Price: " + total_price + "$");
                }
            }
        });

        delivery.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked) {
                    total_delivery.setText("Delivery required !");
                    yesno.setText("Yes");
                }
                else{
                    total_delivery.setText("Delivery unrequired !");
                    yesno.setText("No");

                }
            }
        });

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int duration = Toast.LENGTH_SHORT;
                if(name.getText().toString().length() == 0|| phone.getText().toString().length() == 0){
                    Toast toast = Toast.makeText(getApplicationContext(),"Vui lòng nhập đầy đủ thông tin", duration);
                    toast.show();

                }
                else{
                    String size ="";
                    String str_topping = "";
                    if(small.isChecked()){
                        size = "Small; ";
                    }
                    if(medium.isChecked()){
                        size = "Medium; ";
                    }
                    if(large.isChecked()){
                        size = "Large; ";
                    }
                    if(meat.isChecked()){
                        str_topping = str_topping + "Meat ";
                    }
                    if(cheese.isChecked()){
                        str_topping = str_topping + "Cheese ";
                    }
                    if(veggies.isChecked()){
                        str_topping = str_topping + "Veggies ";
                    }
                    String result = "Name: " + name.getText().toString() + "  Phone: " + phone.getText().toString() +"Size: " + size + "Toppings: " + str_topping + "  Total price:" + total_price;
                    Toast toast = Toast.makeText(getApplicationContext(),result , duration);
                    toast.show();
                }

            }
        });




    }
}