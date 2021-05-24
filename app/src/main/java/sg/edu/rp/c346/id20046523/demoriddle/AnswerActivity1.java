package sg.edu.rp.c346.id20046523.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d("AnswerActivity1", "onCreate() called.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer = findViewById(R.id.textView);

        Intent recIntent = getIntent();
        String selectQ = recIntent.getStringExtra("Question");
        tvAnswer.setText(selectQ + " answer is: Queue");


        if(selectQ.equalsIgnoreCase("q1"))
        {
            tvAnswer.setText(selectQ + "answer is: Queue");
        }
        else if(selectQ.equalsIgnoreCase("q2"))
        {
            tvAnswer.setText(selectQ + "answer is: Gone");
        }

    }
    protected void onStart() {
        Log.d("AnswerActivity1", "onStart() called.");
        super.onStart();
    }

    protected void onResume()
    {
        Log.d("AnswerActivity1", "onResume() called.");
        super.onResume();
    }

    protected void onPaused()
    {
        Log.d("AnswerActivity1", "onPause() called.");
        super.onPause();
    }

    protected void onStop()
    {
        Log.d("AnswerActivity1", "onStop() called.");
        super.onStop();
    }

    protected void onDestory()
    {
        Log.d("AnswerActivity1", "onDestory() called.");
        super.onDestroy();
    }

    protected void onRestart()
    {
        Log.d("AnswerActivity1", "onRestart() called.");
        super.onRestart();
    }
}