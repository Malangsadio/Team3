package com.example.geschool;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

class CustomAdapter1 extends ArrayAdapter<User> {

    private Activity context;
    private List<User> userList;


    public CustomAdapter1(Activity context, List<User> userList) {
        super(context, R.layout.sample_layout1, userList);
        this.context = context;
        this.userList = userList;

    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.sample_layout1, null, true);


        final User user = userList.get(position);

        TextView nom = view.findViewById(R.id.nom);
        TextView prenom = view.findViewById(R.id.prenom);
        TextView phone = view.findViewById(R.id.phone);
        Button notifier = view.findViewById(R.id.notifier);


        nom.setText("Nom :" + user.getNom());
        prenom.setText("Prenom :" + user.getPrenom());
        phone.setText("Numéro tuteur :" + user.getPhone());

       // notifier.setOnClickListener(new View.OnClickListener() {
       //     @Override
        //    public void onClick(View v) {
                //Intent intent = new Intent(context, NotifierParent.class);
          //      String Var = user.getPhone();

         //   }
      //  });

        return view;
    }

}