package com.keshar.dagger2example;

import android.app.Application;

import com.keshar.dagger2example.Dagger.ActivityComponent;
import com.keshar.dagger2example.Dagger.AppComponent;
import com.keshar.dagger2example.Dagger.DaggerAppComponent;


public class ExampleApp extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public AppComponent getComponent() {
        return component;
    }
}
