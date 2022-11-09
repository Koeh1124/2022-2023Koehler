package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button first;
    private EditText firstInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = findViewById(R.id.firstBTN);
        firstInformation = findViewById(R.id.firstUI);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ui = String.valueOf(firstInformation.getText());
                //Intet obj name = new Inent(where are you, where are you going????);
                Intent I = new Intent(MainActivity.this,SecondActivity.class);

                //set keys to vals for the intent to remember
                I.putExtra("userInput",ui);

                startActivity(I);
                //every activity needs a java file and an xml file
            }
        });
    }
}