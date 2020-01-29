package com.example.geschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuEmploiduTemps extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_emploidu_temps);

        button = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSixieme();

            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCinquieme();

            }

        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuatrieme();

            }

        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTroisieme();

            }

        });

    }
    public void openSixieme(){
        Intent intent = new Intent(this, sixieme.class);
        startActivity(intent);
    }
    public void openCinquieme(){
        Intent intent = new Intent(this, Cinquieme.class);
        startActivity(intent);
    }
    public void openQuatrieme(){
        Intent intent = new Intent(this, Quatrieme.class);
        startActivity(intent);
    }
    public void openTroisieme(){
        Intent intent = new Intent(this, Troisieme.class);
        startActivity(intent);
    }


}
