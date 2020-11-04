package com.example.intentexample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnclick=findViewById(R.id.btn_click);
        Button btngoogle=findViewById(R.id.btn_google);
        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Click Me", Toast.LENGTH_SHORT).show();
            }
        });


        btngoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Click Me", Toast.LENGTH_SHORT).show();
            }
        });

    }
}