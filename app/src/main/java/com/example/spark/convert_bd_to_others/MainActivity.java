package com.example.spark.convert_bd_to_others;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 Button btnUSD,btnEURO,btnRUPEE,btnpound;
    TextView inputtext,resulttext;
    Double input,output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnUSD=(Button) findViewById(R.id.btnUSD);
        btnEURO=(Button) findViewById(R.id.btnEURO);
        btnRUPEE=(Button) findViewById(R.id.btnRUPEE);
        btnpound=(Button) findViewById(R.id.btnpound);
        inputtext=(TextView) findViewById(R.id.inputtv);
        resulttext=(TextView) findViewById(R.id.resulttv);

        btnUSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input=Double.parseDouble(inputtext.getText().toString());
                output=input/83.08;
                resulttext.setText(String.valueOf(String.format("%.3f", output)));
            }
        });
        btnEURO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input=Double.parseDouble(inputtext.getText().toString());
                output=input/96.49;
                resulttext.setText(String.valueOf(String.format("%.3f", output)));
            }
        });
        btnRUPEE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input=Double.parseDouble(inputtext.getText().toString());
                output=input/1.28;
                resulttext.setText(String.valueOf(String.format("%.3f", output)));
            }
        });
      btnpound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input=Double.parseDouble(inputtext.getText().toString());
                output=input/109.17;
                resulttext.setText(String.valueOf(String.format("%.3f", output)));
            }
        });
    }
}
