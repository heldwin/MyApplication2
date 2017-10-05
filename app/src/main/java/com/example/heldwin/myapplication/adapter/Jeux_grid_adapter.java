package com.example.heldwin.myapplication.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import android.widget.TextView;


import com.example.heldwin.myapplication.R;
import com.example.heldwin.myapplication.model.Game;

/**
 * Created by heldwin on 02/10/2017.
 */

public class Jeux_grid_adapter extends ArrayAdapter<Game>{
    Context ctx;
    Game[] Jeux;
    int Lay;
    public Jeux_grid_adapter(Context context,int resource,Game[] objects) {
        super(context, resource, objects);
        ctx=context;
        Jeux=objects;
        Lay=resource;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Game jeu = getItem(position);
        ViewHlderArAdapt vh;
        if (view == null) {
            view = LayoutInflater.from(ctx).inflate(Lay, null);
            ImageView img = view.findViewById(R.id.layoutImage);
            TextView txt = view.findViewById(R.id.layoutLabel);
            vh = new ViewHlderArAdapt(txt,img);
            view.setTag(vh);

        }
        else{
            vh =(ViewHlderArAdapt) view.getTag();

        }
        vh.tv.setText(jeu.getNom());
        vh.iv.setImageResource(jeu.getimage());

        return view;
    }
public class ViewHlderArAdapt{
    public TextView tv;
    public ImageView iv;

    public ViewHlderArAdapt(TextView t, ImageView i){
        this.iv = i;
        this.tv = t;

    }
}
}
