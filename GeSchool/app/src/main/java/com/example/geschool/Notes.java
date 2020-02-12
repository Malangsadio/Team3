package com.example.geschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Notes extends AppCompatActivity {
    private Button notes6;
    private Button notes5;
    private Button notes4;
    private Button notes3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        notes6 = (Button) findViewById(R.id.notes6);
        notes5 = (Button) findViewById(R.id.notes5);
        notes4 = (Button) findViewById(R.id.notes4);
        notes3 = (Button) findViewById(R.id.notes3);

        notes6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNotes6eme();

            }

        });
        notes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNotes5eme();

            }

        });
        notes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNotes4eme();

            }

        });
        notes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNotes3eme();

            }

        });

    }

    public void openNotes6eme(){
        Intent intent = new Intent(this, Notes6eme.class);
        startActivity(intent);
    }
    public void openNotes5eme(){
        Intent intent = new Intent(this, Notes5eme.class);
        startActivity(intent);
    }
    public void openNotes4eme(){
        Intent intent = new Intent(this, Notes4eme.class);
        startActivity(intent);
    }
    public void openNotes3eme(){
        Intent intent = new Intent(this, Notes3eme.class);
        startActivity(intent);
    }
}
