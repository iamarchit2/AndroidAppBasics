package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

   /* private Button showMoney;
    private Button showTag;*/
    private int moneyCounter = 0;
    private TextView moneyText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another_layout);
        moneyText = findViewById(R.id.textView_money);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("NEW BUTTON", "onClick: New Button Pressed");
            }
        });

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
        Toast.makeText(getApplicationContext(), R.string.app_name, Toast.LENGTH_LONG).show();
    }
    public void makeItRain(View v) {
        NumberFormat myFormat = NumberFormat.getCurrencyInstance();
        moneyCounter += 1000;
        switch (moneyCounter) {
            case 20000 :
                moneyText.setTextColor(Color.BLACK);
                break;
            case 40000 :
                moneyText.setTextColor(Color.YELLOW);
                break;
            case 60000 :
                moneyText.setTextColor(Color.GREEN);
                break;
                default: break;
        }
        moneyText.setText(String.valueOf(myFormat.format(moneyCounter)));
        Log.d("MyTag", "onClick: Show Money" + moneyCounter);
    }
}
