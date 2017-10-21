package com.example.heldwin.myapplication.model;

import android.media.Image;

import com.example.heldwin.myapplication.R;

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
    private int rotation;
    private Boolean mvtH;
    private Boolean mvtD;
    private Boolean mvtB;
    private Boolean mvtG;

    public Case(Pion[] tabPion, Tresor tresor, int type, Img image , int positionX, int positionY, int rotation, Boolean mvtH, Boolean mvtD, Boolean mvtB,Boolean mvtG){

        this.tabPion = tabPion;
        this.tresor = tresor;
        this.type = type;
        this.image = image;
        this.positionX = positionX;
        this.positionY = positionY;
        this.rotation = rotation;
        this.mvtH = mvtH;
        this.mvtD = mvtD;
        this.mvtB = mvtB;
        this.mvtG = mvtG;


        //attribu les boolean pour les différentes rotations du type 1 (L)
        if (this.type == 1) {
            switch (this.rotation) {
                case 0:
                    this.mvtH = false;
                    this.mvtD = true;
                    this.mvtB = true;
                    this.mvtG = false;
                    this.image = new Img(R.drawable.l_0);
                    break;
                case 1:
                    this.mvtH = false;
                    this.mvtD = false;
                    this.mvtB = true;
                    this.mvtG = true;
                    this.image = new Img(R.drawable.l_1);
                    break;
                case 2:
                    this.mvtH = true;
                    this.mvtD = false;
                    this.mvtB = false;
                    this.mvtG = true;
                    this.image = new Img(R.drawable.l_2);
                    break;
                case 3:
                    this.mvtH = true;
                    this.mvtD = true;
                    this.mvtB = false;
                    this.mvtG = false;
                    this.image = new Img(R.drawable.l_3);
                    break;
            }
        }
        //attribu les boolean pour les différentes rotations du type 2 (T)
        if (this.type == 2) {
            switch (this.rotation) {
                case 0:
                    this.mvtH = false;
                    this.mvtD = true;
                    this.mvtB = true;
                    this.mvtG = true;
                    this.image = new Img(R.drawable.t_0);
                    break;
                case 1:
                    this.mvtH = true;
                    this.mvtD = false;
                    this.mvtB = true;
                    this.mvtG = true;
                    this.image = new Img(R.drawable.t_1);
                    break;
                case 2:
                    this.mvtH = true;
                    this.mvtD = true;
                    this.mvtB = false;
                    this.mvtG = true;
                    this.image = new Img(R.drawable.t_2);
                    break;
                case 3:
                    this.mvtH = true;
                    this.mvtD = true;
                    this.mvtB = true;
                    this.mvtG = false;
				    this.image = new Img(R.drawable.t_3);
                    break;
            }
        }
        //attribu les boolean pour les différentes rotations du type 3 (I)
        if (this.type == 3) {
            switch (this.rotation) {
                case 0:
                    this.mvtH = false;
                    this.mvtD = true;
                    this.mvtB = false;
                    this.mvtG = true;
                    this.image = new Img(R.drawable.i_0);
                    break;
                case 1:
                    this.mvtH = true;
                    this.mvtD = false;
                    this.mvtB = true;
                    this.mvtG = false;
                    this.image = new Img(R.drawable.i_1);
                    break;
                case 2:
                    this.mvtH = false;
                    this.mvtD = true;
                    this.mvtB = false;
                    this.mvtG = true;
                    this.image = new Img(R.drawable.i_2);
                    break;
                case 3:
                    this.mvtH = true;
                    this.mvtD = false;
                    this.mvtB = true;
                    this.mvtG = false;
                    this.image = new Img(R.drawable.i_3);
                    break;
            }
        }
    }

    public Pion[] getTabPion() {
        return tabPion;
    }

    public void setTabPion(Pion[] tabPion) {
        this.tabPion = tabPion;
    }

    public Tresor getTresor() {
        return tresor;
    }

    public void setTresor(Tresor tresor) {
        this.tresor = tresor;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Img getImage() {
        return image;
    }

    public void setImage(Img image) {
        this.image = image;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    public Boolean getMvtH() {
        return mvtH;
    }

    public void setMvtH(Boolean mvtH) {
        this.mvtH = mvtH;
    }

    public Boolean getMvtD() {
        return mvtD;
    }

    public void setMvtD(Boolean mvtD) {
        this.mvtD = mvtD;
    }

    public Boolean getMvtB() {
        return mvtB;
    }

    public void setMvtB(Boolean mvtB) {
        this.mvtB = mvtB;
    }

    public Boolean getMvtG() {
        return mvtG;
    }

    public void setMvtG(Boolean mvtG) {
        this.mvtG = mvtG;
    }
}
