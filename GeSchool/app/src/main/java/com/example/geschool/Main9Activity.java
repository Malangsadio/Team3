package com.example.geschool;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Main9Activity extends AppCompatActivity {
    EditText nom, prenom, adresse, niveau;
    Button insert;
    DatabaseReference ref;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        ref = FirebaseDatabase.getInstance().getReference("users");

        nom = (EditText) findViewById(R.id.nom);
        prenom = (EditText) findViewById(R.id.prenom);
        adresse = (EditText) findViewById(R.id.adresse);
        niveau = (EditText) findViewById(R.id.niveau);


        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUser();
            }
        });
    }

    private void addUser() {

        String nome = nom.getText().toString().trim();
        String prenome = prenom.getText().toString().trim();
        String adressee = adresse.getText().toString().trim();
        String niveaux = niveau.getText().toString().trim();


        if (!TextUtils.isEmpty(nome)) {
            String id = ref.push().getKey();
            User user = new User(id, nome, prenome, adressee, niveaux);
            ref.child(id).setValue(user);
            Toast.makeText(Main9Activity.this, "Data inserted....", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(Main9Activity.this, "veuillez saisir les données", Toast.LENGTH_LONG).show();
        }
    }

}