package com.twistedx.store;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;

public class SkyMallBetterVersion extends Activity implements
    OnItemClickListener {
    private ListView listView1;
    private ArrayAdapter<String> listAdapter1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sky_mall_better_version);
        listView1 = (ListView) findViewById(R.id.listView);
        String[] someItems = new String[]{"Butterfinger", "Cotton Candy", "Hersheys", "M&M", "Snickers",
                                          "Call of Duty", "Starwars BattleFront", "Pokemon", "Playstation4","Super Smash Bros",
                                          "Honda Civic", "G6","Isuzu","Gold Lambhorgini","Bullet Train",
                                          "Dell", "Iphone","Mineral Oil Pc","Super Computer","Thinkpad x200"};
        ArrayList<String> colorArrayList = new ArrayList<String>();
        colorArrayList.addAll(Arrays.asList(someItems));
        listAdapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, colorArrayList);
        listView1.setAdapter(listAdapter1);
        listView1.setOnItemClickListener(this);



    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int
            position, long id) {
        String itemValue = (String)
                listView1.getItemAtPosition(position);

        Intent intent = null;
        Log.i("SkyMallBetterVersion",itemValue);
        if (itemValue == "Honda Civic") {
            intent = new Intent(this, car.class);
        }

        if (itemValue == "G6") {
            intent = new Intent(this, g6.class);
        }

        if (itemValue == "Isuzu") {
            intent = new Intent(this, isuzu.class);
        }

        if (itemValue == "Gold Lambhorgini") {
            intent = new Intent(this, lambo.class);
        }

        if (itemValue == "Bullet Train") {
            intent = new Intent(this, shinkansen.class);
        }

        if (itemValue == "Dell") {
            intent = new Intent(this, dell.class);
        }

        if (itemValue == "Iphone") {
            intent = new Intent(this, ip.class);
        }

        if (itemValue == "Mineral Oil Pc") {
            intent = new Intent(this, Meneraloilpc.class);
        }

        if (itemValue == "Super Computer") {
            intent = new Intent(this, Superpc.class);
        }

        if (itemValue == "Thinkpad x200") {
            intent = new Intent(this, thinkpad.class);
        }

        if (itemValue == "Call of Duty") {
            intent = new Intent(this, Callofduty.class);
        }

        if (itemValue == "Starwars BattleFront") {
            intent = new Intent(this, Starwars.class);
        }

        if (itemValue == "Pokemon") {
            intent = new Intent(this, Pokemon1.class);
        }

        if (itemValue == "Playstation4") {
            intent = new Intent(this, Playstation4.class);
        }

        if (itemValue == "Super Smash Bros") {
            intent = new Intent(this, S_tores.class);
        }

        if (itemValue == "Butterfinger") {
            intent = new Intent(this, Butterfingers.class);
        }

        if (itemValue == "Cotton Candy") {
            intent = new Intent(this, Cottoncandy.class);
        }

        if (itemValue == "Hersheys") {
            intent = new Intent(this, Hershey.class);
        }

        if (itemValue == "M&M") {
            intent = new Intent(this, MM.class);
        }

        if (itemValue == "Snickers") {
            intent = new Intent(this, Snickers.class);
        }

        if (intent != null ) {
            startActivity(intent);
        }

        //Toast.makeText(getApplicationContext(), itemValue, Toast.LENGTH_LONG).show();
    }
}