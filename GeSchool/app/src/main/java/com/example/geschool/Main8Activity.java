package com.example.geschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main8Activity extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        button1 =(Button) findViewById(R.id.button1);
        button2 =(Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                openActivity2();
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                openActivity3();
            }
        });

    }
    public void openActivity2(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }



}
