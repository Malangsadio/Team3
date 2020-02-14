package com.example.geschool;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Notification6eme extends AppCompatActivity {

    ListView listView;
    DatabaseReference databaseReference;
    private List<User> userList;
    private CustomAdapter1 customAdapter1;
   // private Button notifier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification6eme);

        databaseReference = FirebaseDatabase.getInstance().getReference("users");

        userList = new ArrayList<>();

        customAdapter1 = new CustomAdapter1(Notification6eme.this, userList);

        listView = (ListView) findViewById(R.id.listviewNotId);
       // notifier = (Button)findViewById(R.id.notifier);

      //  notifier.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View v) {
             //   openNotifier();

          //  }

      //  });


    }
  //  public void openNotifier(){
   //     Intent intent = new Intent(this, NotifierParent.class);
       // startActivity(intent);
   // }

    protected void onStart () {
        databaseReference.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                userList.clear();
                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {

                    User user = dataSnapshot1.getValue(User.class);
                    if(user.getNiveau().equals("6eme"))
                        userList.add(user);
                }

                listView.setAdapter(customAdapter1);


            }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        super.onStart();

    }


}
