package com.example.scifiname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

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
        String first = String.valueOf(firstNameTXT.getText());
        String last = String.valueOf(lastNameTXT.getText());
        String city = String.valueOf(cityTXT.getText());
        String school = String.valueOf(schoolTXT.getText());
        String brother = String.valueOf(broTXT.getText());
        String sister = String.valueOf(sisTXT.getText());

        //gen bounds for each portion of each var
        Random rand = new Random();
        int rF = rand.nextInt(first.length());
        int rL = rand.nextInt(last.length());
        int rC = rand.nextInt(city.length());
        int rS = rand.nextInt(school.length());
        int rB = rand.nextInt(brother.length());
        int rSi = rand.nextInt(sister.length());

        String scifiFirst = first.substring(0,rF)+last.substring(rL);
        String scifiLast = city.substring(0,rC)+school.substring(rS);
        String scifiHome = brother.substring(0,rB)+sister.substring(rSi);

        output.setText(String.format("Welcome! %s %s from %s",scifiFirst,scifiLast,scifiHome));
    }
}