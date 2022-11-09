package com.example.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private Button second;
    private TextView secondLBL;
    private EditText secondInformation;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_second);   //this connects the xml to the java file :)

        second = findViewById(R.id.secondBTN);
        secondInformation = findViewById(R.id.secondUI);
        secondLBL = findViewById(R.id.secondLBL);

        String valueOfIntent = getIntent().getStringExtra("userInput");
        secondLBL.setText(valueOfIntent);


        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ui = String.valueOf(secondInformation.getText());
                Intent I = new Intent(SecondActivity.this,ThirdActivity.class);
                I.putExtra("userInput",valueOfIntent+"\t"+ui);
                startActivity(I);
            }
        });
    }

    /*
    1. create java and xml files
    2. extends appCompactActivity
    3. setup on create
    4. set ContentView(R.id.new_xml_file)
    5. add Activity to manifest
     */
}
