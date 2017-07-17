package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView beaches = (TextView) findViewById(R.id.beaches_text_view);

        // Set a click listener on that View
        beaches.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, BeachesActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        TextView museums = (TextView) findViewById(R.id.museums_text_view);

        // Set a click listener on that View
        museums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent museumsIntent = new Intent(MainActivity.this, MuseumsActivity.class);

                // Start the new activity
                startActivity(museumsIntent);
            }
        });

        TextView attractions = (TextView) findViewById(R.id.attractions_text_view);

        // Set a click listener on that View
        attractions.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent attractionsIntent = new Intent(MainActivity.this, ProductsActivity.class);

                // Start the new activity
                startActivity(attractionsIntent);
            }
        });

        TextView cities = (TextView) findViewById(R.id.cities_text_view);

        // Set a click listener on that View
        cities.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent citiesIntent = new Intent(MainActivity.this, CitiesActivity.class);

                // Start the new activity
                startActivity(citiesIntent);
            }
        });
    }
}
