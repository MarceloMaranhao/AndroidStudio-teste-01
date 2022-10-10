package com.example.deepcoders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btToast = findViewById(R.id.btToast);
        Button btCount = findViewById(R.id.btCount);
        TextView tvCount = findViewById(R.id.tvCount);
        tvCount.setText("0");



        btToast.setOnClickListener(view -> {
            Toast.makeText(this, "Hello Toast", Toast.LENGTH_LONG).show();
        });

        btCount.setOnClickListener(view -> {
            clickCount+=1;
            tvCount.setText(String.valueOf(clickCount));
        });
    }
}