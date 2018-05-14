package com.example.ramyesteero.petra;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;
    MapView mMapView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_map, container, false);
        mMapView = (MapView) rootView.findViewById(R.id.mapView);
        mMapView.onCreate(savedInstanceState);
        mMapView.onResume(); // needed to get the map to display immediately
        try {
            MapsInitializer.initialize(getActivity().getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        mMapView.getMapAsync(this);
        return rootView;

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
        dbManager = new DBManager(getActivity(), null, null, 1);
        ArrayList<ArrayList<String>> data = dbManager.getRockList();
        mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(43.501108, -79.663242)));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(14f));

        for (int i=0; i<data.get(0).size(); i++) {
            mMap.addMarker(new MarkerOptions().position(new LatLng(Double.parseDouble(data.get(0).get(i)), Double.parseDouble(data.get(1).get(i)))).title(data.get(2).get(i)));
        }

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(final Marker marker) {
                Button viewRock = (Button) getView().findViewById(R.id.viewRock);
                viewRock.setVisibility(View.VISIBLE);
                viewRock.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                      //  Intent i = new Intent(MapFragment.this, information.class);
                      //  i.putExtra("ROCK_ID", marker.getTitle());
                      //  startActivity(i);
                    }
                });
                marker.showInfoWindow();
                return true;
            }
        });

        mMap.setOnInfoWindowCloseListener(new GoogleMap.OnInfoWindowCloseListener() {
            @Override
            public void onInfoWindowClose(Marker marker) {
                Button viewRock = (Button) getView().findViewById(R.id.viewRock);
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
                    Button zoomBack = (Button) getView().findViewById(R.id.zoomBack);
                    zoomBack.setVisibility(View.VISIBLE);
                    zoomBack.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(43.551438, -79.663242)));
                            mMap.animateCamera(CameraUpdateFactory.zoomTo(15.5f));
                        }
                    });

                } else {
                    Button zoomBack = (Button) getView().findViewById(R.id.zoomBack);
                    zoomBack.setVisibility(View.GONE);
                }
            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mMapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }
}
