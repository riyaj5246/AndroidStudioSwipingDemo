package com.example.test_app_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Button;
import android.view.GestureDetector;
import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class MainActivity extends AppCompatActivity {
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //hi
    float x1, x2, y1, y2;
    public boolean onTouchEvent(MotionEvent touchEvent){
        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if(x1 < x2){
                    setContentView(R.layout.right_file);
                }
                else if(x1 > x2){
                    setContentView(R.layout.left_screen);
                }
            break;
        }
        return false;
    }

    public void sendMessage(View view) {
        CheckBox mainBox = (CheckBox) findViewById(R.id.checkBox1);
        if(mainBox.isChecked()){
            counter++;
        }
        changeText(counter + "");
    }

    private void changeText(String x){
        TextView newtext2 = (TextView) findViewById(R.id.textview1);
        newtext2.setText(x);
    }
}