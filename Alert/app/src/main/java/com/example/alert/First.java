package com.example.alert;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class First extends AppCompatActivity {
    private Button bt;
    private EditText email;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        bt = (Button) findViewById(R.id.button);
        email = (EditText) findViewById(R.id.editTextText);
        bt.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String val = email.getText().toString();
                if (val == null || val.length() == 0) {
                    Toast.makeText(getApplicationContext(),
                            "Please Enter the email", Toast.LENGTH_LONG).show();
                } else if (val.equals("bgss.2302@gmail.com")) {
                    Intent intent = new Intent(getApplicationContext(),
                            Second.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),
                            "Login Success", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                                    "Please Enter valid email", Toast.LENGTH_LONG)
                            .show();
                }
            }
        });
    }
}