package com.jarvanh.setmobiledataenabled_sample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.jarvanh.library.SetMobileDataEnabled;

public class MainActivity extends AppCompatActivity {

    Button mButton;
    Button mButton1;
    Button mButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.btn);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SetMobileDataEnabled().enabled(true);
                Toast.makeText(MainActivity.this, "Mobile Data enabled", Toast.LENGTH_LONG).show();
            }
        });

        mButton1 = (Button) findViewById(R.id.btn1);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SetMobileDataEnabled().enabled(false);
                Toast.makeText(MainActivity.this, "Mobile Data Disabled", Toast.LENGTH_LONG).show();
            }
        });

        mButton2 = (Button) findViewById(R.id.btn2);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (new SetMobileDataEnabled().isRoot()) {
                    Toast.makeText(MainActivity.this, "Already root", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "No root", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
