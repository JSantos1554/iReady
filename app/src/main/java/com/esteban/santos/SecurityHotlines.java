package com.esteban.santos;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecurityHotlines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_hotlines);
    }

    public void process(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.backbtn) {
            i = new Intent(this, SecurityMenu.class);
            startActivity(i);
        }
    }

    public void BtnNat_onClick(View view){
        String number = "911";
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + number));
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
            return;
        }
        startActivity(intent);
    }

    public void BtnNationalDis_onClick(View view){
        String number = "029111406";
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + number));
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
            return;
        }
        startActivity(intent);
    }

    public void BtnNationalDisNCR_onClick(View view){
        String number = "024211918";
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + number));
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
            return;
        }
        startActivity(intent);
    }

    public void BtnPRC_onClick(View view){
        String number = "143";
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + number));
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
            return;
        }
        startActivity(intent);
    }

    public void BtnBFR_onClick(View view){
        String number = "024260219";
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + number));
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
            return;
        }
        startActivity(intent);
    }
}

