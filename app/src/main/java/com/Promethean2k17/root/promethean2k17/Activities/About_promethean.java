package com.Promethean2k17.root.promethean2k17.Activities;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.Promethean2k17.root.promethean2k17.R;

public class About_promethean extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_promethean);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("About Promethean");
    }
}
