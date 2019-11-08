package com.keshar.dagger2example.Car;

import android.util.Log;

import com.keshar.dagger2example.Dagger.PerActivity;

import javax.inject.Inject;
import javax.inject.Singleton;

@PerActivity
public class Car {

    private static final String TAG = "Car";

    private Engines engines;
    private Wheel wheel;
    private Driver driver;


    @Inject
    public Car(Engines engines, Wheel wheel, Driver driver) {
        this.driver = driver;
        this.engines = engines;
        this.wheel = wheel;
    }

    @Inject
    public void enabaledRemote(Remote remote) {
        remote.setOnListerner(this);
    }

    public void drive() {
        engines.onStart();
        Log.d(TAG, driver + " drives " + this);
    }
}
