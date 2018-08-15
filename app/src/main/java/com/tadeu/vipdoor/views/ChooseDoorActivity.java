package com.tadeu.vipdoor.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.tadeu.vipdoor.R;
import com.tadeu.vipdoor.constants.VIPDoorConstants;
import com.tadeu.vipdoor.util.SecurityPreferences;

public class ChooseDoorActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolderDoorChoose mViewHolderDoorChoose = new ViewHolderDoorChoose();
    private SecurityPreferences mSecurityPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_door);



        this.mViewHolderDoorChoose.textDoor1 = findViewById(R.id.text_door1);
        this.mViewHolderDoorChoose.textDoor2 = findViewById(R.id.text_door2);
        this.mViewHolderDoorChoose.door1 = findViewById(R.id.img_door_1);
        this.mViewHolderDoorChoose.door2 = findViewById(R.id.img_door_2);

        this.mSecurityPreferences = new SecurityPreferences(this);

        this.mViewHolderDoorChoose.door1.setOnClickListener(this);
        this.mViewHolderDoorChoose.door2.setOnClickListener(this);

    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onStop(){
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.img_door_1) {
            //Lógica da Porta 1
            this.mSecurityPreferences.storeString(VIPDoorConstants.DOOR, VIPDoorConstants.ONE);
            Intent intentPorta1 = new Intent(this, DoorPasswordActivity.class);
            startActivity(intentPorta1);
        } else if (id == R.id.img_door_2) {
            //Lógica da Porta 2
            this.mSecurityPreferences.storeString(VIPDoorConstants.DOOR, VIPDoorConstants.TWO);
            Intent intentPorta2 = new Intent(this, DoorPasswordActivity.class);
            startActivity(intentPorta2);
        }
    }

    private static class ViewHolderDoorChoose {
        TextView textDoor1;
        TextView textDoor2;
        ImageButton door1;
        ImageButton door2;
    }

}
