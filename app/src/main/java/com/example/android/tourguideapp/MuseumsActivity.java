package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;


import java.util.ArrayList;

/**
 * Created by Gerasimos on 10/7/2017.
 */

public class MuseumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_list);

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.ainos),getString(R.string.neartoainos),R.drawable.ainos_mountain));
        items.add(new Item(getString(R.string.monasteri),getString(R.string.neartomonasteri),R.drawable.aghios_gerasimos_monastery));
        items.add(new Item(getString(R.string.drogarati),getString(R.string.neartosami),R.drawable.drogarati_cave));
        items.add(new Item(getString(R.string.melissani),getString(R.string.neartosami),R.drawable.melisani_cave));
        items.add(new Item(getString(R.string.lighthouse),getString(R.string.neartolighhouse),R.drawable.lighthouse));

        ItemAdapter itemsAdapter = new ItemAdapter(this, items,R.color.tan);

        ListView listView = (ListView) findViewById(R.id.items_list);

        listView.setAdapter(itemsAdapter);
    }
}
