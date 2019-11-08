package com.keshar.dagger2example.Car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engines {
    private static final String TAG = "Car";

    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@Named("horse power") int horsePower, @Named("engine capacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void onStart() {
        Log.d(TAG, "Petrol Engine is provided.."
                + "\nHorsePower::" + horsePower +
                "\nEngine Capacity::" + engineCapacity);
    }
}
