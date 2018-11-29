package com.esteban.santos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MedicalMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_menu);
    }
    public void process(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.firstaid)  {
            i = new Intent(this, MedicalFirstaid.class);
            startActivity(i);
        } else if (v.getId() == R.id.hotlines) {
            i = new Intent(this, MedicalHotlines.class);
            startActivity(i);
        } else if (v.getId() == R.id.heatstroke) {
            i = new Intent(this, MedicalHeatstroke.class);
            startActivity(i);
        } else if (v.getId() == R.id.heartattack) {
            i = new Intent(this, MedicalHeartattack.class);
            startActivity(i);
        } else if (v.getId() == R.id.poison) {
            i = new Intent(this, MedicalFoodpoison.class);
            startActivity(i);
        }  else if (v.getId() == R.id.dengue) {
        i = new Intent(this, MedicalDengue.class);
        startActivity(i);
        } else if (v.getId() == R.id.hotlinesbtn) {
            i = new Intent(this, MedicalHotlines.class);
            startActivity(i);
        } else if (v.getId() == R.id.heatstrokebtn) {
            i = new Intent(this, MedicalHeatstroke.class);
            startActivity(i);
        } else if (v.getId() == R.id.heartattackbtn) {
            i = new Intent(this, MedicalHeartattack.class);
            startActivity(i);
        } else if (v.getId() == R.id.foodpoisonbtn) {
            i = new Intent(this, MedicalFoodpoison.class);
            startActivity(i);
        }  else if (v.getId() == R.id.denguebtn) {
            i = new Intent(this, MedicalDengue.class);
            startActivity(i);
        }  else if (v.getId() == R.id.firstaidbtn) {
            i = new Intent(this, MedicalFirstaid.class);
            startActivity(i);
        } else if (v.getId() == R.id.backbtn) {
            i = new Intent(this, MainMenu.class);
            startActivity(i);
        }

    }
}
