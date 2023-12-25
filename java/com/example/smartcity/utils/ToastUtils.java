package com.example.smartcity.utils;

import android.content.Context;
import android.widget.Toast;


public class ToastUtils {
    public void Toast (Context context,String s) {
        Toast.makeText(context,s,Toast.LENGTH_LONG).show();
    }
}
