package com.keshar.dagger2example.Dagger;


import com.keshar.dagger2example.Car.DiseleEngine;
import com.keshar.dagger2example.Car.Engines;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DisileEngineModule {

    private int hoursePower;

    public DisileEngineModule(int hoursePower) {
        this.hoursePower = hoursePower;
    }

    @Provides
    Engines provideDisele() {
        return new DiseleEngine(hoursePower);
    }
}
