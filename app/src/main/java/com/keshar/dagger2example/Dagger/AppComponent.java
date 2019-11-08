package com.keshar.dagger2example.Dagger;


import com.keshar.dagger2example.Car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    Driver getDriver();
}
