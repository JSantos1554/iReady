package com.esteban.santos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StormMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storm_menu);
    }
    public void process(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.hotlines) {
            i = new Intent(this, StormHotlines.class);
            startActivity(i);

        } else if (v.getId() == R.id.guidelines) {
            i = new Intent(this, StormGuidelines.class);
            startActivity(i);

        } else if (v.getId() == R.id.firstaid) {
            i = new Intent(this, StormFirstAid.class);
            startActivity(i);
        }else if (v.getId() == R.id.backbtn) {
            i = new Intent(this, MainMenu.class);
            startActivity(i);
        }
    }
}
