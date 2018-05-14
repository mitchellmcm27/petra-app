package com.example.ramyesteero.petra;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.BottomNavigationView;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class qr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr);


        final Activity activity = this;
        IntentIntegrator integrator = new IntentIntegrator(activity);
        integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
        integrator.setPrompt("Scan the QR code of a rock");
        integrator.setCameraId(0);
        integrator.setBeepEnabled(false);
        integrator.setBarcodeImageEnabled(false);
        integrator.initiateScan();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(requestCode);
        System.out.println(resultCode);
        System.out.println(data);
        if (data != null) {
            IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
            if (result != null) {
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------" + result.getContents());

                if (result.getContents() == null) {
                    super.onBackPressed();
                } else {
                    Intent i = new Intent(qr.this, information.class);
                    i.putExtra("ROCK_ID", result.getContents());
                    startActivity(i);
                    finish();

                }
            } else {
                super.onActivityResult(requestCode, resultCode, data);
            }
        } else {
            finish();
        }
    }
}
