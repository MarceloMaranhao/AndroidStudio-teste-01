package com.example.deepcoders;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Button btBackgroundColor = findViewById(R.id.btBackgroundColor);
        Button btInitialState = findViewById(R.id.btEsdoInitial);
        Button btNewText = findViewById(R.id.btNewText);
        TextView tvText2 = findViewById(R.id.tvText2);

        btInitialState.setOnClickListener(view -> {
            tvText2.setText("TextView");
            tvText2.setBackgroundColor(Color.TRANSPARENT);
        });

        btNewText.setOnClickListener(view -> {
            tvText2.setText("NewText");
        });

        btBackgroundColor.setOnClickListener(view -> {
            tvText2.setBackgroundColor(Color.parseColor("#ededed"));
        });
    }
}