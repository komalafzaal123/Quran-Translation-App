package com.example.quranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowCompleteSurah extends AppCompatActivity {

    TextView surah;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_complete_surah);

        surah = findViewById(R.id.surah);

        Intent intent = getIntent();
        String completeSurah = intent.getStringExtra("data");

        surah.setText(completeSurah);
    }
}