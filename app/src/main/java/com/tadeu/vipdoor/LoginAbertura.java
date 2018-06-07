package com.tadeu.vipdoor;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class LoginAbertura extends AppCompatActivity implements View.OnClickListener{

    //Teste de funcionalidade dos botoes
    /*private static final int DKGRAY = -12303292;
    public static final int GREEN = -16711936;*/
    private ViewHolderDoorChoose mViewHolderDoorChoose = new ViewHolderDoorChoose();
    int teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_abertura);

        this.mViewHolderDoorChoose.textDoor1 = findViewById(R.id.text_ip_door1);
        this.mViewHolderDoorChoose.textDoor2 = findViewById(R.id.text_ip_door2);
        this.mViewHolderDoorChoose.door1 = findViewById(R.id.img_door_1);
        this.mViewHolderDoorChoose.door2 = findViewById(R.id.img_door_2);

        this.mViewHolderDoorChoose.door1.setOnClickListener(this);
        this.mViewHolderDoorChoose.door2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.img_door_1){
            //Teste de funcionalidade dos botoes
            /*this.mViewHolderDoorChoose.door1.setBackgroundColor(GREEN);
            this.mViewHolderDoorChoose.door2.setBackgroundColor(DKGRAY);*/
            //Lógica da Porta 1
            Intent intentPorta1 = new Intent(this,DoorPasswordActivity.class);
            startActivity(intentPorta1);
        }
        if (id == R.id.img_door_2){
            //Teste de funcionalidade dos botoes
            /*this.mViewHolderDoorChoose.door2.setBackgroundColor(GREEN);
            this.mViewHolderDoorChoose.door1.setBackgroundColor(DKGRAY);*/
            //Lógica da Porta 2
            Intent intentPorta2 = new Intent(this,DoorPasswordActivity.class);
            startActivity(intentPorta2);
        }
    }

    private static class ViewHolderDoorChoose{
        TextView textDoor1;
        TextView textDoor2;
        ImageButton door1;
        ImageButton door2;
    }
}
