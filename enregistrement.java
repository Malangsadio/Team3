package com.example.geschool;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class enregistrement extends AppCompatActivity {

    DatabaseReference fb;
    EditText t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enregistrement);
        Button button = (Button) findViewById(R.id.enregistrer);
        t=(EditText)findViewById(R.id.editText3);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fb= FirebaseDatabase.getInstance().getReference("Nom");
                fb.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        HashMap<String,Object> map = new HashMap<>();
                        map.put("id",fb.getKey());
                        map.put("nom",t.getText().toString());
                        String val=fb.push().getKey();
                        //final Object nom = map.put("prenom", t.getText().toString());
                        fb.setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful())
                                    Toast.makeText(enregistrement.this, "reussi", Toast.LENGTH_SHORT).show();
                                else Toast.makeText(enregistrement.this, "echec", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
    }
}
