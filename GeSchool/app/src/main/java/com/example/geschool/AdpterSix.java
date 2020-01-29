package com.example.geschool;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AdpterSix extends ArrayAdapter<Six> {
    /**
     * Constructor
     *
     * @param context  The current context.
     * @param resource The resource ID for a layout file containing a TextView to use when
     *                 instantiating views.
     * @param objects  The objects to represent in the ListView.
     */
    public AdpterSix(@NonNull Context context, @NonNull List<Six> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.post_row, parent, false);
        }

        TextView materiels =(TextView) convertView.findViewById(R.id.TV_classe);
        TextView price =(TextView) convertView.findViewById(R.id.TV_prix);

        Six s = getItem(position);

        materiels.setText(s.getMateriels());
        price.setText(s.getprice());
        
        return convertView;
    }
}
