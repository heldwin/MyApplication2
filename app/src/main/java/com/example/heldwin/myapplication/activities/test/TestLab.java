package com.example.heldwin.myapplication.activities.test;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import com.example.heldwin.myapplication.R;
import com.example.heldwin.myapplication.adapter.Jeux_grid_adapter;
import com.example.heldwin.myapplication.adapter.PlateauAdapter;
import com.example.heldwin.myapplication.listener.CaseClicListener;
import com.example.heldwin.myapplication.listener.MenuItemClicListener;
import com.example.heldwin.myapplication.model.Case;
import com.example.heldwin.myapplication.model.Img;
import com.example.heldwin.myapplication.model.Pion;
import com.example.heldwin.myapplication.model.Plateau;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by heldwin on 04/10/2017.
 */

public class TestLab  extends AppCompatActivity{
    GridView gridViewPlateau;
    Plateau P;
    PlateauAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        P=new Plateau();

        innitGridView();


    }
    private void innitGridView() {

        setContentView(R.layout.activity_test);
        adapter= new PlateauAdapter(this,R.layout.grille_plateau,P.getTabCase());
        CaseClicListener monListener = new CaseClicListener(P.getTabCase(),this);
        gridViewPlateau= (GridView)findViewById(R.id.gridViewPlateau);
        gridViewPlateau.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Case j= (Case) adapterView.getAdapter().getItem(i);
                Toast.makeText(view.getContext(),j.getPositionX()+" "+j.getPositionY()+ "avec l'image " +j.getImage().getImage(), Toast.LENGTH_SHORT).show();
                //swipe(j.getPositionX(), j.getPositionY());
            }
        });
        Button btn1 = (Button) findViewById(R.id.btn1);
        gridViewPlateau.setAdapter(adapter);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Case[] tabCase = P.getTabCase();
                List<Integer> list = new ArrayList<Integer>(); // creer une liste de case à bouger
                Case cs = tabCase[44];
                for (int i = 0; i<50; i++) { // on les cherches toutes
                    if (tabCase[i].getPositionY() == 1) {
                        list.add(i); // on list les position à changer
                    }
                }
                Case tampon = null;
                Case tmp=null;
                tampon = tabCase[list.get(list.size()-1)]; // on met la derniere case dans le tampon
                int i = list.size()-1; // on prend la derière valeur de la list
                int p = list.size()-2; // on prend l'avant dernière valeur de la list

                while(p>=0){ //pour pas aller trop loin et taper hors du tableau
                    Log.e("DEBUG","P à pour valeur "+list.get(p)+" et i a pour valeur "+ list.get(i));
                    tabCase[list.get(i)]=tabCase[list.get(p)]; // on met la case -1 dans la case -2 (comme expliquer à l'oral)
                    i--;
                    p--;
                }
                tabCase[1]=tabCase[49]; // à faire à la main
                tabCase[49]=tampon; // change la case 49 pour la prochaine ligne à pousser
                adapter.notifyDataSetChanged(); // sert à rafraichir le gridView
                gridViewPlateau.setAdapter(adapter);// le rafraichis ici
            }
        });
    }

    public void swipe(int posY,int posX){
        switch (posY){
            case 0:
                if (posX == 1 ){
                    pousser(0,1,1);
                }
                else if (posX == 3 ){


                }
                else if (posX == 5){


                }
            case 6:
                if (posX == 1 ){

                }
                else if (posX == 3 ){

                }
                else if (posX == 5){

                }
        }
    }

//faire bouger à l'envers case tampons prenend dernière case ce qui crée une case vide on remonte avec la case vide puis on met la case 7,0 dans la première
    public void pousser(int posX, int posY, int cas){

        Case[] tabCase = P.getTabCase(); //getTabCase
        List<Integer> list = new ArrayList<Integer>(); // creer une liste de case à bouger
        for (int i = 0; i<50; i++) { // on les cherches toutes
            if (tabCase[i].getPositionY() == posY) {
                list.add(i); // on list les position à changer
            }
        }
        Case tampon = null;
        Case tmp=null;
        tabCase[list.get(list.size()-1)]=tampon; // on met la derniere case dans le tampon
        tabCase[list.get(list.size()-1)]=null;

        for (int i=1; i<list.size();i++){

            tabCase[list.get(list.size()-(i))].setPositionY(tabCase[list.get(list.size()-(1+i))].getPositionY());
            tabCase[list.get(list.size()-(i))].setPositionX(tabCase[list.get(list.size()-(1+i))].getPositionX());
            tabCase[list.get(list.size()-(i))] = tabCase[list.get(list.size()-(1+i))] ; // la case -2 va dans la -1
        }

        tabCase[list.get(0)] = tabCase[50]; // on met la premiere avec la case qui va etre glisser
        tabCase[50]= tampon;//on met le tampon dans la prochaine case à bouger
        adapter.notifyDataSetChanged();
        gridViewPlateau.setAdapter(adapter);

    }
}
