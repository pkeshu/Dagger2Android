package com.keshar.dagger2example.Dagger;


import com.keshar.dagger2example.Car.Car;
import com.keshar.dagger2example.MainActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class, modules = {WheelModule.class, DisileEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void injet(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(
                @Named("horse power")
                        int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        Builder appComponent(AppComponent component);

        ActivityComponent build();
    }


}
