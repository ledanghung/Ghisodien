package com.example.ghisodien_hung;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScreenDangNhapActivity extends AppCompatActivity {
    Intent intent;
    Button btnLogin, btnCauHinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_dang_nhap);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btnLogin = findViewById(R.id.btnLogin);
        btnCauHinh = findViewById(R.id.btnCauHinh);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(ScreenDangNhapActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnCauHinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(ScreenDangNhapActivity.this,CauHinhActivity.class);
                startActivity(intent);
            }
        });
    }



    public void checkLogin(View view) {

    }
}
