package com.tadeu.vipdoor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class DoorPasswordActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewHolderDoorPassword mViewHolderDoorPassword = new ViewHolderDoorPassword();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door_password);

        this.mViewHolderDoorPassword.doorNumber = findViewById(R.id.text_door_number);
        this.mViewHolderDoorPassword.text_door_number_test = findViewById(R.id.text_door_number_test);
        this.mViewHolderDoorPassword.passDoor = findViewById(R.id.edit_door_passwd);
        this.mViewHolderDoorPassword.openDoor = findViewById(R.id.img_open_door);

        this.mViewHolderDoorPassword.text_door_number_test.setText("Porta escolhida!"); //'Setar' a TextView com a variável 'doorChoosed' da Activity 'LoginAbertura'

        this.mViewHolderDoorPassword.openDoor.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.img_open_door){
            Intent intentDoorPassword = new Intent(this,SuccessOpenActivity.class);
            startActivity(intentDoorPassword);
        }
    }

    private static class ViewHolderDoorPassword{
        TextView doorNumber;
        TextView text_door_number_test;
        EditText passDoor;
        ImageButton openDoor;
    }
}
