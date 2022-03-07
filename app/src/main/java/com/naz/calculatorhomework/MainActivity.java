package com.naz.calculatorhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display=findViewById(R.id.display);
        Button num1=findViewById(R.id.button1);
        Button num2=findViewById(R.id.button2);
        Button num3=findViewById(R.id.button3);
        Button num4=findViewById(R.id.button4);
        Button num5=findViewById(R.id.button5);
        Button num6=findViewById(R.id.button6);
        Button num7=findViewById(R.id.button7);
        Button num8=findViewById(R.id.button8);
        Button num9=findViewById(R.id.button9);
        Button num0=findViewById(R.id.button0);
        Button ADD=findViewById(R.id.buttonADD);
        Button SUB=findViewById(R.id.buttonSUB);
        Button MUL=findViewById(R.id.buttonMUL);
        Button DIV=findViewById(R.id.buttonDIV);
        Button DOT=findViewById(R.id.buttonDOT);
    }
}