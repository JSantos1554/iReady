package com.esteban.santos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class FireFirstAid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_first_aid);
    }

    public void process(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.hotlines) {
            i = new Intent(this, FireHotlines.class);
            startActivity(i);

        }else if (v.getId() == R.id.backbtn) {
            i = new Intent(this, FireMenu.class);
            startActivity(i);
        }
    }

}
