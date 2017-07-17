package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Gerasimos on 10/7/2017.
 */

public class BeachesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_list);

        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.myrtos),getString(R.string.neartomyrtos),R.drawable.myrtos_beach));
        items.add(new Item(getString(R.string.petani),getString(R.string.neartopetani),R.drawable.petani_beach));
        items.add(new Item(getString(R.string.antisamos),getString(R.string.neartoantisamos),R.drawable.antisamos));
        items.add(new Item(getString(R.string.platiammos),getString(R.string.neartoplatiammos),R.drawable.platia_ammos_beach));
        items.add(new Item(getString(R.string.scala),getString(R.string.neartoscala),R.drawable.skala_beach));
        items.add(new Item(getString(R.string.makrisgialos),getString(R.string.neartomakrisgialos),R.drawable.makris_gialos_beach));
        items.add(new Item(getString(R.string.platisgialos),getString(R.string.neartoplatisgialos),R.drawable.platis_gialos_beach));
        items.add(new Item(getString(R.string.xi),getString(R.string.neartoxi),R.drawable.xi_beach));

        ItemAdapter itemsAdapter = new ItemAdapter(this, items,R.color.tan);

        ListView listView = (ListView) findViewById(R.id.items_list);

        listView.setAdapter(itemsAdapter);
    }
}
