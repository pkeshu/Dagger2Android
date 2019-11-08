package com.keshar.dagger2example.Dagger;

import com.keshar.dagger2example.Car.Driver;

import dagger.Module;
import dagger.Provides;


@Module
public abstract class DriverModule {

    @Provides
    static Driver provideDriver() {
        return new Driver();
    }
}
