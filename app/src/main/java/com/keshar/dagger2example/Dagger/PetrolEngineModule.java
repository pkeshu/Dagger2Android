package com.keshar.dagger2example.Dagger;


import com.keshar.dagger2example.Car.Engines;
import com.keshar.dagger2example.Car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engines bindPetrolEngin(PetrolEngine petrolEngine);
}
