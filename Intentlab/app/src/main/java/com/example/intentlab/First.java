package com.example.intentlab;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class First extends AppCompatActivity {
    EditText eb;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        eb = (EditText)findViewById(R.id.editTextText);
        bt = (Button)findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = eb.getText().toString();
                Intent intent = new Intent(getApplicationContext(), Second.class);
                intent.putExtra("message", str);
                startActivity(intent);
            }
        });
    }
}