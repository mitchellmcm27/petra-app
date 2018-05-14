package com.example.ramyesteero.petra;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class gmaps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmaps);


        //The bottom navigation bar functionality
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.gmaps);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent i;
                switch (item.getItemId()) {
                    case R.id.home:
                        i = new Intent(gmaps.this, home.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        break;
                    case R.id.qr:
                        i = new Intent(gmaps.this, qr.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                        break;
                    case R.id.collection:
                        i = new Intent(gmaps.this, collection.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        break;
                    case R.id.about:
                        i = new Intent(gmaps.this, about.class);
                        startActivity(i);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        break;
                }
                return true;
            }
        });



        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        DBManager dbManager;
        dbManager = new DBManager(this, null, null, 1);
        ArrayList<ArrayList<String>> data = dbManager.getRockList();
        mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(43.501108, -79.663242)));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(14f));

        for (int i=0; i<data.get(0).size(); i++) {
            mMap.addMarker(new MarkerOptions().position(new LatLng(Double.parseDouble(data.get(0).get(i)), Double.parseDouble(data.get(1).get(i)))).title(data.get(2).get(i)));
        }

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(final Marker marker) {
                Button viewRock = (Button) findViewById(R.id.viewRock);
                viewRock.setVisibility(View.VISIBLE);
                viewRock.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(gmaps.this, information.class);
                        i.putExtra("ROCK_ID", marker.getTitle());
                        startActivity(i);
                    }
                });
                marker.showInfoWindow();
                return true;
            }
        });

        mMap.setOnInfoWindowCloseListener(new GoogleMap.OnInfoWindowCloseListener() {
            @Override
            public void onInfoWindowClose(Marker marker) {
                Button viewRock = (Button) findViewById(R.id.viewRock);
                viewRock.setVisibility(View.GONE);
            }
        });


        mMap.setOnCameraMoveListener(new GoogleMap.OnCameraMoveListener() {
            @Override
            public void onCameraMove() {
                CameraPosition cameraPosition = mMap.getCameraPosition();
                System.out.println(cameraPosition);

                if(cameraPosition.zoom < 12.0 ||
                        cameraPosition.target.latitude > 43.584880991741784 ||
                        cameraPosition.target.latitude < 43.51572304426604 ||
                        cameraPosition.target.longitude < -79.68709509819746 ||
                        cameraPosition.target.longitude > -79.63864468038084
                       ) {
                    Button zoomBack = (Button) findViewById(R.id.zoomBack);
                    zoomBack.setVisibility(View.VISIBLE);
                    zoomBack.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(43.551438, -79.663242)));
                            mMap.animateCamera(CameraUpdateFactory.zoomTo(15.5f));
                        }
                    });

                } else {
                    Button zoomBack = (Button) findViewById(R.id.zoomBack);
                    zoomBack.setVisibility(View.GONE);
                }
            }
        });






    }

    @Override
    public void onResume() {
        super.onResume();
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.gmaps);
    }
}
