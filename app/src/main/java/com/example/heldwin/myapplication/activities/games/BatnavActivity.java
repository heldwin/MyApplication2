package com.example.heldwin.myapplication.activities.games;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.heldwin.myapplication.MesConstantes;
import com.example.heldwin.myapplication.R;
import com.example.heldwin.myapplication.activities.MenuActivity;

import static com.example.heldwin.myapplication.MesConstantes.key;

/**
 * Created by heldwin on 03/10/2017.
 */

public class BatnavActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = new Intent(this, MenuActivity.class);
        i.putExtra(key,"Victoire");

    }
}
