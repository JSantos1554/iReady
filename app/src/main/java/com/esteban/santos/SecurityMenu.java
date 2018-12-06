package com.esteban.santos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecurityMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_menu);
    } public void process(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.hotlines) {
            i = new Intent(this, SecurityHotlines.class);
            startActivity(i);

        } else if (v.getId() == R.id.guidelines) {
            i = new Intent(this, SecurityGuidelines.class);
            startActivity(i);

        } else if (v.getId() == R.id.alarm) {
            i = new Intent(this, SecurityEmergencyAlarm.class);
            startActivity(i);
        }else if (v.getId() == R.id.backbtn) {
            i = new Intent(this, MainMenu.class);
            startActivity(i);
        }
    }

}
