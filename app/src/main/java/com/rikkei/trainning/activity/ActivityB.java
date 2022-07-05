package com.rikkei.trainning.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {
    private String myTag = "Activity B";
    private Button btnStartA;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Log.d(myTag,"Start OnCreate B");
        Toast.makeText(this, "Start OnCreate B", Toast.LENGTH_LONG).show();
        btnStartA = findViewById(R.id.btnStartA);
        btnStartA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        mediaPlayer = MediaPlayer.create(this,R.raw.music2);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(myTag,"Start OnStart B");
        Toast.makeText(this, "Start OnStart B", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(myTag,"Start OnResume B");
        Toast.makeText(this, "Start OnResume B", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(myTag,"Start OnPause B");
        Toast.makeText(this, "Start OnPause B", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(myTag,"Start OnStop B");
        Toast.makeText(this, "Start OnStop B", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(myTag,"Start Destroy B");
        Toast.makeText(this, "Start OnDestroy B", Toast.LENGTH_LONG).show();
        mediaPlayer.stop();
        mediaPlayer.release();
    }
}