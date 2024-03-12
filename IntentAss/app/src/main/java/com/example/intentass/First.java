package com.example.intentass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class First extends AppCompatActivity {
    TextView tv1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        tv1 = findViewById(R.id.textView);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),Second.class);
            startActivity(intent);
        });
    }
}



