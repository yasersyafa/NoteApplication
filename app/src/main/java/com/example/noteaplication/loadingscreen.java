package com.example.noteaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class loadingscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadingscreen);
//        membuat agar full screen
        View decorView = getWindow().getDecorView();

        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
//      mmbuat intent activity agar berpindah ke main activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(loadingscreen.this, MainActivity.class));
                finish();
            }
//            lama loading screen 3 detik
        }, 3000);
    }
}