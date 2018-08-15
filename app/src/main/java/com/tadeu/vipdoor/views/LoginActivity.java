package com.tadeu.vipdoor.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.tadeu.vipdoor.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolderLogin mViewHolderLogin = new ViewHolderLogin();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        this.mViewHolderLogin.editLogin = findViewById(R.id.edit_login);
        this.mViewHolderLogin.editPassword = findViewById(R.id.edit_password);
        this.mViewHolderLogin.appIcon = findViewById(R.id.img_app_icon);

        this.mViewHolderLogin.appIcon.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.img_app_icon){
            //Intent intent = new Intent(getApplicationContext(),ChooseDoorActivity.class);
            Intent intentLogin = new Intent(this,ChooseDoorActivity.class);
            startActivity(intentLogin);
        }
    }

    private static class ViewHolderLogin{
        EditText editLogin;
        EditText editPassword;
        ImageButton appIcon;
    }
}
