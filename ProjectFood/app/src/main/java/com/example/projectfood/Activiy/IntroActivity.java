package com.example.projectfood.Activiy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.projectfood.R;

public class IntroActivity extends AppCompatActivity {

    private ConstraintLayout startbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        //Gán ánh xạ constrainLayout
        startbtn = findViewById(R.id.startbtn);
        //Click qua Main
        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent chuyển activity
                startActivity(new Intent(IntroActivity.this, MainActivity.class));
            }
        });
    }
}