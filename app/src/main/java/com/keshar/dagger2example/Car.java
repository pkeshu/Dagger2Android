package com.keshar.dagger2example;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    private Engines engines;
    private Wheel wheel;


    @Inject
    public Car(Engines engines, Wheel wheel) {
        this.engines = engines;
        this.wheel = wheel;
    }

    public void drive() {
        Log.d(TAG, "drive: ....");
    }
}
