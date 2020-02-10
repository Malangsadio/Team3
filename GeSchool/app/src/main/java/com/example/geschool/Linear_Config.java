package com.example.geschool;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import static android.view.LayoutInflater.from;

public class Linear_Config {
    private Context mContext;

    class UserItemView extends LinearLayout{
        private TextView nom;
        private TextView prenom;
        private TextView adresse;
        private TextView niveau;
        private TextView phone;

        private String key;

        public UserItemView(ViewGroup parent){
            super();
            //super(LayoutInflater.from(mContext).
              //      inflate(R.layout.user_list_item, parent, false));
            nom = (TextView)findViewById(R.id.nom);
            prenom = (TextView) findViewById(R.id.prenom);
            adresse = (TextView) findViewById(R.id.adresse);
            niveau = (TextView) findViewById(R.id.niveau);
            phone = (TextView) findViewById(R.id.phone);
        }
    }
}
