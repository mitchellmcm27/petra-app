package com.example.ramyesteero.petra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button button_qr = (Button) findViewById(R.id.qr);
        button_qr.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),qr.class);
                startActivity(i);
            }
        });

        Button button_map = (Button) findViewById(R.id.map);
        button_map.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),map.class);
                startActivity(i);
            }
        });

        Button button_collection = (Button) findViewById(R.id.collection);
        button_collection.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),collection.class);
                startActivity(i);
            }
        });

        Button button_about = (Button) findViewById(R.id.about);
        button_about.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),about.class);
                startActivity(i);
            }
        });
    }
}
