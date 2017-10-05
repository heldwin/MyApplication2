package com.example.heldwin.myapplication.activities.test;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.GridView;

import com.example.heldwin.myapplication.R;
import com.example.heldwin.myapplication.adapter.Jeux_grid_adapter;
import com.example.heldwin.myapplication.adapter.PlateauAdapter;
import com.example.heldwin.myapplication.listener.CaseClicListener;
import com.example.heldwin.myapplication.listener.MenuItemClicListener;
import com.example.heldwin.myapplication.model.Case;
import com.example.heldwin.myapplication.model.Plateau;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by heldwin on 04/10/2017.
 */

public class TestLab  extends AppCompatActivity{
    GridView gridViewPlateau;
    Plateau P;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        P=new Plateau();

        innitGridView();


    }
    private void innitGridView() {

        setContentView(R.layout.activity_test);


        PlateauAdapter adapter= new PlateauAdapter(this,R.layout.grille_plateau,P.getTabCase());
        CaseClicListener monListener = new CaseClicListener(P.getTabCase(),this);
        gridViewPlateau= (GridView)findViewById(R.id.gridViewPlateau);
        gridViewPlateau.setOnItemClickListener(monListener);
        gridViewPlateau.setAdapter(adapter);

    }
public void swipe(int posY,int posX){
    int[] pos={posX, posY};
    switch (posX){
        case 0:
            if (posY == 1 ){

            }
            else if (posY == 3 ){

            }
            else if (posY == 5){

            }
        case 6:
            if (posY == 1 ){

            }
            else if (posY == 3 ){

            }
            else if (posY == 5){

            }
    }
}

//faire bouger à l'envers case tampons prenend dernière case ce qui crée une case vide on remonte avec la case vide puis on met la case 7,0 dans la première
    public void pousser(int posX, int posY, int cas){
        Case[] tabCase = P.getTabCase();
        for (int i = 0; i<50; i++){
            if (tabCase[i].getPositionY()== posY){
                Case tampon = tabCase[i];
                tabCase[i].setPositionX() = tabCase[i].getPositionX()+1;
                tabcase[prems]=tabCase[i];
            }
        }
    }
}
