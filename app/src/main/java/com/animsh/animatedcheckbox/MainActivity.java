package com.animsh.animatedcheckbox;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    AnimatedCheckBox animatedCheckBox1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
//        animatedCheckBox1 = findViewById(R.id.animatedCheckBox1);
//        animatedCheckBox1.setmTickStrokeWidth(10);
//        animatedCheckBox1.setmBorderStrokeWidth(10);
    }
}