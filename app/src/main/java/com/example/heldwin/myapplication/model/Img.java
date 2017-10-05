package com.example.heldwin.myapplication.model;

import android.media.Image;

/**
 * Created by unkls on 04/10/2017.
 */

public class Img{


    private int image;
    // la taille sera fixer dans la vue directement ?



    /**
     * @hide
     */
    public Img(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
