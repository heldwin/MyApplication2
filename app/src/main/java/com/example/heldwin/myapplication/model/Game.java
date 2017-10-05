package com.example.heldwin.myapplication.model;

import android.content.Intent;

/**
 * Created by heldwin on 02/10/2017.
 */

public class Game {


    private String nom;
    private int image;
    private Intent monIntent;


    public Game(String n, int i,Intent intent){
        this.nom = n;
        this.image = i;
        this.monIntent=intent;
    }

    public String getNom() {
        return nom;
    }
    public int getimage() {
        return image;
    }
    public Intent getMonIntent() {
        return monIntent;
    }

}
