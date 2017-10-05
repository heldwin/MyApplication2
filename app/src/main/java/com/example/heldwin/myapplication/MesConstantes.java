package com.example.heldwin.myapplication;

import android.content.Context;
import android.content.Intent;

import com.example.heldwin.myapplication.activities.games.BatnavActivity;
import com.example.heldwin.myapplication.activities.games.DameActivity;
import com.example.heldwin.myapplication.activities.games.EchecActivity;
import com.example.heldwin.myapplication.activities.games.StrategoActivity;
import com.example.heldwin.myapplication.activities.games.PussanceActivity;
import com.example.heldwin.myapplication.activities.games.SudokuActivity;
import com.example.heldwin.myapplication.activities.test.TestLab;
import com.example.heldwin.myapplication.model.Game;

/**
 * Created by heldwin on 02/10/2017.
 */

public class MesConstantes {
    public final static String Login = "heldwin";
    public final static String Mdp = "azerty";
    public final static String key = "clef";
    public final static String jeu_pref = "jeu_pref";
    public final static String spLogin = "login";
    public final static String spMdp = "mdp";

    public static Game[]initArJeu(Context c){
   return new Game[] {
           new Game(c.getResources().getString(R.string.dame),R.drawable.bn,new Intent(c, DameActivity.class)),
           new Game(c.getResources().getString(R.string.sudoku),R.drawable.sudoku,new Intent(c, SudokuActivity.class)),
           new Game(c.getResources().getString(R.string.p4),R.drawable.p4,new Intent(c, PussanceActivity.class)),
           new Game(c.getResources().getString(R.string.stratego),R.drawable.chevaux,new Intent(c, TestLab.class)),
           new Game(c.getResources().getString(R.string.batNav),R.drawable.bn,new Intent(c, BatnavActivity.class)),
           new Game(c.getResources().getString(R.string.echec),R.drawable.echecs,new Intent(c, EchecActivity.class)),
   };

    }
}
