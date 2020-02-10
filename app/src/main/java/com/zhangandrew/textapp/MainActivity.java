package com.zhangandrew.textapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    TextView displayText;
    EditText responseText;
    Button arrayButton;
    TextView arrayText;
    int number = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = findViewById(R.id.clickButton);
        displayText=findViewById(R.id.textBox);
        responseText=findViewById(R.id.responseEditText);
        arrayButton = findViewById(R.id.clickButton1);
        arrayText = findViewById(R.id.textBox1);
        final String[] array = getResources().getStringArray(R.array.planets_array);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("name");
                displayText.setText(responseText.getText());
            }
        });
        arrayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number>7) {
                    number = 0;
                }
                System.out.println("" + number);
                arrayText.setText("" + array[number]);
                number++;
            }
        });
    }
}
