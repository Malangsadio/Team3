package com.example.geschool;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapter  extends ArrayAdapter<User> {

    private Activity context;
    private List<User> userList;


    public CustomAdapter(Activity context, List<User> userList) {
        super(context,R.layout.sample_layout, userList);
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.sample_layout, null, true);

        User user = userList.get(position);

        TextView nom = view.findViewById(R.id.nom);
        TextView prenom = view.findViewById(R.id.prenom);
        TextView adresse = view.findViewById(R.id.adresse);
        TextView niveau = view.findViewById(R.id.niveau);
        TextView phone = view.findViewById(R.id.phone);

        nom.setText( "Nom :"+user.getNom());
        prenom.setText("Prenom :"+user.getPrenom());
        adresse.setText("Adresse :"+user.getAdresse());
        niveau.setText("Niveau :"+user.getNiveau());
        phone.setText("Phone :"+user.getPhone());

        return view;
    }
}

