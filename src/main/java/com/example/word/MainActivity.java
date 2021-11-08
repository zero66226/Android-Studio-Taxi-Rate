package com.example.word;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    EditText c;
    EditText b;

    private static final String TAG = MainActivity.class.getSimpleName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c = (EditText) findViewById(R.id.ed0);
        b = (EditText) findViewById(R.id.ed);




    }


    public void sA(View arg0) {

        float fb = Float.parseFloat(b.getEditableText().toString());
        float fc = Float.parseFloat(c.getEditableText().toString());
        TextView result = (TextView) findViewById(R.id.tv4);

        NumberFormat nf = NumberFormat.getInstance();

        if (fc<250) {

            result.setText(nf.format(5 + fb) + "");
        }

        if (fc/250 > 0) {
            result.setText(Math.floor(fc/250) *5 +fb  + "");
        }
        }


    }
