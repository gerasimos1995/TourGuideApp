package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Gerasimos on 10/7/2017.
 */

public class ItemAdapter extends ArrayAdapter<Item> {
    private int mColorResourceId;

    public ItemAdapter(Activity context, ArrayList<Item> word, int mColorResourceId){
        super(context, 0, word);
        this.mColorResourceId = mColorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView ==  null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        Item currentItem = getItem(position);

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_textview);

        descriptionTextView.setText(currentItem.getmDescription());

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_textview);

        locationTextView.setText(currentItem.getmLocation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentItem.hasImage()) {
            imageView.setImageResource(currentItem.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(),mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
