package com.example.sayan.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convert(View view){

        EditText dollarField = (EditText)findViewById(R.id.dollarField);
        Double dollar = Double.parseDouble(dollarField.getText().toString());

        Double x = dollar * 68.13;

        Toast.makeText(getApplicationContext(),"Rupees "+x.toString(),Toast.LENGTH_LONG).show();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
