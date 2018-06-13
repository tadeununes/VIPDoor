package com.tadeu.vipdoor.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.tadeu.vipdoor.R;
import com.tadeu.vipdoor.constants.VIPDoorConstants;
import com.tadeu.vipdoor.util.SecurityPreferences;

public class DoorPasswordActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewHolderDoorPassword mViewHolderDoorPassword = new ViewHolderDoorPassword();
    private SecurityPreferences mSecurityPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door_password);

        this.mViewHolderDoorPassword.doorNumber = findViewById(R.id.text_door_number);
        this.mViewHolderDoorPassword.passDoor = findViewById(R.id.edit_door_passwd);
        this.mViewHolderDoorPassword.openDoor = findViewById(R.id.img_open_door);

        this.mSecurityPreferences = new SecurityPreferences(this);

        this.mViewHolderDoorPassword.openDoor.setOnClickListener(this);

        this.verifyPreferences();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.img_open_door){
            Intent intentDoorPassword = new Intent(this,SuccessOpenActivity.class);
            startActivity(intentDoorPassword);
        }
    }

    private void verifyPreferences(){

        String doorChoosed = this.mSecurityPreferences.getStoreString(VIPDoorConstants.DOOR);
        if (doorChoosed.equals(VIPDoorConstants.ONE))
            this.mViewHolderDoorPassword.doorNumber.setText(VIPDoorConstants.ONE);
        else if (doorChoosed.equals(VIPDoorConstants.TWO))
            this.mViewHolderDoorPassword.doorNumber.setText(VIPDoorConstants.TWO);

    }

    private static class ViewHolderDoorPassword{
        TextView doorNumber;
        EditText passDoor;
        ImageButton openDoor;
    }
}
