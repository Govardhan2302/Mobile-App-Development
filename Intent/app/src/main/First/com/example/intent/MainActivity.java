package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    EditText e1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editTextText);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.setOnClickListener(){
            public void onClick(View v){
                String str=e1.getText().toString();
                Intent intent=new Intent(getApplicationContext(),Second.class);
                intent.putExtra("message",str);
                startActivities(intent);
            }
        });
    }

}