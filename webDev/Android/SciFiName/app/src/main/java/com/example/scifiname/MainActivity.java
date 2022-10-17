package com.example.scifiname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //First thing create global vars for widgets
    EditText firstNameTXT,lastNameTXT,cityTXT,schoolTXT,broTXT,sisTXT;
    Button generatorBTN;
    TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Second Thing connect global vars to widgets
        firstNameTXT = findViewById(R.id.firstTXT);
        lastNameTXT = findViewById(R.id.lastTXT);
        cityTXT = findViewById(R.id.cityTXT);
        schoolTXT = findViewById(R.id.schoolTXT);
        broTXT = findViewById(R.id.broTXT);
        sisTXT = findViewById(R.id.sisTXT);
        generatorBTN = findViewById(R.id.generatorBTN);
        output = findViewById(R.id.output);

        generatorBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generate();
            }
        });
    }
    private void generate() {

    }
}