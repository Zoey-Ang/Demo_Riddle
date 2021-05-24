package sg.edu.rp.c346.id20046523.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tvAns2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2); //link to the correct xml

        tvAns2 = findViewById(R.id.textView2);

        Intent recIntent2 = getIntent();
        String selectQ2 = recIntent2.getStringExtra("Question");
        tvAns2.setText(selectQ2 + " answer is Gone");
    }
}