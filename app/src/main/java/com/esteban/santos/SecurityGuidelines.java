package com.esteban.santos;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class SecurityGuidelines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_guidelines);
        VideoView videoView = findViewById(R.id.videoView2);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.securityvid;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    public void process(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.backbtn) {
            i = new Intent(this, SecurityMenu.class);
            startActivity(i);
        }
    }
}
