package com.keshar.dagger2example.Car;

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

    @Inject
    public void enabaledRemote(Remote remote) {
        remote.setOnListerner(this);
    }

    public void drive() {
        engines.onStart();
        Log.d(TAG, "driving: ....");
    }
}
