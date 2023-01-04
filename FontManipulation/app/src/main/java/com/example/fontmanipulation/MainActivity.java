package com.example.fontmanipulation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPlus = findViewById(R.id.btnPlus);
        Button btnMinus = findViewById(R.id.btnMinus);
        TextView txt = findViewById(R.id.textView);
        final int[] y = {(int) txt.getTextSize()};
        txt.setText("current text size = " + y[0]);
        

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setTextSize(y[0]++);
                txt.setText("current text size = " + y[0]); 
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setTextSize(y[0]--);
                txt.setText("current text size = " + y[0]);
            }
        });
    }
}