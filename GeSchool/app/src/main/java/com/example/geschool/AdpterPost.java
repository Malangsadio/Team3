package com.example.geschool;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdpterPost extends ArrayAdapter<Post> {
    /**
     * Constructor
     *
     * @param context  The current context.
     * @param resource The resource ID for a layout file containing a TextView to use when
     *                 instantiating views.
     * @param objects  The objects to represent in the ListView.
     */
    public AdpterPost(@NonNull Context context, @NonNull List<Post> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.post_row, parent, false);
        }

        TextView classe =(TextView) convertView.findViewById(R.id.TV_classe);
        TextView prix =(TextView) convertView.findViewById(R.id.TV_prix);

        Post p = getItem(position);

        classe.setText(p.getClasse());
        prix.setText(p.getPrix());


        return convertView;
    }
}
