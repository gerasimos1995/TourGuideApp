package com.example.android.tourguideapp;

/**
 * Created by Gerasimos on 10/7/2017.
 */

public class Item{
    private String mLocation,mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Item(String mDescription,String mLocation,int mImageResourceId){
        this.mLocation = mLocation;
        this.mDescription = mDescription;
        this.mImageResourceId = mImageResourceId;
    }

    public String getmLocation() { return  mLocation; }

    public String getmDescription(){
        return mDescription;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        if (mImageResourceId == -1){
            return false;
        }else{
            return true;
        }
    }
}