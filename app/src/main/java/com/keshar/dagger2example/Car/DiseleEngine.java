package com.keshar.dagger2example.Car;

import android.util.Log;

import javax.inject.Inject;

public class DiseleEngine implements Engines {
    private static final String TAG = "Car";

    private int horsePower;

    public DiseleEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void onStart() {
        Log.d(TAG, "Disele Engine is provided..! Hourse power is::" + horsePower);
    }
}
