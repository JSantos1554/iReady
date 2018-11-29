package com.esteban.santos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MedicalDengue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_dengue);
    }
    public void process(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.guidelines) {
            i = new Intent(this, MedicalFirstaid.class);
            startActivity(i);
        } else if (v.getId() == R.id.firstaid) {
            i = new Intent(this, MedicalHotlines.class);
            startActivity(i);
        }
    }
}
