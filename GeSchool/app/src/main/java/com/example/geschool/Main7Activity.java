package com.example.geschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Main7Activity extends AppCompatActivity {
    private ListView listView3;
    private ArrayList<Six> six;
    private AdpterSix adpterSix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        listView3 = (ListView) findViewById(R.id.ListView3);
        six = new ArrayList<>();
        six.add(new Six("MATERIELS"," UNITAIRE"));
        six.add(new Six("3Cahiers 200pages","500Cfa"));
        six.add(new Six("5Cahiers 100pages","800Cfa"));
        six.add(new Six("Livres au programme","5000Cfa"));
        six.add(new Six("Stylo","100Cfa"));

        adpterSix = new AdpterSix(this, six);

        listView3.setAdapter(adpterSix);


    }
}
