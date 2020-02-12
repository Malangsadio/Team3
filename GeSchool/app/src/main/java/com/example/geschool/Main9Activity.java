package com.example.geschool;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    EditText nom, prenom, adresse, niveau, phone;
    Button insert,lister;
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
        phone = (EditText) findViewById(R.id.phone);
        insert = (Button) findViewById(R.id.btnInsert);
        lister = (Button) findViewById(R.id.btnLister);

        lister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListerClasse();

            }

        });


        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUser();
            }
        });
    }

    private void addUser() {

        String nome = nom.getText().toString();
        String prenome = prenom.getText().toString();
        String adressee = adresse.getText().toString();
        String niveaux = niveau.getText().toString();
        String phonee = phone.getText().toString().trim();


        if (!TextUtils.isEmpty(nome)&&!TextUtils.isEmpty(prenome)) {
            String id = ref.push().getKey();
            User user = new User(nome, prenome, adressee, niveaux,phonee);
            ref.child(id).setValue(user);
            Toast.makeText(Main9Activity.this, "Data inserted....", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(Main9Activity.this, "veuillez saisir les données", Toast.LENGTH_LONG).show();
        }
    }
    public void openListerClasse(){
        Intent intent = new Intent(this, ListerLesClasses.class);
        startActivity(intent);
    }


}