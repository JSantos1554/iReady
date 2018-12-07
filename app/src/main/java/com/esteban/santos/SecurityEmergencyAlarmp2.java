package com.esteban.santos;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecurityEmergencyAlarmp2 extends AppCompatActivity {
    Button clk;
    MediaPlayer mdx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_emergency_alarmp2);

        clk = (Button)findViewById(R.id.yesbtn);
        mdx = MediaPlayer.create(SecurityEmergencyAlarmp2.this, R.raw.se);
        mdx.start();
    }
    public void process(View v) {
        Intent i = null, chooser = null;
        mdx.stop();
        if (v.getId() == R.id.backbtn) {
            i = new Intent(this, SecurityMenu.class);
            startActivity(i);
        }
    }
}