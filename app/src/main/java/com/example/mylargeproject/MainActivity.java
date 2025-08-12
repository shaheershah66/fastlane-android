package com.example.mylargeproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.feature1.Feature1Class;
import com.example.feature2.Feature2Class;

public class MainActivity extends AppCompatActivity {

    Button btnScreen1, btnScreen2, btnScreen3, btnScreen4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Feature1Class f1 = new Feature1Class();
        Feature2Class f2 = new Feature2Class();

        f1.doSomething();
        f2.doSomethingElse();

        btnScreen1 = findViewById(R.id.btn_screen1);
        btnScreen2 = findViewById(R.id.btn_screen2);
        btnScreen3 = findViewById(R.id.btn_screen3);
        btnScreen4 = findViewById(R.id.btn_screen4);

        btnScreen1.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Screen1Activity.class)));
        btnScreen2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Screen2Activity.class)));
        btnScreen3.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Screen3Activity.class)));
        btnScreen4.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Screen4Activity.class)));
    }
}
