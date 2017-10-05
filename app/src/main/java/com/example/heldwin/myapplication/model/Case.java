package com.example.heldwin.myapplication.model;

import android.media.Image;

/**
 * Created by unkls on 04/10/2017.
 */

public class Case {
    private Pion[] tabPion;
    private Tresor tresor;
    private int type;
    private Img image;
    private int positionX;
    private int positionY;



    public Case(Pion[] tabPion, Tresor tresor, int type, Img image, int positionX, int positionY){
        this.tabPion = tabPion;
        this.tresor = tresor;
        this.type = type;
        this.image = image;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public Img getImage() {
        return image;
    }
    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setImage(Img image) {
        this.image = image;
    }
}
