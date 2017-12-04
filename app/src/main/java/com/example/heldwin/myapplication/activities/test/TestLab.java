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
                swipe(j.getPositionX(), j.getPositionY());
            }
        });
        Button btn1 = (Button) findViewById(R.id.btn1);
        gridViewPlateau.setAdapter(adapter);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    public void swipe(int posY,int posX){
        switch (posY){
            case 0:
                if (posX == 1 ){
                    pousserY(1);
                }
                else if (posX == 3 ){
                    pousserY(3);

                }
                else if (posX == 5){
                    pousserY(5);

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
    public void pousserY(int Y){

        final Case[] tabCase = P.getTabCase();
        List<Integer> list = new ArrayList<Integer>(); // creer une liste de case à bouger
        Case cs = tabCase[44];
        for (int i = 0; i<50; i++) { // on les cherches toutes
            if (tabCase[i].getPositionY() == Y) {
                list.add(i); // on list les position à changer
            }
        }
        Case tampon = null;
        tampon = tabCase[list.get(list.size()-1)]; // on met la derniere case dans le tampon
        int i = list.size()-1; // on prend la derière valeur de la list
        int p = list.size()-2; // on prend l'avant dernière valeur de la list

        while(p>=0){ //pour pas aller trop loin et taper hors du tableau
            Log.e("DEBUG","P à pour valeur "+list.get(p)+" et i a pour valeur "+ list.get(i));
            tabCase[list.get(i)]=tabCase[list.get(p)]; // on met la case -1 dans la case -2 (comme expliquer à l'oral)
            tabCase[list.get(i)].setPositionX(i);
            i--;
            p--;
            Log.e("DEBUG"," i à pour X " +tabCase[list.get(i)].getPositionX());

        }
        tabCase[list.get(i)]=tabCase[49]; // à faire à la main
        tabCase[list.get(i)].setPositionY(Y);
        tabCase[list.get(i)].setPositionX(0);

        tabCase[49]=tampon; // change la case 49 pour la prochaine ligne à pousser
        tabCase[49].setPositionX(7);
        tabCase[49].setPositionY(0);
        adapter.notifyDataSetChanged(); // sert à rafraichir le gridView
        gridViewPlateau.setAdapter(adapter);// le rafraichis ici
    }

    public void pousserYBas(int Y){
        final Case[] tabCase = P.getTabCase();
        List<Integer> list = new ArrayList<Integer>(); // creer une liste de case à bouger
        Case cs = tabCase[44];
        for (int i = 0; i<50; i++) { // on les cherches toutes
            if (tabCase[i].getPositionY() == Y) {
                list.add(i); // on list les position à changer
            }
        }
        Case tampon = null;
        tampon = tabCase[list.get(list.size()-1)]; // on met la derniere case dans le tampon

    }
}
