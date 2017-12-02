package com.example.kolot.hackathon.InstructionsPager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kolot.hackathon.R;

public class InstructionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        ViewPager viewPager = (ViewPager) findViewById(R.id.photos_viewpager);
        if (viewPager != null) {
            viewPager.setAdapter(new SimplePageAdapter(this));
        }
    }
}
