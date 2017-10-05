package com.example.heldwin.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.heldwin.myapplication.R;
import com.example.heldwin.myapplication.model.Case;
import com.example.heldwin.myapplication.model.Game;

/**
 * Created by heldwin on 04/10/2017.
 */

public class PlateauAdapter extends ArrayAdapter{
    Context ctx;
    Case[] Cases;
    int Lay;
    public PlateauAdapter(Context context,int resource,Case[] objects) {
        super(context, resource, objects);
        ctx=context;
        Cases=objects;
        Lay=resource;
    }



    public View getView(int posX, View view, ViewGroup viewGroup) {
        Case bloc = Cases[posX];
        PlateauAdapter.ViewHlderArAdapt vh;
        if (view == null) {
            view = LayoutInflater.from(ctx).inflate(Lay, null);
            ImageView img = view.findViewById(R.id.layoutImage);
            vh = new PlateauAdapter.ViewHlderArAdapt(img);
            view.setTag(vh);

        }
        else{
            vh =(PlateauAdapter.ViewHlderArAdapt) view.getTag();

        }

        vh.iv.setImageResource(bloc.getImage().getImage());

        return view;
    }
    public class ViewHlderArAdapt{
        public ImageView iv;

        public ViewHlderArAdapt(ImageView i){
            this.iv = i;
            ;
        }
    }

}