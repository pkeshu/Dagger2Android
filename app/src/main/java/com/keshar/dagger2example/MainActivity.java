package com.keshar.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.keshar.dagger2example.Car.Car;
import com.keshar.dagger2example.Dagger.ActivityComponent;
import com.keshar.dagger2example.Dagger.DaggerActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityComponent activityComponent = DaggerActivityComponent.builder().
                horsePower(120).
                engineCapacity(1400)
                .appComponent(((ExampleApp) getApplication()).getComponent())
                .build();
        activityComponent.injet(this);
//        car = activityComponent.getCar();

        car1.drive();
        car2.drive();
    }
}
