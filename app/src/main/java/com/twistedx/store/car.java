package com.twistedx.store;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class car extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_car, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_create_order:
                String itemValue="Checkout";
                Toast.makeText(getApplicationContext(), itemValue, Toast.LENGTH_LONG).show();


                return true;
            case R.id.action_settings:
                String itemAalue="Setting";
                Toast.makeText(getApplicationContext(), itemAalue, Toast.LENGTH_LONG).show();
                return true;
            default:


        }

        return super.onOptionsItemSelected(item);



    }
}
