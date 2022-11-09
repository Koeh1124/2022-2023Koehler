package com.example.pizzaplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup sizeRG;
    private RadioButton smallRB, medRB, largeRB;
    private TextView output;
    private CheckBox ancCB, banCB, jalCB;
    private Button outputBTN;
    private double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sizeRG=findViewById(R.id.sizeRG);
        smallRB=findViewById(R.id.smallRB);
        medRB=findViewById(R.id.mediumRB);
        largeRB=findViewById(R.id.largeRB);

        output=findViewById(R.id.output);

        ancCB=findViewById(R.id.anchovieCB);
        banCB=findViewById(R.id.baconCB);
        jalCB=findViewById(R.id.jalapenosCB);

        outputBTN=findViewById(R.id.outputBTN);

        outputBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total=0;
                if(ancCB.isChecked()){
                    total+=10.00;
                    //Toast.makeText(Activity,msg,length).show()
                    Toast.makeText(MainActivity.this,"Are you serious",Toast.LENGTH_LONG).show();
                }
                if(banCB.isChecked()){
                    total+=5.00;
                }
                if(jalCB.isChecked()){
                    total+=2.50;
                }
                onRadioButtonClicked();
                output.setText(Double.toString(total));
            }
        });
        //if you change somthing it will do somthing
        sizeRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) sizeRG.findViewById(id);
            }
        });
    }
    private void onRadioButtonClicked(){
        //highly reccomend doing this for any widgets that use a function
        //Log will send a msg to your logcat
        Log.d("Radio Button Clicked","triggered");

        //if no radio is clicked do nothing
        int selectedID = sizeRG.getCheckedRadioButtonId();
        if(selectedID==-1){
            Toast.makeText(MainActivity.this,"chose a size",Toast.LENGTH_LONG);
        }
        else{
            //if there is a selected button set new button to that obj
            RadioButton radioButton = (RadioButton) sizeRG.findViewById(selectedID);
            //if small is selected 5
            if(radioButton.getText().equals("small")){
                total+=5;
            }
            //med is 6
            else if(radioButton.getText().equals("medium")){
                total+=6;
            }
            //large is 7
            else{
                total+=7;
            }
        }
    }
}