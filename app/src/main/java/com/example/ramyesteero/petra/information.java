package com.example.ramyesteero.petra;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class information extends AppCompatActivity {

    ViewPager viewPager;
    LinearLayout dots;
    private int dotscount;
    private ImageView[] imdots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        DBManager dbManager;
        dbManager = new DBManager(this, null, null, 1);
        ArrayList<String> info = dbManager.getRockInformation(getIntent().getStringExtra("ROCK_ID"));

        TextView name = (TextView) findViewById(R.id.name);
        TextView tttt = (TextView) findViewById(R.id.tttt);
        TextView iiii = (TextView) findViewById(R.id.iiii);
        tttt.setText(getIntent().getStringExtra("ROCK_ID"));

        for (int i = 0; i < info.size(); i++) {
            System.out.println(info);
            if (i == 0) {
                iiii.setText(info.get(i));
            } else {
                if (i == 4) {
                    name.setText(name.getText() + "\n" + info.get(i));
                }
            }

        }

        Integer [] images = new Integer[3];

        if (getIntent().getStringExtra("ROCK_ID").equals("Granite - 1")) {
            images[0] = R.drawable.granite1n1;
            images[1] = R.drawable.granite1n2;
            images[2] = R.drawable.granite1n3;
        }
//TODO
        if (getIntent().getStringExtra("ROCK_ID").equals("Tonalite (Trondhjemite) - 1")) {
            images[0] = R.drawable.tonalite1n1;
            images[1] = R.drawable.tonalite2n1;
            images[2] = R.drawable.tonalite3n1;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Granite Pegmatite - 1")) {
            images[0] = R.drawable.granitepegmatite1n1;
            images[1] = R.drawable.granitepegmatite2n1;
            images[2] = R.drawable.granitepegmatite3n1;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Syenite")) {
            images[0] = R.drawable.syenite1;
            images[1] = R.drawable.syenite2;
            images[2] = R.drawable.syenite3;
        }
//TODO
        if (getIntent().getStringExtra("ROCK_ID").equals("Tonalite (Trondhjemite) - 2")) {
            images[0] = R.drawable.tonalite1n2;
            images[1] = R.drawable.tonalite2n2;
            images[2] = R.drawable.tonalite3n2;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Granite Pegmatite - 2")) {
            images[0] = R.drawable.granitepegmatite1n2;
            images[1] = R.drawable.granitepegmatite2n2;
            images[2] = R.drawable.granitepegmatite3n2;
        }
//TODO
        if (getIntent().getStringExtra("ROCK_ID").equals("Tonalite (Trondhjemite) - 3")) {
            images[0] = R.drawable.tonalite1n3;
            images[1] = R.drawable.tonalite2n3;
            images[2] = R.drawable.tonalite3n3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Granite - 2")) {
            images[0] = R.drawable.granite2n1;
            images[1] = R.drawable.granite2n2;
            images[2] = R.drawable.granite2n3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Gneiss - 1")) {
            images[0] = R.drawable.gneiss1;
            images[1] = R.drawable.gneiss2;
            images[2] = R.drawable.gneiss3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Migmatitic Gneiss - 1")) {
            images[0] = R.drawable.migmatiticgneiss1;
            images[1] = R.drawable.migmatiticgneiss2;
            images[2] = R.drawable.migmatiticgneiss3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Marble")) {
            images[0] = R.drawable.marble1;
            images[1] = R.drawable.marble2;
            images[2] = R.drawable.marble3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Migmatitic Gneiss - 2")) {
            images[0] = R.drawable.migmatiticgneiss1;
            images[1] = R.drawable.migmatiticgneiss2;
            images[2] = R.drawable.migmatiticgneiss3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Schist - 1")) {
            images[0] = R.drawable.schist1n1;
            images[1] = R.drawable.schist2n1;
            images[2] = R.drawable.schist3n1;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Mylonite")) {
            images[0] = R.drawable.mylonite1;
            images[1] = R.drawable.mylonite2;
            images[2] = R.drawable.mylonite3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Gneiss - 2")) {
            images[0] = R.drawable.gneiss1n2;
            images[1] = R.drawable.gneiss2n2;
            images[2] = R.drawable.gneiss3n2;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Schist - 2")) {
            images[0] = R.drawable.schist1n2;
            images[1] = R.drawable.schist2n2;
            images[2] = R.drawable.schist3n2;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Schist - 3")) {
            images[0] = R.drawable.schist1n3;
            images[1] = R.drawable.schist2n3;
            images[2] = R.drawable.schist3n3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Migmatitic Gneiss - 3")) {
            images[0] = R.drawable.migmatiticgneiss1;
            images[1] = R.drawable.migmatiticgneiss2;
            images[2] = R.drawable.migmatiticgneiss3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Amphibolite")) {
            images[0] = R.drawable.amphibolite1;
            images[1] = R.drawable.amphibolite2;
            images[2] = R.drawable.amphibolite3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Migmatitic Amphibolite")) {
            images[0] = R.drawable.migmatiticamphibolite1;
            images[1] = R.drawable.migmatiticamphibolite2;
            images[2] = R.drawable.migmatiticamphibolite3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Limestone - 1")) {
            images[0] = R.drawable.limestone1;
            images[1] = R.drawable.limestone2;
            images[2] = R.drawable.limestone3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Limestone - 2")) {
            images[0] = R.drawable.limestone1;
            images[1] = R.drawable.limestone2;
            images[2] = R.drawable.limestone3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Limestone - 3")) {
            images[0] = R.drawable.limestone1;
            images[1] = R.drawable.limestone2;
            images[2] = R.drawable.limestone3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Limestone - 4")) {
            images[0] = R.drawable.limestone1;
            images[1] = R.drawable.limestone2;
            images[2] = R.drawable.limestone3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Limestone - 5")) {
            images[0] = R.drawable.limestone1;
            images[1] = R.drawable.limestone2;
            images[2] = R.drawable.limestone3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Limestone - 6")) {
            images[0] = R.drawable.limestone1;
            images[1] = R.drawable.limestone2;
            images[2] = R.drawable.limestone3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Sandstone")) {
            images[0] = R.drawable.sandstone1;
            images[1] = R.drawable.sandstone2;
            images[2] = R.drawable.sandstone3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Talus Breccia")) {
            images[0] = R.drawable.talusbreccia1;
            images[1] = R.drawable.talusbreccia2;
            images[2] = R.drawable.talusbreccia3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Limestone - 7")) {
            images[0] = R.drawable.limestone1;
            images[1] = R.drawable.limestone2;
            images[2] = R.drawable.limestone3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Limestone - 8")) {
            images[0] = R.drawable.limestone1;
            images[1] = R.drawable.limestone2;
            images[2] = R.drawable.limestone3;
        }

        if (getIntent().getStringExtra("ROCK_ID").equals("Solution breccia")) {
            images[0] = R.drawable.solutionbreccia1;
            images[1] = R.drawable.solutionbreccia2;
            images[2] = R.drawable.solutionbreccia3;
        }
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        dots = (LinearLayout) findViewById(R.id.dots);
        viewPagerAdapter viewPagerAdapter = new viewPagerAdapter(this, images);
        viewPager.setAdapter(viewPagerAdapter);

        dotscount = viewPagerAdapter.getCount();
        imdots = new ImageView[dotscount];

        for (int i = 0; i < dotscount; i++) {
            imdots[i] = new ImageView(this);
            imdots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8,4,8,4);
            dots.addView(imdots[i], params);
        }

        imdots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < dotscount; i++) {
                    imdots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));
                }

                imdots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new timerTask(), 2000, 4000);

    }

    public class timerTask extends TimerTask {
        public void run() {
            information.this.runOnUiThread(new Runnable () {
                public void run() {
                    if (viewPager.getCurrentItem() < 3 ) {
                        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                    } else {
                        viewPager.setCurrentItem(0);
                    }
                }
            });
        }
    }
}
