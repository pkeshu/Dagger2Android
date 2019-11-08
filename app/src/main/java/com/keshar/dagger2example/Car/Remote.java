package com.keshar.dagger2example.Car;

import android.util.Log;

import javax.inject.Inject;

class Remote {
    private static final String TAG = "Car";

    @Inject
    public Remote() {
    }

    public void setOnListerner(Car car) {
        Log.d(TAG, "setOnListerner: Remote Connected");
    }
}
