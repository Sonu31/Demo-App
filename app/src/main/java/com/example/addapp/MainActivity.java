package com.example.addapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.view.View;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView tvresult;
 EditText  Num1,Num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvresult = findViewById(R.id.tvresult);
        Num1=findViewById(R.id.Num1);
        Num2=findViewById(R.id.Num2);



    }

    public void addnumber(View v){
        double n1,n2,result;
        n1= Double.parseDouble(Num1.getText().toString());
        n2= Double.parseDouble(Num2.getText().toString());
        result = n1+n2;

        tvresult.setText(String.valueOf(result));



    }

}