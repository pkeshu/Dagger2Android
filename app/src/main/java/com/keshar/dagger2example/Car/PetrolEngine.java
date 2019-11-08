package com.keshar.dagger2example.Car;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engines {
    private static final String TAG = "Car";

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void onStart() {
        Log.d(TAG, "Petrol Engine is provided..");
    }
}
