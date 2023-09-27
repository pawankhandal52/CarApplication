package com.example.carapplication.di

import com.example.carapplication.car.Car
import com.example.carapplication.car.TATACar
import com.example.carapplication.engine.Engine
import com.example.carapplication.wheel.Wheel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CarModule {
    @Singleton
    @Provides
    fun getCar(engine: Engine,wheel: Wheel):Car{
        return TATACar(engine,wheel,wheel,wheel,wheel)
    }
}