package com.example.ramyesteero.petra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class CollectionFragment extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_collection, container, false);

        LinearLayout rl = (LinearLayout) rootView.findViewById(R.id.listItemLayout);
        final int childCount = rl.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View v = rl.getChildAt(i);
            v.setOnClickListener(this);
        }
        return rootView;
    }

    @Override
    public void onClick(View v) {
        int id =v.getId();
        switch (id) {
            case R.id.a:
                a(v);
                break;
            case R.id.b:
                b(v);
                break;
            case R.id.c:
                c(v);
                break;
            case R.id.e:
                e(v);
                break;
            case R.id.g:
                g(v);
                break;
            case R.id.h:
                h(v);
                break;
            case R.id.i:
                i(v);
                break;
            case R.id.j:
                j(v);
                break;
            case R.id.k:
                k(v);
                break;
            case R.id.l:
                l(v);
                break;
            case R.id.m:
                m(v);
                break;
            case R.id.o:
                o(v);
                break;
            case R.id.p:
                p(v);
                break;
            case R.id.q:
                q(v);
                break;
            case R.id.r:
                r(v);
                break;
            case R.id.s:
                s(v);
                break;
            case R.id.t:
                t(v);
                break;
            case R.id.u:
                u(v);
                break;
            case R.id.v:
                v(v);
                break;
            case R.id.w:
                w(v);
                break;
            case R.id.x:
                x(v);
                break;
            case R.id.y:
                y(v);
                break;
            case R.id.z:
                z(v);
                break;
            case R.id.aa:
                aa(v);
                break;
            case R.id.ab:
                ab(v);
                break;
            case R.id.ac:
                ac(v);
                break;
            case R.id.ad:
                ad(v);
                break;
            case R.id.ae:
                ae(v);
                break;
            case R.id.af:
                af(v);
                break;
            case R.id.ag:
                break;
        }
    }

    @Override
    public void onResume() {
        super.onResume();
    }


    public void a(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Granite - 1");
        startActivity(i);
    }

    public void b(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Tonalite (Trondhjemite) - 1");
        startActivity(i);
    }

    public void c(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Granite Pegmatite - 1");
        startActivity(i);
    }

    public void d(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Syenite");
        startActivity(i);
    }

    public void e(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Tonalite (Trondhjemite) - 2");
        startActivity(i);
    }

    public void g(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Granite Pegmatite - 2");
        startActivity(i);
    }

    public void i(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Tonalite (Trondhjemite) - 3");
        startActivity(i);
    }

    public void h(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Granite - 2");
        startActivity(i);
    }

    public void j(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Gneiss - 1");
        startActivity(i);
    }

    public void k(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Migmatitic Gneiss - 1");
        startActivity(i);
    }

    public void l(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Marble");
        startActivity(i);
    }

    public void m(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Migmatitic Gneiss - 2");
        startActivity(i);
    }

    public void n(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Schist - 1");
        startActivity(i);
    }

    public void o(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Mylonite");
        startActivity(i);
    }

    public void p(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Gneiss - 2");
        startActivity(i);
    }

    public void q(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Schist - 2");
        startActivity(i);
    }

    public void r(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Schist - 3");
        startActivity(i);
    }

    public void s(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Migmatitic Gneiss - 3");
        startActivity(i);
    }

    public void t(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Amphibolite");
        startActivity(i);
    }

    public void u(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Migmatitic Amphibolite");
        startActivity(i);
    }

    public void v(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Limestone - 1");
        startActivity(i);
    }

    public void w(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Limestone - 2");
        startActivity(i);
    }

    public void x(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Limestone - 3");
        startActivity(i);
    }

    public void y(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Limestone - 4");
        startActivity(i);
    }

    public void z(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Limestone - 5");
        startActivity(i);
    }

    public void aa(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Limestone - 6");
        startActivity(i);
    }

    public void ab(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Sandstone");
        startActivity(i);
    }

    public void ac(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Talus Breccia");
        startActivity(i);
    }

    public void ad(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Limestone - 7");
        startActivity(i);
    }

    public void ae(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Limestone - 8");
        startActivity(i);
    }

    public void af(View v) {
        Intent i = new Intent(getActivity(), information.class);
        i.putExtra("ROCK_ID", "Solution breccia");
        startActivity(i);
    }
}