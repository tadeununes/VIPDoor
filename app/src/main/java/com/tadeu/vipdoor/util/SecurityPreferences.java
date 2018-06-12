package com.tadeu.vipdoor.util;

import android.content.Context;
import android.content.SharedPreferences;

public class SecurityPreferences {

    private final SharedPreferences mSharedPreferences;

    public SecurityPreferences (Context context){

        this.mSharedPreferences = context.getSharedPreferences("VIPDoor", Context.MODE_PRIVATE);

    }

    public void storeString(String key, String value){
        this.mSharedPreferences.edit().putString(key, value).apply();
    }

    public String getStoreString(String key){
        return this.mSharedPreferences.getString(key, "");
    }

}
