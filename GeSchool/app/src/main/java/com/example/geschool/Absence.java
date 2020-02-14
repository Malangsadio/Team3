package com.example.geschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Absence extends AppCompatActivity {

    private Button absence6;
    private Button absence5;
    private Button absence4;
    private Button absence3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absence);

        absence6 = (Button) findViewById(R.id.absence6);
        absence5 = (Button) findViewById(R.id.absence5);
        absence4 = (Button) findViewById(R.id.absence4);
        absence3 = (Button) findViewById(R.id.absence3);


        absence6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbsence6eme();

            }

        });
        absence5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbsence5eme();

            }

        });
        absence4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbsence4eme();

            }

        });
        absence3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbsence3eme();

            }

        });

    }

    public void openAbsence6eme(){
        Intent intent = new Intent(this, Notification6eme.class);
        startActivity(intent);
    }
    public void openAbsence5eme(){
        Intent intent = new Intent(this, Notes5eme.class);
        startActivity(intent);
    }
    public void openAbsence4eme(){
        Intent intent = new Intent(this, Notes4eme.class);
        startActivity(intent);
    }
    public void openAbsence3eme(){
        Intent intent = new Intent(this, Notes3eme.class);
        startActivity(intent);

    }
}
