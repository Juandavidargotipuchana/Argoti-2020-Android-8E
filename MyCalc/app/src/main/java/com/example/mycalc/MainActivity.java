package com.example.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display= findViewById(R.id.tctdisplay);
    }
    public void btn9(View view){
        display.setText("9");
    }
    public void btn8(View view){
        display.setText("8");
    }
    public void btn7(View view){
        display.setText("7");
    }
    public void btn6(View view){
        display.setText("6");
    }
    public void btn5(View view){
        display.setText("5");
    }
    public void btn4(View view){
        display.setText("4");
    }
    public void btn3(View view){
        display.setText("3");
    }
    public void btn2(View view){
        display.setText("2");
    }
    public void btn1(View view){
        display.setText("1");
    }
    public void btn0(View view){
        display.setText("0");
    }
    public void btnPunto(View view){display.setText(".");}
    public void btnIgual(View view){
        display.setText("=");
    }
    public void btnDiv(View view){
        display.setText("/");
    }
    public void btnMas(View view){display.setText("+");}
    public void btnRes(View view){
        display.setText("-");
    }
    public void btnMul(View view){
        display.setText("*");
    }

    public void btnAC(View view){
        display.setText("0");
    }
}
