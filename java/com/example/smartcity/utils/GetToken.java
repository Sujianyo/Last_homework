package com.example.smartcity.utils;

import android.content.Context;
import android.content.SharedPreferences;


public class GetToken {
    public String getToken(Context context){
        SharedPreferences sp = context.getSharedPreferences("token_data",Context.MODE_PRIVATE);
        String token = sp.getString("token","");
        return token;
    }
}
