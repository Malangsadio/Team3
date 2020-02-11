package com.example.geschool;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ListeClasse extends AppCompatActivity {
    ListView listView;
    DatabaseReference databaseReference;
    private List<User> userList;
    private CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_classe);

        databaseReference = FirebaseDatabase.getInstance().getReference("users");

        userList = new ArrayList<>();

        customAdapter = new CustomAdapter(ListeClasse.this, userList);

        listView = (ListView) findViewById(R.id.listviewId);
    }
        protected void onStart () {
            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                    userList.clear();
                    for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {

                        User user = dataSnapshot1.getValue(User.class);
                        userList.add(user);
                    }
                        listView.setAdapter(customAdapter);

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
            super.onStart();

        }
    }
