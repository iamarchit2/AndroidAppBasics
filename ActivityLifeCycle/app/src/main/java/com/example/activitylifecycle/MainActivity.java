package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button showGuess;
    private EditText guessName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG", "onCreate: ");

        showGuess = findViewById(R.id.button_guessTheName);
        guessName = findViewById(R.id.editText_enterGuess);
        showGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String receivedData = guessName.getText().toString().trim();
                if(!receivedData.isEmpty()) {
                    Intent i = new Intent(MainActivity.this, ShowGuess.class);
                    i.putExtra("Name", receivedData);
                    i.putExtra("Age", 34);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Please Put Name", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", "onStart: ");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("TAG", "onPostResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroy: ");
    }
}
