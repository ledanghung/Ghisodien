package com.example.ghisodien_hung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;

public class ManHinhChaoActivity extends AppCompatActivity {
    ImageView img1;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chao);

        img1 = findViewById(R.id.imgicon);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(ManHinhChaoActivity.this, ScreenDangNhapActivity.class);
                startActivity(intent);
            }
        });

        CountDownTimer Timer = new CountDownTimer(3000, 1000) {
            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                intent = new Intent(ManHinhChaoActivity.this, ScreenDangNhapActivity.class);
                startActivity(intent);

            }
        }.start();
        Timer.start();

    }
}
