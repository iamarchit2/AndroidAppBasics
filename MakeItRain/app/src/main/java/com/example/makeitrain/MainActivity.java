package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

   /* private Button showMoney;
    private Button showTag;*/
    private int moneyCounter = 0;
    private TextView moneyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moneyText = findViewById(R.id.textView_money);
        /*showMoney = findViewById(R.id.button_make_rain);
        showTag = findViewById(R.id.button_show_tag);*/

        /*showMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MyTag", "onClick: Show Money");
            }
        });*/
    }
    public void showTag(View v) {
        Log.d("MyTag", "onClick: Show Tag");
    }
    public void makeItRain(View v) {
        NumberFormat myFormat = NumberFormat.getCurrencyInstance();
        moneyCounter += 1000;
        moneyText.setText(String.valueOf(myFormat.format(moneyCounter)));
        Log.d("MyTag", "onClick: Show Money" + moneyCounter);
    }
}
