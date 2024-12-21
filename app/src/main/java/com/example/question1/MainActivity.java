package com.example.question1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private FrameLayout box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        box = findViewById(R.id.box);
        Button btnUp = findViewById(R.id.btn_up);
        Button btnDown = findViewById(R.id.btn_down);
        Button btnLeft = findViewById(R.id.btn_left);
        Button btnRight = findViewById(R.id.btn_right);

        // Set button click listeners
        btnUp.setOnClickListener(v -> animateBox(0, -300));
        btnDown.setOnClickListener(v -> animateBox(0, 300));
        btnLeft.setOnClickListener(v -> animateBox(-300, 0));
        btnRight.setOnClickListener(v -> animateBox(300, 0));
    }

/**
 * Animates the box by translating
