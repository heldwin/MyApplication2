package com.example.heldwin.myapplication.model;

import com.example.heldwin.myapplication.R;

/**
 * Created by unkls on 04/10/2017.
 */

public class Plateau {
    private Case[] tabCase = new Case[50];

    public Plateau(){
        Case bloc;
        int posX =0;
        int posY =0;

        Pion[] tabPion = {new Pion(1, new Img(1)), new Pion(2, new Img(1))};
        Img image =new Img(R.drawable.fond);
        Img image2 =new Img(R.drawable.p4);
        for(int i  = 0; i < tabCase.length; i++){

            if(posX==7) {
                posX = 0;
                posY++;
            }
            if (posY%2==0){
                bloc = new Case(tabPion, null, 1, image, posY, posX);

            }else
            {
                bloc = new Case(tabPion, null, 1, image2, posY, posX);

            }
            posX++;
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
