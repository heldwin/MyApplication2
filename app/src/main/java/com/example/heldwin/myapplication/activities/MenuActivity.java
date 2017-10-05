package com.example.heldwin.myapplication.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.example.heldwin.myapplication.MesConstantes;
import com.example.heldwin.myapplication.R;
import com.example.heldwin.myapplication.adapter.Jeux_grid_adapter;
import com.example.heldwin.myapplication.listener.MenuItemClicListener;
import com.example.heldwin.myapplication.model.Game;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.example.heldwin.myapplication.MesConstantes.key;


public class MenuActivity extends AppCompatActivity {
    GridView gridViewMenu;
    Game[] mes_jeux;
    MenuItemClicListener monListener = new MenuItemClicListener(mes_jeux,this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mes_jeux = MesConstantes.initArJeu(this);
        innitGridView();
    }
    private void innitGridView() {
      setContentView(R.layout.activity_menu);
        Jeux_grid_adapter adapter= new Jeux_grid_adapter(this,R.layout.ma_grille,mes_jeux);

        gridViewMenu= (GridView)findViewById(R.id.gridView);
        gridViewMenu.setAdapter(adapter);
        gridViewMenu.setOnItemClickListener(monListener);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(this,data.getStringExtra(key), Toast.LENGTH_SHORT).show();
    }
}
