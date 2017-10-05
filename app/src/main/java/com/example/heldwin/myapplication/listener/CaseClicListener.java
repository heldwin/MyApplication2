package com.example.heldwin.myapplication.listener;


import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import com.example.heldwin.myapplication.model.Case;


import static android.R.attr.start;


/**
 * Created by heldwin on 03/10/2017.
 */

public class CaseClicListener implements AdapterView.OnItemClickListener{
    Case[] cases;
    Activity activite;

    public  CaseClicListener(Case[] g, Activity act){
        this.cases=g;
        this.activite=act;
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Case j= (Case) adapterView.getAdapter().getItem(i);
        Toast.makeText(view.getContext(),j.getPositionX()+" "+j.getPositionY(), Toast.LENGTH_SHORT).show();


    }



}