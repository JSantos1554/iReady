package com.esteban.santos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecurityGuidelines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_guidelines);
    }
    public void process(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.backbtn) {
            i = new Intent(this, SecurityMenu.class);
            startActivity(i);
        }
    }
}
