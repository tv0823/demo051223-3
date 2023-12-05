package com.example.demo051223_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int clicked = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void numberClicked(View view) {
        btn = findViewById(R.id.btn);
        clicked ++;
        if (clicked != 6)
            btn.setText("This is a click number: " + clicked);
        else{
            btn.setText("Enough to click. Go to new start!");
            clicked = 0;
        }
    }
}