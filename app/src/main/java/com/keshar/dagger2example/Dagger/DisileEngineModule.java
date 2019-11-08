package com.keshar.dagger2example.Dagger;


import com.keshar.dagger2example.Car.DiseleEngine;
import com.keshar.dagger2example.Car.Engines;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class DisileEngineModule {
    @Binds
    abstract Engines provideDisele(DiseleEngine diseleEngine);
}
