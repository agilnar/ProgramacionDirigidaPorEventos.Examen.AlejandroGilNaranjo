package com.example.examen_alejandrogilnaranjo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.examen_alejandrogilnaranjo.ui.login.LoginActivity;

public class Welcome_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        Button atras1 = findViewById(R.id.atras1);
        atras1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Welcome_activity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}