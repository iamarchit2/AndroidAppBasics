package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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

        receivedText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = getIntent();
                i.putExtra("message", "Came Back From Second Activity");
                setResult(RESULT_OK, i);
                finish();
            }
        });
    }
}
