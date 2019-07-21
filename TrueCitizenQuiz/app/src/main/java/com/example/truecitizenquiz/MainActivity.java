package com.example.truecitizenquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button trueButton;
    private Button falseButton;
    private TextView question;
    private ImageButton nextButton;
    private ImageButton prevButton;
    private int idx = 0;
    private Question[] questionBank = new Question[] {
            new Question(R.string.question_amendments, false), //correct: 27
            new Question(R.string.question_constitution, true),
            new Question(R.string.question_declaration, true),
            new Question(R.string.question_independence_rights, true),
            new Question(R.string.question_religion, true),
            new Question(R.string.question_government, false),
            new Question(R.string.question_government_feds, false),
            new Question(R.string.question_government_senators, true),

    };
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trueButton = findViewById(R.id.button_true);
        falseButton = findViewById(R.id.button_false);
        question = findViewById(R.id.textView_question);
        nextButton = findViewById(R.id.button_next);
        prevButton = findViewById(R.id.button_prev);

        /*falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/


        falseButton.setOnClickListener(this); //register our  buttons to listen to OnClickEvents
        trueButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
        prevButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.button_false :
                checkAnswer(false);
                break;
            case R.id.button_true :
                checkAnswer(true);
                break;
            case R.id.button_next :
                idx++;
                idx = idx % questionBank.length;
                question.setText(questionBank[idx].getAnswerResID());
                break;
            case R.id.button_prev :
                idx--;
                if(idx == -1) idx = questionBank.length - 1;
                question.setText(questionBank[idx].getAnswerResID());
                break;
                default: break;
        }
    }

    private void checkAnswer(boolean myAnswer) {
        boolean correctAnswer = questionBank[idx].isAnswerTrue();
        int answerStringID;
        if(correctAnswer == myAnswer) {
            answerStringID = R.string.correct_answer;
        }
        else answerStringID = R.string.wrong_answer;

        Toast.makeText(getApplicationContext(), answerStringID, Toast.LENGTH_SHORT).show();
    }
}
