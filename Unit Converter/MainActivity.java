package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText numb;
    private Button btncm;
    private  Button btnkm;
    private  Button btnmm;
    private Button btndm;
    private TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numb = (EditText) findViewById(R.id.editnum);
        btncm = (Button) findViewById(R.id.btncm);
        btnkm = (Button) findViewById(R.id.btnkm);
        btnmm = (Button) findViewById(R.id.btnmm);
        btndm = (Button) findViewById(R.id.btndm);
        txtresult= (TextView) findViewById(R.id.result);
        // Addition
        btncm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((numb.getText().length()>0))
                {
                    double num = Double.parseDouble(numb.getText().toString());
                    double result = num*100;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        //Subtraction
        btnkm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((numb.getText().length()>0))
                {
                    double num = Double.parseDouble(numb.getText().toString());
                    double result = num/1000 ;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });
        // Multiplication
        btnmm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((numb.getText().length()>0))
                {
                    double num = Double.parseDouble(numb.getText().toString());
                    double result = num*1000 ;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        // Division
        btndm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((numb.getText().length()>0))
                {
                    double num = Double.parseDouble(numb.getText().toString());
                    double result = num*10 ;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}
