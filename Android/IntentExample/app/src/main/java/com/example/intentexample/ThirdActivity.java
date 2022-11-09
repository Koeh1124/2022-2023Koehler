package com.example.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    private TextView thirdLBL;
    private Button thirdBTN;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        thirdLBL = findViewById(R.id.thirdLBL);
        thirdBTN = findViewById(R.id.thirdBTN);

        String valueOfIntent = getIntent().getStringExtra("userInput");
        thirdLBL.setText(valueOfIntent);

        thirdBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(ThirdActivity.this,MainActivity.class);
                startActivity(I);
            }
        });
    }
}
