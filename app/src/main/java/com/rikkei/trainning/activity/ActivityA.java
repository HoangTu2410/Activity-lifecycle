package com.rikkei.trainning.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity {
    private String myTag = "Activity A";
    private Button btnStartB;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Log.d(myTag,"Start OnCreate A");
        Toast.makeText(this, "Start OnCreate A", Toast.LENGTH_LONG).show();
        btnStartB = findViewById(R.id.btnStartB);
        btnStartB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityA.this,ActivityB.class);
                startActivity(intent);
            }
        });

        mediaPlayer = MediaPlayer.create(this,R.raw.music1);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(myTag,"Start OnStart A");
        Toast.makeText(this, "Start OnStart A", Toast.LENGTH_LONG).show();
        if(!mediaPlayer.isPlaying()){
            mediaPlayer.start();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(myTag,"Start OnResume A");
        Toast.makeText(this, "Start OnResume A", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(myTag,"Start OnPause A");
        Toast.makeText(this, "Start OnPause A", Toast.LENGTH_LONG).show();
        mediaPlayer.pause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(myTag,"Start OnStop A");
        Toast.makeText(this, "Start OnStop A", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(myTag,"Start Destroy A");
        Toast.makeText(this, "Start OnDestroy A", Toast.LENGTH_LONG).show();
        mediaPlayer.stop();
        mediaPlayer.release();
    }
}