package com.keshar.dagger2example.Dagger;

import com.keshar.dagger2example.Car.Rims;
import com.keshar.dagger2example.Car.Tires;
import com.keshar.dagger2example.Car.Wheel;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheel provideWheels(Rims rims, Tires tires) {
        return new Wheel(rims, tires);
    }
}
