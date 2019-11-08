package com.keshar.dagger2example.Car;

import android.util.Log;

import javax.inject.Inject;

public class Tires {

    private static final String TAG = "Car";

    @Inject
    public Tires() {
    }

    public void inflate() {
        Log.d(TAG, "Tires Inflated..");
    }
}
