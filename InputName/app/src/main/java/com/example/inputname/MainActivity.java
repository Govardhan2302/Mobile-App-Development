
package com.example.inputname;
        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText text1;
    TextView view1;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//this name should //follow your xml file's namein layout document.
                text1=(EditText)findViewById(R.id.editTextText2);
        view1=(TextView)findViewById(R.id.textView2);
    }
    public void onclick(View view)
    {
        if(text1.getText().toString().equals(" ")){
            view1.setText("Hello! Default user!");
        }
        else
        {
            view1.setText("Hello " + text1.getText().toString() + "\r ");
        }
    }
}