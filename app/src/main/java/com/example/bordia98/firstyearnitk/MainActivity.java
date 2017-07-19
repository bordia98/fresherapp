package com.example.bordia98.firstyearnitk;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener ,books.courseclickListener,clubs.clubsclickListener , festnitk.FestclickListner{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

       

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        displaySelectedScreen(id);
        return true;
    }

    private void displaySelectedScreen(int id) {
        Fragment f = null;

        //creating fragment object
        Fragment fragment = null;
        //initializing the fragment object which is selected
        switch (id) {
            case R.id.map:
                fragment = new maps();
                break;
            case R.id.books:
                fragment = new books();
                break;
            case R.id.fests:
                fragment = new festnitk();
                break;
            case R.id.clubs:
                fragment = new clubs();

                break;
            case R.id.stuff:
                fragment = new stuff();
                break;
            case R.id.contactus:
                fragment = new contact();
        }



        //replacing the fragment
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }

    @Override
    public void physics() {
        Intent i = new Intent(MainActivity.this,physics.class);
        startActivity(i);
    }

    @Override
    public void chemistry() {
        Intent i = new Intent(MainActivity.this,chemistry.class);
        startActivity(i);
    }

    @Override
    public void technical() {
        Intent i = new Intent(MainActivity.this,technicalclub.class);
        startActivity(i);
    }

    @Override
    public void cultural() {
        Intent i = new Intent(MainActivity.this,culturalclubs.class);
        startActivity(i);

    }

    @Override
    public void engineer() {
        Intent i = new Intent(MainActivity.this,Engineer.class);
        startActivity(i);
    }

    @Override
    public void inci() {
        Intent i = new Intent(MainActivity.this,incident.class);
        startActivity(i);
    }

    @Override
    public void crescendo() {
        Intent i = new Intent(MainActivity.this,crescendo.class);
        startActivity(i);
    }

    @Override
    public void pheonix() {
        Intent i = new Intent(MainActivity.this,pheonix.class);
        startActivity(i);

    }

    @Override
    public void bd() {
        Intent i = new Intent(MainActivity.this,bd.class);
        startActivity(i);
    }

    @Override
    public void spandan() {
        Intent i = new Intent(MainActivity.this,spandan.class);
        startActivity(i);

    }
}
