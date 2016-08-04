package com.newtra.designpatterns;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import java.io.IOException;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    HashMap<String, BeanDesignPattern> al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.setDrawerListener(toggle);
//        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        try {
            DBHandler db = new DBHandler(MainActivity.this);
            db.createDataBase();
            al = db.getDatas();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();
        displayView(id);

        return true;
    }

    public void displayView(int viewId) {

        Fragment fragment = null;
        String title = getString(R.string.app_name);
        fragment = new SelectedTopic();
        BeanDesignPattern designPattern = null;
        switch (viewId) {
            case R.id.factoryPattern:
                title = getResources().getString(R.string.factory_pattern);
                designPattern = al.get(getString(R.string.factoryPattern));
                break;
            case R.id.abstractFactoryPattern:
                title = getResources().getString(R.string.abstract_factory_pattern);
                designPattern = al.get(getString(R.string.abstractFactoryPattern));
                break;
            case R.id.singletonPattern:
                title = getResources().getString(R.string.singleton_pattern);
                designPattern = al.get(getString(R.string.singletonPattern));
                break;
            case R.id.prototypePattern:
                title = getResources().getString(R.string.prototype_pattern);
                designPattern = al.get(getString(R.string.prototpePattern));
                break;
            case R.id.builerPattern:
                title = getResources().getString(R.string.builder_pattern);
                designPattern = al.get(getString(R.string.builderPatterm));
                break;
            case R.id.adapterPattern:
                title = getResources().getString(R.string.adapter_pattern);
                designPattern = al.get(getString(R.string.adapterPattern));
                break;
            case R.id.bridgePattern:
                title = getResources().getString(R.string.bridge_pattern);
                designPattern = al.get(getString(R.string.bridgePattern));
                break;
            case R.id.compositePattern:
                title = getResources().getString(R.string.composite_pattern);
                designPattern = al.get(getString(R.string.compositePattern));
                break;
            case R.id.decoratorPattern:
                title = getResources().getString(R.string.decorator_pattern);
                designPattern = al.get(getString(R.string.decoratorPattern));
                break;
            case R.id.facadePattern:
                title = getResources().getString(R.string.facade_pattern);
                designPattern = al.get(getString(R.string.facadePattern));
                break;
            case R.id.flyweightPattern:
                title = getResources().getString(R.string.flyweight_pattern);
                designPattern = al.get(getString(R.string.flyweightPattern));
                break;
            case R.id.privateClassPattern:
                title = getResources().getString(R.string.private_class_pattern);
                designPattern = al.get(getString(R.string.privateClassPattern));
                break;
            case R.id.proxyPattern:
                title = getResources().getString(R.string.proxy_pattern);
                designPattern = al.get(getString(R.string.proxyPattern));
                break;
            case R.id.corPattern:
                title = getResources().getString(R.string.chain_of_responsibility_pattern);
                designPattern = al.get(getString(R.string.corePattern));
                break;
            case R.id.commandPattern:
                title = getResources().getString(R.string.command_pattern);
                designPattern = al.get(getString(R.string.commandPattern));
                break;
            case R.id.interpreterPattern:
                title = getResources().getString(R.string.interpreter_pattern);
                designPattern = al.get(getString(R.string.interpreterPattern));
                break;
            case R.id.iteratorPattern:
                title = getResources().getString(R.string.iterator_pattern);
                designPattern = al.get(getString(R.string.iteratorPattern));
                break;
            case R.id.mediatorPattern:
                title = getResources().getString(R.string.mediator_pattern);
                designPattern = al.get(getString(R.string.mediatorPattern));
                break;
            case R.id.mementoPattern:
                title = getResources().getString(R.string.memento_pattern);
                designPattern = al.get(getString(R.string.mementoPattern));
                break;
            case R.id.nullObjectPattern:
                title = getResources().getString(R.string.null_object_pattern);
                designPattern = al.get(getString(R.string.nullObjectPattern));
                break;
            case R.id.observerPattern:
                title = getResources().getString(R.string.observer_pattern);
                designPattern = al.get(getString(R.string.observerPattern));
                break;
            case R.id.statePattern:
                title = getResources().getString(R.string.state_pattern);
                designPattern = al.get(getString(R.string.statePattern));
                break;
            case R.id.strategyPattern:
                title = getResources().getString(R.string.strategy_pattern);
                designPattern = al.get(getString(R.string.strategyPattern));
                break;
            case R.id.templatePattern:
                title = getResources().getString(R.string.template_method);
                designPattern = al.get(getString(R.string.templatePattern));
                break;
            case R.id.visitorPattern:
                title = getResources().getString(R.string.visitor_pattern);
                designPattern = al.get(getString(R.string.visitorPattern));
                break;
       /* switch (viewId) {
            case R.id.nav_news:
                fragment = new NewsFragment();
                title  = "News";

                break;
            case R.id.nav_events:
                fragment = new EventsFragment();
                title = "Events";
                break;*/
            default:
                title = getResources().getString(R.string.singleton_pattern);
                designPattern = al.get("singletonPattern");
                break;

        }


        if (fragment != null) {
            Bundle bundle = new Bundle();
            bundle.putString("topic", title);
            bundle.putParcelable("data",designPattern);
            fragment.setArguments(bundle);
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.commit();
        }

        // set the toolbar title
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

    }
}
