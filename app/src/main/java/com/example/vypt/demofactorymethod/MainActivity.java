package com.example.vypt.demofactorymethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    TextView textView1;
    TextView textView2;
    Transport mTransport;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString().equals("outside")){
                    mTransport = new Ship_transport();
                    textView1.setText(mTransport.environment);
                    textView2.setText(String.valueOf(mTransport.speed));
                }
                else if (editText.getText().toString().equals("inside")) {
                    mTransport = new Car_transport();
                    textView1.setText(mTransport.environment);
                    textView2.setText(String.valueOf(mTransport.speed));
                }
                else {

                }
            }
        });
    }
}
