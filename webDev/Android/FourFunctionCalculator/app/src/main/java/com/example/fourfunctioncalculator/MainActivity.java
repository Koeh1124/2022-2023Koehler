package com.example.fourfunctioncalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //set global vars
    private EditText number1TXT, number2TXT;
    private Button addBTN, subBTN, mulBTN, divBTN;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link java objs to widgets
        number1TXT = findViewById(R.id.number1TXT);
        number2TXT = findViewById(R.id.number2TXT);
        addBTN = findViewById(R.id.addBTN);
        subBTN = findViewById(R.id.minusBTN);
        mulBTN = findViewById(R.id.multBTN);
        divBTN = findViewById(R.id.divBTN);
        output = findViewById(R.id.output);

        //set on click listners
        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(String.valueOf(number1TXT.getText()));
                int num2 = Integer.parseInt(String.valueOf(number2TXT.getText()));
                int ans = num1 + num2;
                output.setText(String.valueOf(ans));
            }
        });

        subBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(String.valueOf(number1TXT.getText()));
                int num2 = Integer.parseInt(String.valueOf(number2TXT.getText()));
                int ans = num1 - num2;
                output.setText(String.valueOf(ans));
            }
        });

        mulBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(String.valueOf(number1TXT.getText()));
                int num2 = Integer.parseInt(String.valueOf(number2TXT.getText()));
                int ans = num1 * num2;
                output.setText(String.valueOf(ans));
            }
        });

        divBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(String.valueOf(number1TXT.getText()));
                int num2 = Integer.parseInt(String.valueOf(number2TXT.getText()));
                int ans = num1 / num2;
                output.setText(String.valueOf(ans));
            }
        });
    }
    //additiional features
}