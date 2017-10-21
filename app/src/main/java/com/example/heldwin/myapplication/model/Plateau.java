package com.example.heldwin.myapplication.model;

import android.util.Log;

import com.example.heldwin.myapplication.R;

import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import android.util.Log;
/**
 * Created by unkls on 04/10/2017.
 */

public class Plateau {
    private Case[] tabCase = new Case[50];

    public Plateau() {
        Case bloc;
        int posX = 0;
        int posY = 0;

        String controleType = "";
// création liste type
        List type = new ArrayList();
        // ajoute 19 type 1(case en L)
        for (int i = 0; i < 19; i++) {
            type.add(1);
        }
        // ajoute 18 type 2(case en T)
        for (int i = 0; i < 18; i++) {
            type.add(2);
        }
        // ajoute 13 type 3(case en I)
        for (int i = 0; i < 13; i++) {
            type.add(3);
        }
// mélange la liste de type
        Collections.shuffle(type);


        Pion[] tabPion = {new Pion(1, new Img(1)), new Pion(2, new Img(1))};
        Img image2 = new Img(R.drawable.p4);
        for (int i = 0; i < tabCase.length; i++) {
            Random r = new Random();
            int rota = r.nextInt(4);
            if (posX == 7) {
                posX = 0;
                posY++;
            }

            bloc = new Case(tabPion, null,(int) type.get(i), image2, posY, posX,rota,false,false,false,false);


            posX++;

            switch (bloc.getType()) {
                case 1:
                    controleType="Case de type L | ";
                    break;
                case 2:
                    controleType="Case de type T | ";
                    break;
                case 3:
                    controleType="Case de type I | ";
                    break;}


Log.e("checkBool",controleType + "avec " + bloc.getRotation()+ " rotation |"+bloc.getMvtH().toString()+" "+ bloc.getMvtD().toString()+" "+bloc.getMvtB().toString()+" "+bloc.getMvtG().toString());
            tabCase[i] = bloc;
        }

    }

    public Case[] getTabCase() {
        return tabCase;
    }

    public void setTabCase(Case[] tabCase) {
        this.tabCase = tabCase;
    }
}
