package com.keshar.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.keshar.dagger2example.Car.Car;
import com.keshar.dagger2example.Dagger.CarComponent;
import com.keshar.dagger2example.Dagger.DaggerCarComponent;
import com.keshar.dagger2example.Dagger.DisileEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.builder().
                disileEngineModule(new DisileEngineModule(100))

                .build();
        carComponent.injet(this);
//        car = carComponent.getCar();

        car.drive();
    }
}
