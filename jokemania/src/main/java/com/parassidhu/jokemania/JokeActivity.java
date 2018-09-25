package com.parassidhu.jokemania;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_TEXT = "joke-text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        setData();
    }

    private void setData() {
        TextView jokeTv = findViewById(R.id.joke_tv);
        ImageView emojiIv = findViewById(R.id.emoji_iv);

        if (getIntent() != null){
            String joke = getIntent().getStringExtra(JOKE_TEXT);
            jokeTv.setText(joke);
        }

        int randomEmoji = new Random().nextInt(3);

        switch (randomEmoji){
            case 0:
                emojiIv.setImageDrawable(getResources().getDrawable(R.drawable.emoji_joy));
                break;
            case 1:
                emojiIv.setImageDrawable(getResources().getDrawable(R.drawable.emoji_tounge));
                break;
            case 2:
                emojiIv.setImageDrawable(getResources().getDrawable(R.drawable.emoji_floor));
                break;
        }
    }
}
