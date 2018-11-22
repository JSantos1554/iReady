package com.esteban.santos;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void process(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.mapbtn) {
            i = new Intent(this, MapsActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.firebtn) {
            i = new Intent(this, FireMenu.class);
            startActivity(i);
        } else if (v.getId() == R.id.stormbtn) {
            i = new Intent(this, StormMenu.class);
            startActivity(i);
        } else if (v.getId() == R.id.medicalbtn) {
            i = new Intent(this, MedicalMenu.class);
            startActivity(i);
        } else if (v.getId() == R.id.securitybtn) {
            i = new Intent(this, SecurityMenu.class);
            startActivity(i);
        }

    }
}
