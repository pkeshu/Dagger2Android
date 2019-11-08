package com.keshar.dagger2example.Dagger;


import com.keshar.dagger2example.Car.Car;
import com.keshar.dagger2example.MainActivity;

import dagger.Component;

@Component(modules = {WheelModule.class, DisileEngineModule.class})
public interface CarComponent {

    Car getCar();

    public void injet(MainActivity mainActivity);


}
