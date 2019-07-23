package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ShowGuess extends AppCompatActivity {

    private TextView receivedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guess);

        receivedText = findViewById(R.id.textView_receivedText);

        Bundle extra = getIntent().getExtras();

        String value = getIntent().getStringExtra("Name");
        Log.d("TAG", "onCreate: " + extra.getInt("Age"));
        receivedText.setText(value);
    }
}
