package com.example.ramyesteero.petra;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class collection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);

        //The bottom navigation bar functionality
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.collection);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent i;
                switch (item.getItemId()) {
                    case R.id.home:
                        i = new Intent(collection.this, home.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                        break;
                    case R.id.qr:
                        i = new Intent(collection.this, qr.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                        break;
                    case R.id.gmaps:
                        i = new Intent(collection.this, gmaps.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                        break;
                    case R.id.about:
                        i = new Intent(collection.this, about.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.collection);
    }

    public void a(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Granite - 1");
        startActivity(i);
    }

    public void b(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Tonalite (Trondhjemite) - 1");
        startActivity(i);
    }

    public void c(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Granite Pegmatite - 1");
        startActivity(i);
    }

    public void d(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Syenite");
        startActivity(i);
    }

    public void e(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Tonalite (Trondhjemite) - 2");
        startActivity(i);
    }

    public void g(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Granite Pegmatite - 2");
        startActivity(i);
    }

    public void i(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Tonalite (Trondhjemite) - 3");
        startActivity(i);
    }

    public void h(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Granite - 2");
        startActivity(i);
    }

    public void j(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Gneiss - 1");
        startActivity(i);
    }

    public void k(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Migmatitic Gneiss - 1");
        startActivity(i);
    }

    public void l(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Marble");
        startActivity(i);
    }

    public void m(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Migmatitic Gneiss - 2");
        startActivity(i);
    }

    public void n(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Schist - 1");
        startActivity(i);
    }

    public void o(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Mylonite");
        startActivity(i);
    }

    public void p(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Gneiss - 2");
        startActivity(i);
    }

    public void q(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Schist - 2");
        startActivity(i);
    }

    public void r(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Schist - 3");
        startActivity(i);
    }

    public void s(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Migmatitic Gneiss - 3");
        startActivity(i);
    }

    public void t(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Amphibolite");
        startActivity(i);
    }

    public void u(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Migmatitic Amphibolite");
        startActivity(i);
    }

    public void v(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Limestone - 1");
        startActivity(i);
    }

    public void w(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Limestone - 2");
        startActivity(i);
    }

    public void x(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Limestone - 3");
        startActivity(i);
    }

    public void y(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Limestone - 4");
        startActivity(i);
    }

    public void z(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Limestone - 5");
        startActivity(i);
    }

    public void aa(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Limestone - 6");
        startActivity(i);
    }

    public void ab(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Sandstone");
        startActivity(i);
    }

    public void ac(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Talus Breccia");
        startActivity(i);
    }

    public void ad(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Limestone - 7");
        startActivity(i);
    }

    public void ae(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Limestone - 8");
        startActivity(i);
    }

    public void af(View v) {
        Intent i = new Intent(collection.this, information.class);
        i.putExtra("ROCK_ID", "Solution breccia");
        startActivity(i);
    }
}