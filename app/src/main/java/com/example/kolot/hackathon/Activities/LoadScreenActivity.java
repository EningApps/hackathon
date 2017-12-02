package com.example.kolot.hackathon.Activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kolot.hackathon.InstructionsPager.InstructionsActivity;

public class LoadScreenActivity extends AppCompatActivity {

    public static final String SP_NAME = "spName";
    public static final String SP_KEY_FIRST_START = "spKeyFirstStart";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences sp = getSharedPreferences(SP_NAME, MODE_PRIVATE);
        boolean firstStart = sp.getBoolean(SP_KEY_FIRST_START, true);
        Intent intent = null;
        if(firstStart) {
            sp.edit().putBoolean(SP_KEY_FIRST_START, false).apply();
            intent = new Intent(this, InstructionsActivity.class);
        } else {
            intent = new Intent(this, MainActivity.class);
        }


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startActivity(intent);
        finish();


    }
}
