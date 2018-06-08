package com.tadeu.vipdoor;

import android.content.Intent;
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

    //int doorChoosed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_abertura);

        this.mViewHolderDoorChoose.textDoor1 = findViewById(R.id.text_door1);
        this.mViewHolderDoorChoose.textDoor2 = findViewById(R.id.text_door2);
        this.mViewHolderDoorChoose.door1 = findViewById(R.id.img_door_1);
        this.mViewHolderDoorChoose.door2 = findViewById(R.id.img_door_2);

        this.mViewHolderDoorChoose.door1.setOnClickListener(this);
        this.mViewHolderDoorChoose.door2.setOnClickListener(this);

        //this.sendDoorNumber();
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

    /*//Método que deve ser criado para definir qual vai ser a porta e mandar para a próxima activity
    private void sendDoorNumber (){

        //Coletando o texto das 'TextView' das portas
        int nD1 = Integer.valueOf(this.mViewHolderDoorChoose.textDoor1.getText().toString());
        int nD2 = Integer.valueOf(this.mViewHolderDoorChoose.textDoor2.getText().toString());

        //Coletando o 'id' dos botoes das portas
        int imgND1 = this.mViewHolderDoorChoose.door1.getId();
        int imgND2 = this.mViewHolderDoorChoose.door2.getId();

        //Capturar nessa variável o botao que foi clicado
        //Verificar se o comando é esse mesmo
        int compare = this.getTaskId();

        if (compare == imgND1){
            //Comando para 'setar' o text view 'doorNumber'da activity 'DoorPasswordActivity
            //ou para incluir o valor de nD1 em um arquivo/memória a ser utilizado para
            //'setar' o text view 'doorNumber'da activity 'DoorPasswordActivity
            doorChoosed = nD1;
        }
        if (compare == imgND2){
            //Comando para 'setar' o text view 'doorNumber'da activity 'DoorPasswordActivity
            //ou para incluir o valor de nD1 em um arquivo/memória a ser utilizado para
            //'setar' o text view 'doorNumber'da activity 'DoorPasswordActivity
            doorChoosed = nD2;
        }
    }*/
}
