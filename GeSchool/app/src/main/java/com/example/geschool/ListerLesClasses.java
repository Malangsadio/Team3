package com.example.geschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListerLesClasses extends AppCompatActivity {
    private Button liste6;
    private Button liste5;
    private Button liste4;
    private Button liste3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lister_les_classes);

        liste6 = (Button) findViewById(R.id.liste6);
        liste5 = (Button) findViewById(R.id.liste5);
        liste4 = (Button) findViewById(R.id.liste4);
        liste3 = (Button) findViewById(R.id.liste3);


        liste6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSixieme();

            }

        });
        liste5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCinquieme();

            }

        });
        liste4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuatrieme();

            }

        });
        liste3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTroisieme();

            }

        });

    }
    public void openSixieme(){
        Intent intent = new Intent(this, ListeClasse.class);
        startActivity(intent);
    }
    public void openCinquieme(){
        Intent intent = new Intent(this, ListeClasse5.class);
        startActivity(intent);
    }
    public void openQuatrieme(){
        Intent intent = new Intent(this, ListeClasse4.class);
        startActivity(intent);
    }
    public void openTroisieme(){
        Intent intent = new Intent(this, ListeClasse3.class);
        startActivity(intent);
    }
}
