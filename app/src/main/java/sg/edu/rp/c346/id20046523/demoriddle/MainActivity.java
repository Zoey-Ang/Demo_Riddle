package sg.edu.rp.c346.id20046523.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvQ1,tvQ2;
    Button btnRevealQ1, btnRevealQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d("MainActivity", "onCreate() called.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvQ1 = findViewById(R.id.textViewQ1);
        btnRevealQ1 = findViewById(R.id.buttonRevealQ1);

        tvQ2 = findViewById(R.id.textViewQ2);
        btnRevealQ2 = findViewById(R.id.buttonRevealQ2);

        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r1 = new Intent(MainActivity.this,AnswerActivity1.class);
                r1.putExtra("Question","Q1");
                startActivity(r1);
            }
        });

        btnRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r2 = new Intent(MainActivity.this,AnswerActivity1.class);
                r2.putExtra("Question","Q2");
                startActivity(r2);
            }
        });
    }
    protected void onStart() {
        Log.d("MainActivity", "onStart() called.");
        super.onStart();
    }

    protected void onResume()
    {
        Log.d("MainActivity", "onResume() called.");
        super.onResume();
    }

    protected void onPaused()
    {
        Log.d("MainActivity", "onPause() called.");
        super.onPause();
    }

    protected void onStop()
    {
        Log.d("MainActivity", "onStop() called.");
        super.onStop();
    }

    protected void onDestory()
    {
        Log.d("MainActivity", "onDestory() called.");
        super.onDestroy();
    }

    protected void onRestart()
    {
        Log.d("MainActivity", "onRestart() called.");
        super.onRestart();
    }
}