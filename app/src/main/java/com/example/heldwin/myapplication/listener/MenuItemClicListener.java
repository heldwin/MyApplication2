package com.example.heldwin.myapplication.listener;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import com.example.heldwin.myapplication.activities.games.BatnavActivity;
import com.example.heldwin.myapplication.model.Game;

import static android.R.attr.start;


/**
 * Created by heldwin on 03/10/2017.
 */

public class MenuItemClicListener implements AdapterView.OnItemClickListener{
Game[] jeux;
Activity activite;

public  MenuItemClicListener(Game[] g, Activity act){
    this.jeux=g;
    this.activite=act;
}
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
       Game j= (Game)adapterView.getAdapter().getItem(i);
        Intent intent = new Intent(view.getContext(), BatnavActivity.class);
        Toast.makeText(view.getContext(),j.getNom(), Toast.LENGTH_SHORT).show();
        view.getContext().startActivity(j.getMonIntent());

    }



}
