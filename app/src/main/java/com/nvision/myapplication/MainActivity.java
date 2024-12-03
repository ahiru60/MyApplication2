package com.nvision.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nvision.textinputattacher.TextInputAttacher;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextInputAttacher textInputAttacher = new TextInputAttacher();
        textInputAttacher.attach(this,"hi");
    }
}