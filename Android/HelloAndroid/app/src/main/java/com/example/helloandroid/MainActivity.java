package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    static TextView outputLBL;
    static EditText inputTXT;
    Button enterBTN;
    //the first method to be rn -> on screen boot, goes here
    @Override
    protected void onCreate(Bundle savedInstanceState) {    //equivalent to public static void main
        super.onCreate(savedInstanceState);                 //inheritance constructor to run the onCreate method
        setContentView(R.layout.activity_main);             //sets the java to look at the xml file

        //the first thing is to connect Java Objects to your widgets
        outputLBL = findViewById(R.id.textView);
        inputTXT = findViewById(R.id.inputBox);
        enterBTN = findViewById(R.id.enterBTN);

        enterBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hello();
            }
        });

    }

    //if you want to hard code on click you need View v in the peram
    public static void hello(){
        //take in user input -> get text from the widget
        String ui = String.valueOf(inputTXT.getText());
        //output "hello person"
        outputLBL.setText("hello "+ui);
    }
}