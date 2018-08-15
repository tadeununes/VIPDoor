package com.tadeu.vipdoor.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tadeu.vipdoor.R;

public class SuccessOpenActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewHolderSuccessOpen mViewHolderSuccessOpen = new ViewHolderSuccessOpen();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_open);



        this.mViewHolderSuccessOpen.newDoorOpen = findViewById(R.id.text_new_door_open);

        this.mViewHolderSuccessOpen.newDoorOpen.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.img_open_door) {
            Intent intentNewDoorOpen = new Intent(this, ChooseDoorActivity.class);
            startActivity(intentNewDoorOpen);
        }
    }

    private static class ViewHolderSuccessOpen {
        TextView newDoorOpen;
    }
}
