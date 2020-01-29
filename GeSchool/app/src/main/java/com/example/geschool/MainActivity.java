package com.example.geschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button5);
        button2 = (Button) findViewById(R.id.button6);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInsEtFour();

            }

        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuEmplois();

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

}
