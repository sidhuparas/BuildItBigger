package com.parassidhu.jokemania;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_TEXT = "joke-text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView jokeTv = findViewById(R.id.joke_tv);
        if (getIntent() != null){
            String joke = getIntent().getStringExtra(JOKE_TEXT);
            jokeTv.setText(joke);
        }
    }
}
