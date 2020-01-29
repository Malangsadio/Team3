package com.example.geschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private ListView listViewIns;
    private ArrayList<Post> posts;
    private AdpterPost adpterPost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listViewIns = (ListView) findViewById(R.id.ListViewIns);
        posts = new ArrayList<>();
        posts.add(new Post("CLASSE","MONTANT"));
        posts.add(new Post("6éme","5000Cfa"));
        posts.add(new Post("5éme","7000Cfa"));
        posts.add(new Post("4éme","8000Cfa"));
        posts.add(new Post("3éme","10000Cfa"));

        adpterPost = new AdpterPost(this, posts);

        listViewIns.setAdapter(adpterPost);
    }

}
