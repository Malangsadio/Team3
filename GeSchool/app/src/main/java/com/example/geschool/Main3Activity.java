package com.example.geschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button3 =(Button) findViewById(R.id.button3);
        button4 =(Button) findViewById(R.id.button4);
        button5 =(Button) findViewById(R.id.button5);
        button6 =(Button) findViewById(R.id.button6);

        button3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                openActivity4();
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                openActivity5();
            }
        });

        button5.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                openActivity6();
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                openActivity7();
            }
        });

    }
    public void openActivity4(){
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }

    public void openActivity5(){
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }

    public void openActivity6(){
        Intent intent = new Intent(this, Main6Activity.class);
        startActivity(intent);
    }

    public void openActivity7(){
        Intent intent = new Intent(this, Main7Activity.class);
        startActivity(intent);
    }

}


