package com.example.heldwin.myapplication.model;

/**
 * Created by unkls on 04/10/2017.
 */

class Pion {
    private int team;
    private Img image;

    Pion(int team, Img image){
        this.team = team;
        this.image = image;
    }

    public Img getImage() {
        return image;
    }

    public int getTeam() {
        return team;
    }
}
