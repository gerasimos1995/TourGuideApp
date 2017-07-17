package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Gerasimos on 10/7/2017.
 */

public class ProductsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_list);

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.mantolo),getString(R.string.sweetcandy),R.drawable.mantolato));
        items.add(new Item(getString(R.string.mantolato),getString(R.string.sweetcandy),R.drawable.mantolato2));
        items.add(new Item(getString(R.string.robola),getString(R.string.wine),R.drawable.robola_wine));
        items.add(new Item(getString(R.string.cephaloniabeer),getString(R.string.nothing),R.drawable.beer));
        items.add(new Item(getString(R.string.meatpie),getString(R.string.nothing),R.drawable.meat_pie));
        items.add(new Item(getString(R.string.feta),getString(R.string.cheese),R.drawable.feta));

        ItemAdapter itemsAdapter = new ItemAdapter(this, items,R.color.tan);

        ListView listView = (ListView) findViewById(R.id.items_list);

        listView.setAdapter(itemsAdapter);
    }
}
