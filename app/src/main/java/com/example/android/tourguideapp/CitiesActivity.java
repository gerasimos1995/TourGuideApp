package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Gerasimos on 10/7/2017.
 */

public class CitiesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_list);

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.argostoli),getString(R.string.town),R.drawable.argostoli2));
        items.add(new Item(getString(R.string.lixouri),getString(R.string.town),R.drawable.lixouri));
        items.add(new Item(getString(R.string.fiskardo),getString(R.string.village),R.drawable.fiskardo_village));
        items.add(new Item(getString(R.string.poros),getString(R.string.port),R.drawable.poros));
        items.add(new Item(getString(R.string.sami),getString(R.string.port),R.drawable.sami));
        items.add(new Item(getString(R.string.euthimia),getString(R.string.village),R.drawable.aghia_euthimia));
        items.add(new Item(getString(R.string.assos),getString(R.string.village),R.drawable.assos));

        ItemAdapter itemsAdapter = new ItemAdapter(this, items,R.color.tan);

        ListView listView = (ListView) findViewById(R.id.items_list);

        listView.setAdapter(itemsAdapter);
    }
}
