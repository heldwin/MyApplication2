package com.example.heldwin.myapplication.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.heldwin.myapplication.MesConstantes;
import com.example.heldwin.myapplication.R;

import static com.example.heldwin.myapplication.MesConstantes.jeu_pref;
import static com.example.heldwin.myapplication.MesConstantes.spLogin;
import static com.example.heldwin.myapplication.MesConstantes.spMdp;

public class MainActivity extends AppCompatActivity {

    EditText loginInput;
    EditText passwordInput;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.sp = getSharedPreferences(jeu_pref,MODE_PRIVATE );

        Toast.makeText(getApplicationContext(), "actMainOk",
                Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);
        this.loginInput = (EditText)findViewById(R.id.login);
        this.passwordInput = (EditText)findViewById(R.id.password);

    }

    public void goCheck(View v) {
      if(MesConstantes.Login.equals(this.loginInput.getText().toString())&&
              MesConstantes.Mdp.equals(this.passwordInput.getText().toString() )){
         startActivity(new Intent(this, MenuActivity.class));
       }
    }
    public void goSave(View v) {
        SharedPreferences.Editor ed = this.sp.edit();
        ed.putString(spLogin,loginInput.getText().toString());
        ed.putString(spMdp,passwordInput.getText().toString());
        ed.apply();

    }
    public void goDispatch(View v) {
        String strLogin = this.sp.getString(spLogin,"Utilisateur");
        String strPassword = this.sp.getString(spMdp,"Mot de passe");
        loginInput.setText(strLogin);
        passwordInput.setText(strPassword);
    }
}
