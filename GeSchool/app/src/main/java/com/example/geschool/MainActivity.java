package com.example.geschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button emp_tps;
    private Button fou_ins;
    private Button inserer;
    private Button notes;
    private Button absence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "firebase connexion success", Toast.LENGTH_SHORT).show();
        emp_tps = (Button) findViewById(R.id.button5);
        fou_ins = (Button) findViewById(R.id.button6);
        inserer = (Button) findViewById(R.id.button7);
        notes =(Button) findViewById(R.id.note);
        absence = (Button) findViewById(R.id.absence);

        fou_ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsEtFour();

            }

        });

        emp_tps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuEmplois();

            }

        });

        inserer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsertion();

            }

        });

        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNotes();

            }

        });

        absence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbsence();

            }

        });


    }
    public void openInsEtFour(){
        Intent intent = new Intent(this, Main8Activity.class);
        startActivity(intent);
    }

    public void openMenuEmplois(){
        Intent intent = new Intent(this, MenuEmploiduTemps.class);
        startActivity(intent);
    }

    public void openInsertion(){
        Intent intent = new Intent(this, Main9Activity.class);
        startActivity(intent);
    }

    public void openNotes(){
        Intent intent = new Intent(this, Notes.class);
        startActivity(intent);
    }

    public void openAbsence(){
        Intent intent = new Intent(this, Absence.class);
        startActivity(intent);
    }

}
